package collections.teste;

import java.util.HashSet;
import java.util.Set;
import collections.dominio.Manga;

public class SetTest01 {

	public static void main(String[] args) {
		Set<Manga> mangas = new HashSet<>();
		mangas.add(new Manga(1L, "HunterxHunter", 19.99, 0));
		mangas.add(new Manga(3L, "Attack on Titan", 20.90, 5));
		mangas.add(new Manga(4L, "One Piece", 22.50, 0));
		mangas.add(new Manga(2L, "One Punch Man", 21.50, 2));
		mangas.add(new Manga(5L, "Daddy Issues", 20.0, 1));
		mangas.add(new Manga(5L, "Daddy Issues", 20.5, 1));
		for (Manga manga : mangas) {
			System.out.println(manga);
		}
	}

}
