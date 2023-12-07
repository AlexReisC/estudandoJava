package generics.test;

import generics.dominio.Barco;
import generics.service.BarcoRentavelService;

public class ClassGenericaTest02 {

	public static void main(String[] args) {
		BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
		Barco barco = barcoRentavelService.buscarBarcoDisponivel();
		System.out.println("Usando barco por um mês..");
		barcoRentavelService.retornarBarcoAlugado(barco);

	}

}
