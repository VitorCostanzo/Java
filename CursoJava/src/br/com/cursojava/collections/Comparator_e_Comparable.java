package br.com.cursojava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_e_Comparable {
	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Vitor", 26));
		pessoas.add(new Pessoa("Rosi", 55));
		pessoas.add(new Pessoa("Lara", 13));
		pessoas.add(new Pessoa("Caio", 28));
		
		// para ordenar a partir do collections, precisamos passar um comparable(interface)
		Collections.sort(pessoas); // Collections.sort(Camparable)
		System.out.println("Do mais novo para o mais velho:");
		pessoas.forEach(pessoa -> System.out.println(pessoa.nome));
		
		// pessoas.sort(Comparator)
		pessoas.sort(new DoMaisVelho());
		System.out.println("Do mais velho para o mais novo:");
		pessoas.forEach(pessoa -> System.out.println(pessoa.nome));
		
		// pessoas.sort(null) -> utiliza o compareTo da Comparable Pessoa
		pessoas.sort(null);
		System.out.println("Do mais novo para o mais velho denovo:");
		pessoas.forEach(pessoa -> System.out.println(pessoa.nome));
		
	}
}

class Pessoa implements Comparable<Pessoa> {

	String nome;
	Integer idade;

	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa outra) {
		return this.idade.compareTo(outra.idade);
	}

}

class DoMaisVelho implements Comparator<Pessoa>{
	@Override
	public int compare(Pessoa p0, Pessoa p1) {
		return p1.idade - p0.idade;
	}
}

