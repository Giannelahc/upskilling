package ex1.collections.tree;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainTree {

	public static void main(String[] args) {
		//Añadir comparable en TreeSet si Persona no extiende de Comparable
		TreeSet<Persona> treeSet 
				= new TreeSet<>((persona1, persona2) -> 
						Integer.compare(persona1.getId(), persona2.getId()));
		
		treeSet.add(new Persona(1));
		treeSet.add(new Persona(4));
		treeSet.add(new Persona(6));
		treeSet.add(new Persona(7));
		
		treeSet.forEach(System.out::println);
		
		
		//No acepta keys duplicados
		TreeMap<Integer, Persona> treeMap = new TreeMap<>();
		
		treeMap.put(5, new Persona(1));
		treeMap.put(8, new Persona(9));
		treeMap.put(6, new Persona(7));
		treeMap.put(7, new Persona(6));
		
		System.out.println(treeMap.higherKey(6));//mayor valor del especificado
		System.out.println(treeMap.ceilingKey(4));//menor valor del número mayor al especificado
		System.out.println(treeMap.containsKey(6));//menor valor del número mayor al especificado
		System.out.println(treeMap.comparator());//menor valor del número mayor al especificado
		
		for(Entry<Integer, Persona> entry: treeMap.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue().toString());
		}
		
		
		
		//No acepta keys duplicados, en el key si va un objeto, debe ir el comparable
		TreeMap<Persona, String> treeMap2 
				= new TreeMap<>((persona1, persona2) -> 
						Integer.compare(persona1.getId(), persona2.getId()));
		
		treeMap2.put(new Persona(10), "A");
		treeMap2.put(new Persona(11), "B");
		
		System.out.println(treeMap2.containsKey(new Persona(11)));
		
		for(Entry<Persona, String> entry: treeMap2.entrySet()) {
			System.out.println(entry.getKey().toString() + entry.getValue());
		}
	}
}
