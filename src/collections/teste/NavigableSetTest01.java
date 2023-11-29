package collections.teste;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import collections.dominio.Manga;
import collections.dominio.Smartphone;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
	@Override
	public int compare(Smartphone o1, Smartphone o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}
}

class MangaPrecoComparator implements Comparator<Manga>{
	@Override
	public int compare(Manga o1, Manga o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}
}

public class NavigableSetTest01 {

	public static void main(String[] args) {
		NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
		Smartphone s = new Smartphone("123", "Nokia");
		set.add(s);
		
		NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
		mangas.add(new Manga(1L, "HunterxHunter", 19.99, 0));
		mangas.add(new Manga(3L, "Attack on Titan", 20.90, 5));
		mangas.add(new Manga(4L, "One Piece", 22.50, 0));
		mangas.add(new Manga(2L, "One Punch Man", 21.50, 2));
		mangas.add(new Manga(5L, "Daddy Issues", 19.0, 1));
		
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
		
		Manga abc = new Manga(13L, "xxxxxx", 20.90, 6);
		System.out.println("--------------");
		System.out.println("Preco imediatamente menor: " + mangas.lower(abc));
		System.out.println("Preco menor ou igual: " + mangas.floor(abc));
		System.out.println("Preco imediantamente maior: " + mangas.higher(abc));
		System.out.println("Preco maior ou igual: " + mangas.ceiling(abc));
		System.out.println(mangas.size());
		System.out.println("Retorna e remove o elemento do incio: " + mangas.pollFirst());
		System.out.println("Retorna e remove o elemento do final" + mangas.pollLast());
		
	}

}
