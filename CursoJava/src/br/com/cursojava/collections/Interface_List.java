package br.com.cursojava.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Arrays;

@SuppressWarnings("unused")
public class Interface_List {

	public static void main(String[] args) {

		// List é uma interface
		List<Boolean> tabVerdade = new ArrayList<Boolean>();
		List<Integer> numeros = new LinkedList<Integer>();
		List<String> palavras = new Vector<String>();

		// de array para lista
		String[] nomes = { "Vitor", "Lara", "Rosi", "Zakk", "Ozzy", "Sansão" };
		List<String> nomesLista = Arrays.asList(nomes);
		
		// Factory method para coleções
		List<String> cordas = List.of("Mi", "Lá", "Ré", "Sol", "Si", "Mi");
		cordas.forEach(c -> System.out.print(c));

	}
}
