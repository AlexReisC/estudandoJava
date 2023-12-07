package generics.service;

import java.util.ArrayList;
import java.util.List;

import generics.dominio.Carro;

public class CarroRentavelService {
	private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
	
	public Carro buscarCarroDisponivel() {
		System.out.println("Buscando carro disponivel...");
		Carro c = carrosDisponiveis.remove(0);
		System.out.println("Alugando carro: " + c);
		System.out.println("Carros disponiveis para alugar: ");
		System.out.println(carrosDisponiveis);
		return c;
	}
	
	public void retornarCarroAlugado(Carro carro) {
		System.out.println("Devolvendo carro " + carro);
		carrosDisponiveis.add(carro);
		System.out.println("Carros disponiveis para alugar");
		System.out.println(carrosDisponiveis);
	}
}
