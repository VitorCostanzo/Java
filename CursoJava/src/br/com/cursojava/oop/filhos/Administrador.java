package br.com.cursojava.oop.filhos;

import br.com.cursojava.oop.interfaces.Autenticavel;
import br.com.cursojava.oop.pais.Funcionario;
import br.com.cursojava.oop.util.AutenticacaoUtil;

public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Administrador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil();
	}
	
	public Administrador(String nome, String cpf, double salario, String senha) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil(senha);
		
	}

	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.2;
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

	@Override
	public String getNome() {
		return super.getNome();
	}
}
