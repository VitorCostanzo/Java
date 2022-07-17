package br.com.cursojava.auxiliar;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Equals_e_HashCode {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Vitor C", "123123");
		Aluno a2 = new Aluno("Vitor C", "123123");

		System.out.println(a1 == a2); // dois objetos diferentes, mesmo hashcode (sobrescrito na classe Aluno)
		System.out.println(a1.equals(a2)); // metodo equals sobrescrito na class aluno
		System.out.println(a1.hashCode() == a2.hashCode()); // hashcode sobrescrito

		Materia webdev = new Materia("Desenvolvimento Web", "E16");
		// por terem o mesmo hashcode, o set só adiciona 1
		webdev.matricular(a1);
		webdev.matricular(a2);

		// resultado da padronização do hashCode()
		System.out.println(webdev.getAlunos());		
		System.out.println(webdev.estaMatriculado(new Aluno("Vitor C", "123123")));

	}

}

class Materia {

	private String nome;
	private String sala;
	private Set<Aluno> alunos = new HashSet<>();

	public Materia(String nome, String sala) {
		this.nome = nome;
		this.sala = sala;
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

}

class Aluno {

	private String nome;
	private String cpf;

	public Aluno(String nome, String cpf) {
		if (nome == null || cpf == null) {
			throw new NullPointerException("Nome e/ou cpf nulos");
		}
		this.nome = nome;
		this.cpf = cpf;
	}



	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}



	@Override
	public String toString() {
		return this.nome + ", cpf" + this.cpf;
	}
}