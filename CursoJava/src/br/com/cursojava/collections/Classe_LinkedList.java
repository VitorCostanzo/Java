package br.com.cursojava.collections;

import java.util.LinkedList;

public class Classe_LinkedList {
// Lista em que os elementos são interligados com o anterior e proximo, facilitando organização, remoção e adição
// não recomendado para iteração

	public static void main(String[] args) {
		
		LinkedList<String> lista = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			lista.add("item " + (i + 1));
		}
		
		lista.remove("item 5");
		lista.remove("item 9");
		
		System.out.println(lista);
	}
	
}
