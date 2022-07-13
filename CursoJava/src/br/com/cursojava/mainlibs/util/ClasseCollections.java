package br.com.cursojava.mainlibs.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClasseCollections {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Vitor", "Costanzo", 96.5, 26));
		pessoas.add(new Pessoa("Caio", "Costanzo", 125.4, 28));
		pessoas.add(new Pessoa("Lara", "Cordeiro", 55, 13));
		pessoas.add(new Pessoa("Rosi", "Cordeiro", 78, 55));
		pessoas.add(new Pessoa("Zakk", "Wilde", 18.3, 4));
		pessoas.add(new Pessoa("Ozzy", "Osbourne", 8, 6));
		pessoas.add(new Pessoa("Sansao", "Veio", 5, 18));

		// para ordenar a partir do collections, precisamos passar um
		// comparable(interface)
		Collections.sort(pessoas);

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.nome + " " + pessoa.sobreNome + ", idade: " + pessoa.idade + ", peso: "
					+ pessoa.peso + "Kg.");
		}

		// obs:
		// pessoas.sort(null);
		// pode ser usado agora que Pessoa é comparable
		// sort espera Comparator, quando passamos null, utiliza o compareTo da classe
		// que o invocou

	}

}

// implementando a interface comparable
class Pessoa implements Comparable<Pessoa> {
	String nome;
	String sobreNome;
	double peso;
	int idade;

	public Pessoa(String nome, String sobreNome, double peso, int idade) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.peso = peso;
		this.idade = idade;
	}

	// definindo criterio do metodo compareTo
	@Override
	public int compareTo(Pessoa outra) {
		return this.nome.compareTo(outra.nome); // este compareTo é chamado da classe String
	}

}
