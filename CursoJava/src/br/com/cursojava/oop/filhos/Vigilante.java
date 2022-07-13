package br.com.cursojava.oop.filhos;

import br.com.cursojava.oop.pais.Funcionario;

public class Vigilante extends Funcionario {

	public Vigilante(String nome, String cpf, double salario, boolean adicionalNoturno) {
		super(nome, cpf, salario);

		if (adicionalNoturno) {
			this.setSalario(salario * 1.25);
		}

	}

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.12;
	}

}
