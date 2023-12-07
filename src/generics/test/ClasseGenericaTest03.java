package generics.test;

import java.util.ArrayList;
import java.util.List;

import generics.dominio.Barco;
import generics.dominio.Carro;
import generics.service.RentalService;

public class ClasseGenericaTest03 {

	public static void main(String[] args) {
		List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
		List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
		RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
		Carro carro = rentalService.buscarObjetoDisponivel();
		System.out.println("Usando carro por um mês..");
		rentalService.retornarObejtoAlugado(carro);
		
		System.out.println("---------------");
		
		RentalService<Barco> rentalServiceBarco = new RentalService(barcosDisponiveis);
		Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
		System.out.println("Usando barco por um mês..");
		rentalServiceBarco.retornarObejtoAlugado(barco);
	}
	

}
