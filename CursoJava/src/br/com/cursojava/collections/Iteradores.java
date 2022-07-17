package br.com.cursojava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteradores {

	private static Set<String> nomes;

	public static void main(String[] args) {

		nomes = new HashSet<String>();
		nomes.add("Mario");
		nomes.add("Luigi");
		nomes.add("Bowser");
		nomes.add("Donkey Kong");
		nomes.add("Princess Peach");
		nomes.add("Baby Yoshi");

		// toda coleção tem iterator
		Iterator<String> iterador = nomes.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}
