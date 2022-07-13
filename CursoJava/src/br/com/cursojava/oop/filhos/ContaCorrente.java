package br.com.cursojava.oop.filhos;

import br.com.cursojava.oop.interfaces.Tributavel;
import br.com.cursojava.oop.intermediarios.ContaDepositavel;
import br.com.cursojava.oop.pais.Cliente;

public class ContaCorrente extends ContaDepositavel implements Tributavel {

	public ContaCorrente(int agencia, Cliente titular) {
		super(agencia, titular);
	}

	public ContaCorrente(Cliente titular) {
		super(titular);
	}

	@Override
	public double getImpostoMensal() {
		return super.getSaldo() * 0.01;
	}

	@Override
	public Cliente getTitular() {
		return super.getTitular();
	}
	

}
