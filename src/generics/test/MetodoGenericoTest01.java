package generics.test;

import java.util.ArrayList;
import java.util.List;

import generics.dominio.Barco;

public class MetodoGenericoTest01 {

	public static void main(String[] args) {
		List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa furada"));
		System.out.println(barcoList);
	}
	private static <T> List<T> criarArrayComUmObjeto(T t) { // metodo generico 'privacidade tipo retorno e nome 
		return List.of(t);	
	}
	// private static <T extends Comparable<T>> List<T> criarArrayComUmObjeto(T t){}
}
