package br.com.cursojava.auxiliar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Lambdas (->)

public class Lambdas {

	private static List<Meios> numeros;
	
	public static void main(String[] args) {
		
		numeros = new ArrayList<Meios>();
		numeros.add(new Meios(4.5));
		numeros.add(new Meios(7.5));
		numeros.add(new Meios(1.5));
		numeros.add(new Meios(9.5));
		numeros.add(new Meios(0.5));
		numeros.add(new Meios(3.5));
		numeros.add(new Meios(6.5));
		numeros.add(new Meios(2.5));
		numeros.add(new Meios(5.5));
		numeros.add(new Meios(8.5));
		System.out.println(numeros);
		
		// Lambda
		numeros.sort((Meios meio0, Meios meio1) -> {
			return meio0.compareTo(meio1);
		});
		System.out.println(numeros);
		
		// reembaralhando
		Collections.shuffle(numeros);
		System.out.println("\n" + numeros);
		
		// Lambda enxuta
		numeros.sort((meio0, meio1) -> meio0.compareTo(meio1));
		System.out.println(numeros);
		
	}
	
}

class Meios implements Comparable<Meios> {
	
	Double valor;
	
	public Meios(Double valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Meios arg0) {
		return this.valor.compareTo(arg0.valor);
	}
	
	@Override
	public String toString() {
		return this.valor.toString();
	}
	
}