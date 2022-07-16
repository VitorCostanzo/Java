package br.com.cursojava.mainlibs.lang;

import java.util.ArrayList;

public class Classes_Numericas {

	public static void main(String[] args) {
		
		Integer x = Integer.valueOf(25);
		System.out.println(x);
		
		// Conversoes (Parsing) 
		String numString = "13";
		Integer numInteger = Integer.valueOf(numString);
		int numInt = Integer.parseInt(numString);
		System.out.println(numInt + numInteger);
		
		// metodos estaticos
		System.out.println(Integer.MAX_VALUE); // valor
		System.out.println(Integer.SIZE); // bytes
		System.out.println(Integer.sum(25, 15));
		
		ArrayList<Number> numeros = new ArrayList<Number>();
		numeros.add(15);
		numeros.add(44.7);
		numeros.add(1500l);
		numeros.add(4000f);
		
		// Metodos semelhantes para double, float, long, short...
		
	}
	
}
