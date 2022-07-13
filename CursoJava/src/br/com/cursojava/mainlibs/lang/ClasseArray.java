package br.com.cursojava.mainlibs.lang;

import java.util.Date;

import br.com.cursojava.oop.filhos.ContaCorrente;

public class ClasseArray {

	public static void main(String[] args) {
		

		// array de tipos primitivos
		int[] idades = new int[5];

		for (int i = 0; i < idades.length; i++) {

			idades[i] = i * 5;

		}

		for (int idade : idades) {
			log("idade: " + idade);
		}

		// array de referencias
		Object[] objarray = new Object[5];
		log();

		objarray[0] = "Olá";
		objarray[1] = 13.5;
		objarray[2] = true;
		objarray[3] = new ContaCorrente(null);
		objarray[4] = new Date(1343003495l);

		for (Object object : objarray) {
			log(object);
		}

		// outra sintaxe
		Object[] novarray = { "Texto", true, 13.8, 23, new ContaCorrente(null) };
		log();
		for (Object object : novarray) {
			log(object);
		}
		
		//casting
		String casting = (String) novarray[0];
		log("\nCasting: " + casting);

	}

	private static void log(Object x) {
		System.out.println(x);
	}

	private static void log() {
		System.out.println();
	}

}
