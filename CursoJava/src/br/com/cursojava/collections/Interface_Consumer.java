package br.com.cursojava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Interface_Consumer {

	private static List<NumerosInteiros> numeros;
	
	public static void main(String[] args) {
		
		numeros = new ArrayList<NumerosInteiros>();
		for (int i = 1; i <= 10; i++) {
			numeros.add(new NumerosInteiros(i));
		}
		
		// Lambda Consumer p/ forEach
		numeros.forEach(new Consumer<NumerosInteiros>() {
			@Override
			public void accept(NumerosInteiros num) {
				System.out.print(num.getValor() + " ");
			}
		});
		System.out.println();
	
		// Lambda Consumer enxuta p/ forEach
		numeros.forEach( num -> System.out.print(num.getValor() + " "));
		System.out.println();
		
		// Lambdas podem ser consumers
		Consumer<NumerosInteiros> consumer = n -> System.out.print(n.getValor() + " ");
		numeros.forEach(consumer);
	}
}

class NumerosInteiros {
	private int valor;
	
	public NumerosInteiros(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}