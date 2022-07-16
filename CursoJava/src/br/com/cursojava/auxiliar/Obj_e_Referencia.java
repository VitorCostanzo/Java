package br.com.cursojava.auxiliar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Obj_e_Referencia {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções Java");
		List<Aula> aulas = javaColecoes.getAulas(); // -> apontam para a mesma referencia
		aulas.add(new Aula("Objeto e referencia", 15));
		aulas.add(new Aula("Trabalhando com ArrayLists", 21));
		System.out.println("Aulas: ");
		javaColecoes.getAulas().forEach(aula -> System.out.println(aula));
		
		
		System.out.println();
		if (javaColecoes.getAulas().hashCode() == aulas.hashCode()) {
			System.out.println("aulas e javaColecoes.getAulas() apontam para o mesmo Objeto");
			System.out.println(aulas == javaColecoes.getAulas());
		}
		System.out.println();
		
		// boas práticas -> metodo adiciona para diminuir o tamanho codigo
		javaColecoes.adicionaAula(new Aula("Criando métodos", 13));
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println();
		javaColecoes.adicionaInstrutor("Vitor C C");
		javaColecoes.adicionaInstrutor("Caio C C");
		javaColecoes.adicionaInstrutor("Lara C C");
		// unmodifiableList não permite pegar a referencia com o get
		System.out.println(javaColecoes.instrutores == javaColecoes.getInstrutores());
		System.out.println();
		
		// de imutavel para mutavel
		List<String> instrutoresNaoMutavel = javaColecoes.getInstrutores();
		// instrutoresImutavel.add("Ozzy"); // UnsupportedOperationException
		List<String> instrutoresMutavel = new ArrayList<String>(instrutoresNaoMutavel);
		instrutoresMutavel.add("Ozzy Osbourne");
		System.out.println(javaColecoes.getInstrutores()); // referencia original
		System.out.println(instrutoresMutavel);
		
		System.out.println("\nDuração total do curso: " + javaColecoes.getTempoTotal() + " minutos");
	}

}

class Curso {

	String nome;
	List<String> instrutores = new ArrayList<String>();
	List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<String> getInstrutores() {
		return Collections.unmodifiableList(instrutores); // cria uma copia com outra referencia
	}

	public List<Aula> getAulas() {
		return aulas; 
	}
	
	public void adicionaAula(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void adicionaInstrutor(String instrutor) {
		this.instrutores.add(instrutor);
	}
	
	public int getTempoTotal() {
//		int total = 0;
//		for (Aula aula : aulas) {
//			total += aula.getDuracao();
//		}
//		return total;
		
		 // ou
		 return this.aulas.stream().mapToInt(Aula::getDuracao).sum();		
	}

}

class Aula {

	String nome;
	int duracao;

	public Aula(String nome, int duracao) {
		super();
		this.nome = nome;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}

	public int getDuracao() {
		return duracao;
	}

	@Override
	public String toString() {
		return this.getNome() + ", " + this.getDuracao() + " minutos";
	}

}