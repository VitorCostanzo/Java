package br.com.cursojava.excecoes;

public class ConexaoFake{

	public ConexaoFake() throws Exception {
		System.out.println("abrindo conexao");
		throw new Exception("falha ao conectar"); // não será criada instancia de conexao
	}
	
	public void lerDados() {
		System.out.println("recebendo dados");
	}

	public void fecharConexao() {
		System.out.println("fechando conexao");
		
	}
}
