package br.com.cursojava.auxiliar;

import java.util.Locale;

public class Formatacao_String {

	public static void main(String[] args) {

		String produto = "Notebook Dell";
		log(String.format("%s", produto));

		double preco = 4000.00;
		log(String.format(new Locale("pt", "BR"), "Preço: R$ %.2f", preco));

		double serie = 768.34;
		log(String.format("Série: %09.4f", serie));

	}

	public static void log(String syso) {
		System.out.println(syso);
	}

	public static void log() {
		System.out.println();
	}
}
