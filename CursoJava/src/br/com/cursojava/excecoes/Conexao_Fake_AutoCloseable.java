package br.com.cursojava.excecoes;

public class Conexao_Fake_AutoCloseable implements AutoCloseable{
	
	public Conexao_Fake_AutoCloseable() throws Exception {
		System.out.println("abrindo conexao");
		//throw new Exception("sem conexao");  // -> caso ocorra, não necessita ser fechada, close() não é chamada
	}
	
	public void lerDados() throws Exception{
		System.out.println("lendo dados");
		throw new Exception("erro na leitura de dados");
	}
	
	@Override
	public void close() {
		
		System.out.println("fechando conexao");
		
	}
	
	

}
