package collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collections.dominio.Manga;

public class BinarySearchTest02 {

	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);
		mangas.add(new Manga(1L, "HunterxHunter", 19.99));
		mangas.add(new Manga(3L, "Attack on Titan", 20.90));
		mangas.add(new Manga(4L, "One Piece", 22.50));
		mangas.add(new Manga(2L, "One Punch Man", 21.50));
		mangas.add(new Manga(5L, "Daddy Issues", 20.0));
		
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
		Collections.sort(mangas);
		
		Manga mangaToSearch = new Manga(4L, "One Piece", 22.50);
		System.out.println(Collections.binarySearch(mangas, mangaToSearch));
	}

}
