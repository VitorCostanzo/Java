package br.com.cursojava.mainlibs.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FunctionObjects {

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
		
		numeros.sort(new OrdemNatural());
		System.out.println(numeros);
	}
	
}


// Classe criada somente para utilização do metodo compare
// Resolver com classes Anonimas
class OrdemNatural implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg0 - arg1;
	}
}
