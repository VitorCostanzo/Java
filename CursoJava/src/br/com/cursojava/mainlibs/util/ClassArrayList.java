package br.com.cursojava.mainlibs.util;

import java.util.ArrayList;
import java.util.List;

public class ClassArrayList {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();
		System.out.println(lista);
		for (int i = 0; i < 10; i++) {
			lista.add("item " + (i + 1));
		}

		lista.remove("item 4");
		lista.remove("item 5");

		for (String item : lista) {
			if (item.equals("item 10")) {
				System.out.print(item + ".");
			} else {
				System.out.print(item + ", ");
			}
		}

		// sublista de uma arraylist
		List<String> subLista = lista.subList(3, 6);
		System.out.println("\n" + subLista);

	}

}
