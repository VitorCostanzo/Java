package br.com.cursojava.oop.filhos;

import br.com.cursojava.oop.pais.Funcionario;

public class Escriturario extends Funcionario {

	public Escriturario(String nome, String cpf, double salario) {
		super(nome, cpf, salario);

	}

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.2;
	}

}
