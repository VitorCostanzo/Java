package br.com.cursojava.oop.pais;

import br.com.cursojava.oop.interfaces.Tributavel;

public abstract class Seguro implements Tributavel {

	private Cliente titular;
	private double valorseguro;

	public Seguro(Cliente titular, double valorseguro) {
		this.titular = titular;
		this.valorseguro = valorseguro;
	}

	@Override
	public double getImpostoMensal() {
		return this.valorseguro * 0.02;
	}

	@Override
	public Cliente getTitular() {
		return this.titular;
	}

}
