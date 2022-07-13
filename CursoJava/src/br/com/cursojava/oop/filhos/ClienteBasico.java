package br.com.cursojava.oop.filhos;

import br.com.cursojava.oop.pais.Cliente;

public class ClienteBasico extends Cliente {

	public ClienteBasico(String nome, String sobreNome, String cpf, String senha) {
		super(nome, sobreNome, cpf, senha);
	}
	
	public ClienteBasico(String nome, String sobreNome, String cpf) {
		super(nome, sobreNome, cpf);
	}

	@Override
	public void agendarAtendimento(String data) {

	}
	

}
