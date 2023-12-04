package collections.teste;

import java.util.PriorityQueue;
import java.util.Queue;

import collections.dominio.Manga;

public class QueueTest02 {

	public static void main(String[] args) {
		Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
		mangas.add(new Manga(1L, "HunterxHunter", 19.99));
		mangas.add(new Manga(3L, "Attack on Titan", 20.99));
		mangas.add(new Manga(4L, "One Piece", 22.50));
		mangas.add(new Manga(2L, "One Punch Man", 21.50));
		mangas.add(new Manga(5L, "Daddy Issues", 20.0));
		
		while(!mangas.isEmpty()) {
			System.out.println(mangas.poll());
		}
		
	}
}
