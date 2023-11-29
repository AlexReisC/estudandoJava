package collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collections.dominio.Manga;

class MangaByIdComparator implements Comparator<Manga> {

	@Override
	public int compare(Manga o1, Manga o2) {
		return o1.getId().compareTo(o2.getId());
	}
	
}

public class MangaSortTest01 {

	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);
		mangas.add(new Manga(1L, "HunterxHunter", 19.99));
		mangas.add(new Manga(3L, "Attack on Titan", 20.90));
		mangas.add(new Manga(4L, "One Piece", 22.50));
		mangas.add(new Manga(2L, "One Punch Man", 21.50));
		mangas.add(new Manga(5L, "Daddy Issues", 20.0));
		System.out.println(mangas);
		
		Collections.sort(mangas);
		System.out.println("----------\n" + mangas);
		
//		Collections.sort(mangas, new MangaByIdComparator());
		mangas.sort(new MangaByIdComparator());
		System.out.println("----------\n" + mangas);
	}

}
