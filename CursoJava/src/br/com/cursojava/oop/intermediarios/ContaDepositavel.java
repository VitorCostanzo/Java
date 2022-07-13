package br.com.cursojava.oop.intermediarios;

import br.com.cursojava.oop.pais.Cliente;
import br.com.cursojava.oop.pais.Conta;

public abstract class ContaDepositavel extends Conta {

	public ContaDepositavel(int agencia, Cliente titular) {
		super(agencia, titular);
	}

	public ContaDepositavel(Cliente titular) {
		super(titular);
	}

	public void depositar(double valorDepositado) {
		System.out.println("Foram depositados R$" + valorDepositado + " na conta de " + this.getTitular().getNome());
		this.setSaldo(this.getSaldo() + valorDepositado);
	}

}
