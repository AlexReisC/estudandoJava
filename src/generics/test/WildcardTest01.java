package generics.test;

import java.util.List;

abstract class Animal{
	public abstract void consulta();
}

class Cachorro extends Animal{
	@Override
	public void consulta() {
		System.out.println("consultando cachorro");
	}
}

class Gato extends Animal{
	@Override
	public void consulta() {
		System.out.println("consultando gato");
		
	}
}

public class WildcardTest01 {

	public static void main(String[] args) {
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());
		printConsulta(cachorros);
		printConsulta(gatos);
	}
	
	private static void printConsulta(List<? extends Animal> animals) { //recebe qualquer Animal ou filho de Animal, nao aeita adicionar elementos, apenas lê
		Animal a = new Cachorro();
		Animal b = new Gato();
		for(Animal animal : animals) {
			animal.consulta();
		}
	}
	
	private static void printConsultaAnimal(List<? super Animal> animals) { // recebe um Animal ou pai de Animal(Object), aceita adicionar elementos
		Animal animal = new Cachorro();
		Animal animal2 = new Gato();
		animals.add(animal);
		animals.add(animal2);
	}

}
