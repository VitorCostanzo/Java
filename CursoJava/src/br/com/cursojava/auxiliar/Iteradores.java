package br.com.cursojava.auxiliar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteradores {

	private static List<String> nomes;
	
	public static void main(String[] args) {
		
		nomes = new ArrayList<String>();
		nomes.add("Mario");
		nomes.add("Luigi");
		nomes.add("Bowser");
		nomes.add("Donkey Kong");
		nomes.add("Princess Peach");
		nomes.add("Baby Yoshi");
		
		Iterator<String> iterador = nomes.iterator();
		
		while (iterador.hasNext()) {
			System.out.print(iterador.next() + " - ");
		}
		
		
		while (nomes.iterator().hasNext()) {
			System.out.print(nomes.iterator().next() + " - ");
		}
	}
	
}
