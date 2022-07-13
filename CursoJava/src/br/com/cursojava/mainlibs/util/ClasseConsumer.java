package br.com.cursojava.mainlibs.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClasseConsumer {

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
		numeros.forEach((num) -> System.out.print(num.getValor() + " "));
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