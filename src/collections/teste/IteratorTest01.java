package collections.teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collections.dominio.Manga;

public class IteratorTest01 {

	public static void main(String[] args) {
		List<Manga> mangas = new ArrayList<>(6);
		mangas.add(new Manga(1L, "HunterxHunter", 19.99, 0));
		mangas.add(new Manga(3L, "Attack on Titan", 20.90, 5));
		mangas.add(new Manga(4L, "One Piece", 22.50, 0));
		mangas.add(new Manga(2L, "One Punch Man", 21.50, 2));
		mangas.add(new Manga(5L, "Daddy Issues", 20.0, 1));
		
		Iterator<Manga> mangaIterator= mangas.iterator();
		while(mangaIterator.hasNext()) {
			Manga manga = mangaIterator.next();
			if(manga.getQuantidade() == 0) {
				mangaIterator.remove();
			}
		}
		
//		mangas.removeIf(manga -> manga.getQuantidade() == 0);
//		System.out.println(mangas);
	}

}
