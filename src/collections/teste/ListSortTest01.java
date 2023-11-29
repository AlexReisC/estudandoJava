package collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {

	public static void main(String[] args) {
		List<String> mangas = new ArrayList<>(6);
		mangas.add("HunterxHunter");
		mangas.add("Attack on Titan");
		mangas.add("One Piece");
		mangas.add("One Punch Man");
		mangas.add("Daddy Issues");
		
		Collections.sort(mangas);
		System.out.println(mangas);
		
	}

}
