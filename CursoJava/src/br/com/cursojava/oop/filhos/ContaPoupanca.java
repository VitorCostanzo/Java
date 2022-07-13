package br.com.cursojava.oop.filhos;

import br.com.cursojava.oop.intermediarios.ContaDepositavel;
import br.com.cursojava.oop.pais.Cliente;
import br.com.cursojava.oop.pais.Conta;

public class ContaPoupanca extends ContaDepositavel {

	private double limiteST = 1000;

	// conta poupança limite padrão
	public ContaPoupanca(int agencia, Cliente titular) {
		super(agencia, titular);
	}

	// conta poupança limite personalizado
	public ContaPoupanca(int agencia, Cliente titular, double limiteST) {
		this(agencia, titular);
		this.limiteST = limiteST;
	}

	// conta poupança padrão
	public ContaPoupanca(Cliente titular) {
		this(1, titular);

	}

	@Override
	public void sacar(double valorSacado) throws Exception {
		if (valorSacado <= limiteST) {
			super.sacar(valorSacado);
		} else {
			throw new AcimaDoLimiteException("Valor acima do limite para a conta.");
		}
	}

	@Override
	public boolean transferir(double valor, ContaDepositavel contaDestino) {
		if (valor > limiteST) {
			System.out.println("Limite para transferências: R$ " + limiteST);
			return false;
		}
		return super.transferir(valor, contaDestino);
	}

	public static void main(String[] args) {
		ClienteEspecial lara = new ClienteEspecial("Lara", "Cordeiro", "234.345.456-14", 0);
		ClienteEspecial vitor = new ClienteEspecial("Vitor", "Costanzo", "123.234.345-89", 0);

		ContaPoupanca cp1 = new ContaPoupanca(123, lara);
		ContaPoupanca cp2 = new ContaPoupanca(123, vitor, 1500);

		// qtdContas e numeros
		System.out.println(Conta.getQtdContas());
		System.out.println();
		System.out.println(cp1.getNumero());
		System.out.println(cp2.getNumero());
		// limites
		System.out.println();
		System.out.println(cp1.limiteST);
		System.out.println(cp2.limiteST);
		try {
			cp1.sacar(1500);
			cp2.sacar(1500);
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

	}

}
