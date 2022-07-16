package br.com.cursojava.auxiliar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Classes_Anonimas {

	private static List<Integer> numeros;

	public static void main(String[] args) {

		numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(3);
		numeros.add(1);
		numeros.add(6);
		numeros.add(2);
		numeros.add(7);
		numeros.add(4);
		numeros.add(8);
		numeros.add(5);
		numeros.add(9);
		System.out.println(numeros);

		// classe anonima
		numeros.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0 - arg1;
			}

		});
		System.out.println(numeros);
		System.out.println();

		// reembaralhando
		Collections.shuffle(numeros);
		System.out.println(numeros);
		
		// nova classe anonima (forma extensa)
		Comparator<Integer> compara = new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0 - arg1;
			}
		};
		numeros.sort(compara);
		System.out.println(numeros);
		
	}

}
