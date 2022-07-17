package br.com.cursojava.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Classe_TreeSet {

	public static void main(String[] args) {
		
		// TreeSets só aceitam comparables, senão devemos passar um comparator no construtor
		// TreeSets mantém a ordem de adição dos elementos e nao permitem repetições
		
		Set<Alimento> alimentos = new TreeSet<>(new ComparaNomesAlimentos());
		alimentos.add(new Alimento("Ovo", "3 meses"));
		
		// ou
		
		Set<Comida> comidas = new TreeSet<>();
		comidas.add(new Comida("Frango", "1 semana"));
	}
	
}

class Alimento {
	private String nome;
	private String validade;

	public Alimento(String nome, String validade) {
		this.nome = nome;
		this.validade = validade;
	}

	public String getNome() {
		return this.nome;
	}
}

class Comida implements Comparable<Comida> {
	private String nome;
	private String validade;

	public Comida(String nome, String validade) {
		this.nome = nome;
		this.validade = validade;
	}

	@Override
	public int compareTo(Comida outra) {
		return this.nome.compareTo(outra.nome);
	}

}

class ComparaNomesAlimentos implements Comparator<Alimento> {

	@Override
	public int compare(Alimento a, Alimento b) {
		return a.getNome().compareTo(b.getNome());
	}

}