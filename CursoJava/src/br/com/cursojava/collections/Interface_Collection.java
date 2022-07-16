package br.com.cursojava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Interface_Collection {
//implementada pelas classes e interfaces de coleções de dados (List, ArrayList, LinkedList, Vector, Set, HashSet)

	public static void main(String[] args) {
		
		// não ordenavel
		Set<String> nomes = new HashSet<String>();
		nomes.add("Joseph");
		nomes.add("Velociraptor");
		nomes.add("Antedeguemon");
		nomes.add("Bete Balanço");
		
		// ordenavel
		List<String> nomes2 = new ArrayList<String>(nomes);
		Collections.sort(nomes2);
		System.out.println(nomes2);
	}

}
