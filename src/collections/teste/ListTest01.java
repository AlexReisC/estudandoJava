package collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>(); // 1.5
		// O recomendado é usar a interface para entao atribuir o objeto, o tipo da lista entre <> deve ser um obejto (Integer, Double, ...)
		// é possivel passar o tamanho inical do arraylist no ()
		nomes.add("Alex");
		nomes.add("Reis");
		nomes.add("Cavalcante");
		
		List<String> nomes2 = new ArrayList<>();
		nomes2.add("Abraham Lincon");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.addAll(nomes2);
		nomes.remove("Cavalcante");
		System.out.println(nomes);
		
		System.out.println("------");
		Collections.sort(nomes);
		System.out.println(nomes);
		
		System.out.println(nomes.contains("Cavalcante"));
		
	}

}
