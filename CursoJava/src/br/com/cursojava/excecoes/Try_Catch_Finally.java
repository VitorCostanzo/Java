package br.com.cursojava.excecoes;

public class Try_Catch_Finally {

	public static void main(String[] args) {

		Conexao_Fake con = null;
		try {

			con = new Conexao_Fake();
			con.lerDados();

		} catch (Exception e) {

			System.out.println("Erro na conexao: " + e);

		} finally {
			
			// independente se houve excecao ou nao, o finally será executado
			
			System.out.print("finally: ");
			if (con != null) {
				con.fecharConexao();
			}
		}

	}

}
