package br.com.cursojava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Classe_ArrayList {

	public static void main(String[] args) {

		// preenchendo lista
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			lista.add("item" + (i + 1));
		}
		// removendo items
		lista.remove(0);
		lista.remove("item5");
		
		// iterando com foreach
		for (String item : lista) {
			if (item.equals("item9")) {
				System.out.print(item + ".\n");
			} else {
				System.out.print(item + ", ");
			}
		}

		// metodos da classe Collections
		Collections.shuffle(lista);
		
		// buscando elemento
		String firstItem = lista.get(0);
		System.out.println(firstItem);
		
		// iteração nao recomendada
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " - ");
		}
		System.out.println();
		
		// sublista de uma arraylist
		List<String> subLista = lista.subList(3, 6);
		System.out.println(subLista);
		
		// iteração com lambda
		lista.forEach(item -> {
			System.out.print(item.toLowerCase());
			System.out.print(item.toUpperCase());
		});
		System.out.println();
		lista.forEach(item -> System.out.print(item + " "));

		// ordenando lista
		System.out.println();
		Collections.sort(lista);
		System.out.println(lista);
		
		lista.sort(new Inversa());
		System.out.println(lista);
	}

}

class Inversa implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {

		return arg1.compareToIgnoreCase(arg0);
	}
}