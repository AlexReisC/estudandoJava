package generics.service;

import java.util.ArrayList;
import java.util.List;

import generics.dominio.Barco;

public class BarcoRentavelService {
	List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
	
	public Barco buscarBarcoDisponivel() {
		System.out.println("Buscando barco disponivel...");
		Barco c = barcosDisponiveis.remove(0);
		System.out.println("Alugando barco: " + c);
		System.out.println("Barcos disponiveis para alugar: ");
		System.out.println(barcosDisponiveis);
		return c;
	}
	
	public void retornarBarcoAlugado(Barco barco) {
		System.out.println("Devolvendo barco " + barco);
		barcosDisponiveis.add(barco);
		System.out.println("Barcos disponiveis para alugar");
		System.out.println(barcosDisponiveis);
	}
}
