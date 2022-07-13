package br.com.cursojava.oop.filhos;

import br.com.cursojava.oop.pais.Cliente;
import br.com.cursojava.oop.pais.Conta;

public class ContaSalario extends Conta {

	public ContaSalario(int agencia, Cliente titular) {
		super(agencia, titular);
	}

	public ContaSalario(Cliente titular) {
		super(titular);
	}

	public void recebeSalario(double valor) {
		System.out.println(this.getTitular().getNome() + "recebeu R$ " + valor);
		this.setSaldo(this.getSaldo() + valor);
	}
	
}
