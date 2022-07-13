package br.com.cursojava.mainlibs.util;

import java.util.ArrayList;
import java.util.HashSet;

public class ClassHashSet {
// não permite duplicatas
// HashSet implements Set
// Set implements Collection

	public static void main(String[] args) {

		// obs: sets não são sequencias, não possuem indice nem metodo get();
		HashSet<String> semDuplicata = new HashSet<String>();
		semDuplicata.add("Galinha");
		semDuplicata.add("Galinha");
		semDuplicata.add("Ovo");
		semDuplicata.add("Ovo");

		System.out.println(semDuplicata);

		// Para demonstração
		ArrayList<String> comDuplicata = new ArrayList<String>();
		comDuplicata.add("Galinha");
		comDuplicata.add("Galinha");
		comDuplicata.add("Ovo");
		comDuplicata.add("Ovo");

		System.out.println(comDuplicata);

	}

}
