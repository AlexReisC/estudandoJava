package classesInternas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import generics.dominio.Barco;

public class AnonymousClassesTest02 {

	public static void main(String[] args) {
		List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Navio"), new Barco("Cruzeiro")));
		barcoList.sort(new Comparator<Barco>() { // cria uma classe anonima que implementa o Comparator
			@Override
			public int compare(Barco o1, Barco o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		System.out.println(barcoList);
	}

}
