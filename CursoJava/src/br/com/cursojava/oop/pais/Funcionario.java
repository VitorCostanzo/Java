package br.com.cursojava.oop.pais;

public abstract class Funcionario {

	private static int qtdFunc = 0;
	private int idFuncionario = 0;
	private String nome;
	private String cpf;
	private double salario;

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.idFuncionario = ++qtdFunc;

	}

	public abstract double getBonificacao();

	public int getIdFuncionario() {
		return this.idFuncionario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static int getQtdFunc() {
		return qtdFunc;
	}

}
