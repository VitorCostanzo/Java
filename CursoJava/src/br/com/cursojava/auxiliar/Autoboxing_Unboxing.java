package br.com.cursojava.auxiliar;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing_Unboxing {
// Transformação automatica de primitivos em objetos

	public static void main(String[] args) {

		// Coleções nao aceitam tipos primitivos, somente referencias de objetos
		// List<int> numeros = new ArrayList<int>(); // -> não compila
		List<Integer> numeros = new ArrayList<Integer>();

		// Autoboxing
		// O Java automaticamente transforma os primitivos em objetos aqui
		// Integer.valueOf(int x)
		// E adiciona as referencias à coleção
		int num1 = 13;
		numeros.add(num1);
		numeros.add(25);

		// Unboxing é o processo inverso
		// Quando necessario o Java tambem converte de Object para primitivo

	}

}
