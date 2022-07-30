package br.com.cursojavaweb.empresas.servlet;

public class Empresa {

	private static int qtdEmresas = 0;
	private int id;
	private String nome;
	private String cnpj;
	private String data;

	public Empresa(String nome, String cnpj, String data) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.data = data;
		this.id = ++qtdEmresas;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public static int getQtdEmpresas() {
		return qtdEmresas;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
