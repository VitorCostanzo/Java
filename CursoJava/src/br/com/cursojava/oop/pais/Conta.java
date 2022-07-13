package br.com.cursojava.oop.pais;

import br.com.cursojava.oop.intermediarios.ContaDepositavel;
import br.com.cursojava.oop.util.FundosInsuficientesException;

// classe do tipo Conta
public abstract class Conta {

	// boa prática: propriedades privadas; usar getters e setters; (encapsulamento)
	private static int qtdContas = 0;
	private double saldo = 0;
	private int agencia;
	private int numero;
	private Cliente titular;

	public Conta(int agencia, Cliente titular) {
		// aqui dentro podemors criar regras
		this.agencia = agencia;
		this.titular = titular;
		this.numero = ++qtdContas;
	}

	// criando um segundo construtor, que referencia o primeiro atraves do this e só
	// necessita de 1 atributos
	public Conta(Cliente titular) {
		// chama o contrutor inicial
		this(1, titular);
	}

	// joga excecao caso não haja fundos
	public void sacar(double valorSacado) throws Exception{
		if (valorSacado > this.saldo) {
			throw new FundosInsuficientesException("Você não tem esse dinheiro todo bixo !");
		}
		
		this.saldo -= valorSacado;
	}

	// utilização dos argumentos
	public boolean transferir(double valor, ContaDepositavel contaDestino) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println(this.titular.getNome() + " transferiu R$ " + valor + " para "
					+ contaDestino.getTitular().getNome());
			contaDestino.depositar(valor);
			return true;
		} else {
			System.out.println("Fundos insuficientes: R$ " + this.saldo);
			return false;
		}
	}
	
	@Override
	public String toString() {
		return 	"Conta " + this.getClass().getSimpleName().replace("Conta", "") + " nº " + this.getNumero() +
				", Agencia: " + this.getAgencia() + ", Titular: " + this.getTitular();
	}

	@Override
	public boolean equals(Object obj) {
		
		Conta cRef = (Conta) obj;
		
		if (this.titular.getSobreNome() == cRef.getTitular().getSobreNome()) {
			return true;
		}
		return false;
		
	}
	
	// setters e getters
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double valor) {
		this.saldo += valor;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getQtdContas() {
		return qtdContas;
	}
}
