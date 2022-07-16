package br.com.cursojava.mainlibs.lang;

import br.com.cursojava.oop.filhos.ContaCorrente;
import br.com.cursojava.oop.filhos.ContaPoupanca;

// Tudas as classes herdam Object automaticamente
public class Classe_Object {

	public static void main(String[] args) {
		
		log(11.0);
		log();
		ContaCorrente cc = new ContaCorrente(null);
		ContaPoupanca cp = new ContaPoupanca(null);
		
		// metodo toString da classe Object sobrescrito 
		log(cc); // Conta tem @Override no toString
		log(cp); // Conta tem @Override no toString
		
	}
	
	static void log(Object o) {
		System.out.println(o);
	}
	
	static void log() {
		System.out.println();
	}
	
}