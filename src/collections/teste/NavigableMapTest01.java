package collections.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import collections.dominio.Consumidor;

public class NavigableMapTest01 {

	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Sibalena");
		Consumidor consumidor2 = new Consumidor("Shinerai");
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("A", "Letra A");
		map.put("D", "Letra D");
		map.put("C", "Letra C");
		map.put("B", "Letra B");
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		System.out.println(map.headMap("C", true));
		System.out.println(map.ceilingKey("C"));
		System.out.println(map.higherKey("C"));
		
	}
}
