package br.com.cursojava.oop.pais;

import br.com.cursojava.oop.interfaces.Autenticavel;
import br.com.cursojava.oop.util.AutenticacaoUtil;

// será o titular da classe conta
@SuppressWarnings("unused")
public abstract class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;

	private static int qtdClientes = 0;
	private int idCliente;
	private String nome;
	private String sobreNome;
	private String cpf;

	public Cliente(String nome, String sobreNome, String cpf) {

		this.autenticador = new AutenticacaoUtil();

		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.idCliente = ++qtdClientes;

	}

	public Cliente(String nome, String sobreNome, String cpf, String senha) {
		this(nome, sobreNome, cpf);
		this.autenticador.setSenha(senha);
	}

	public abstract void agendarAtendimento(String data);

	@Override
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return this.sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static int getQtdCliente() {
		return qtdClientes;
	}

	@Override
	public void setSenha(String novasenha) {
		this.autenticador.setSenha(novasenha);
	}

	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public String getSenha() {
		return this.autenticador.getSenha();
	}

}
