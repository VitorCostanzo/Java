package br.com.cursojava.mainlibs.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenandoListas {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(15);
		numeros.add(5);
		numeros.add(45);
		numeros.add(35);
		numeros.add(25);
		System.out.println(numeros);
		// instanciando antes de usar
		Comparator<Integer> comparanumeros = new Ordenacao();
		numeros.sort(comparanumeros);
		System.out.println(numeros);

		
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("Andre");
		nomes.add("Junior");
		nomes.add("Ana");
		nomes.add("Ana Julia");
		nomes.add("Beth");
		nomes.add("Beto");
		nomes.add("Julio");
		System.out.println(nomes);
		// instanciando somente para uso
		nomes.sort(new Alfabetica());
		System.out.println(nomes);

	}

}

// Definindo o metodo de comparação
class Ordenacao implements Comparator<Integer> {
	@Override
	public int compare(Integer arg0, Integer arg1) {
		return Integer.compare(arg0, arg1);
// ou		
//		return arg0 - arg1;
// ou		
//		if (arg0 > arg1) {
//			return 1;
//		}
//		if (arg1 > arg0) {
//			return -1;
//		}
//		return 0;
	}

}

class Alfabetica implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {

		return arg0.compareToIgnoreCase(arg1);
	}
}
