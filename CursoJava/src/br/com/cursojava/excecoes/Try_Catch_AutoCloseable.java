package br.com.cursojava.excecoes;

public class Try_Catch_AutoCloseable {

	public static void main(String[] args) {
		
		//try() fecha conexao automaticamente
		
		try(Conexao_Fake_AutoCloseable con = new Conexao_Fake_AutoCloseable()) {
			con.lerDados();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
