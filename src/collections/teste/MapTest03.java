package collections.teste;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import collections.dominio.Consumidor;
import collections.dominio.Manga;

public class MapTest03 {

	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Sibalena");
		Consumidor consumidor2 = new Consumidor("Shinerai");
		System.out.println(consumidor1);
		
		Manga manga1 = new Manga(1L, "HunterxHunter", 19.99);
		Manga manga2 = new Manga(3L, "Attack on Titan", 20.90);
		Manga manga3 = new Manga(4L, "One Piece", 22.50);
		Manga manga4 = new Manga(2L, "One Punch Man", 21.50);
		Manga manga5 = new Manga(5L, "Daddy Issues", 20.0);
		
		List<Manga> mangaConsumidorList = List.of(manga1, manga2, manga3);
		List<Manga> mangaConsumidorList2 = List.of(manga3, manga4);
		Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
		consumidorMangaMap.put(consumidor1, mangaConsumidorList);
		consumidorMangaMap.put(consumidor2, mangaConsumidorList2);
		
		for(Map.Entry<Consumidor, List<Manga>> entry: consumidorMangaMap.entrySet()) {
			System.out.println("---" + entry.getKey().getName());
			for (Manga manga : entry.getValue()) {
				System.out.println("------" + manga.getNome());
			}
		}

	}

}
