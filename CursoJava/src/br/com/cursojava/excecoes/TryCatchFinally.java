package br.com.cursojava.excecoes;

public class TryCatchFinally {

	public static void main(String[] args) {

		ConexaoFake con = null;
		try {

			con = new ConexaoFake();
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
