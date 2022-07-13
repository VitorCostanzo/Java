package br.com.cursojava.excecoes;

public class TryCatchAutoCloseable {

	public static void main(String[] args) {
		
		//try() fecha conexao automaticamente
		
		try(ConexaoFakeAutoCloseable con = new ConexaoFakeAutoCloseable()) {
			con.lerDados();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
