package ex1.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainList {

	public static void main(String[] args) {
		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("1");
		listaNombres.add("2");
		listaNombres.add("3");
		listaNombres.forEach(System.out::println);
		
		LinkedList<String> listaLinked = new LinkedList<String>();
		listaLinked.add("1");
		listaLinked.addLast("3");
		listaLinked.add("2");
		listaLinked.addFirst("1.1");
		listaLinked.addAll(2, listaNombres);
		
		//listaLinked.removeLastOccurrence("1");
		listaLinked.set(0, "1.2");
		listaLinked.forEach(System.out::println);
	}

}
