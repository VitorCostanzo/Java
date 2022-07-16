package br.com.cursojava.excecoes;

public class Multi_Catch {

	public static void main(String[] args) {
		System.out.println("Inicio do metodo main");

		try {
			metodoA();
			// podemos ter mais de um catch
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Exceção: " + e.getMessage());
			e.printStackTrace();
		}
		/*
		 * EQUIVALENTE:
		 * catch (ArithmeticException ae) {
		 * 		System.out.println("Exceção: " + ae.getMessage());
		 * 		ae.printStackTrace();
		 * } catch (NullPointerException npe) {
		 * 		System.out.println("Exceção: " + npe.getMessage());
		 * 		npe.printStackTrace(); 
		 * }
		 */
		System.out.println("Fim do metodo main");
	}

	public static void metodoA() {
		System.out.println("Inicio do metodo A");

		metodoB();

		System.out.println("Fim do metodo A");
	}

	@SuppressWarnings("unused")
	public static void metodoB() {
		System.out.println("Inicio do metodo B");

		for (int i = 1; i <= 3; i++) {
			System.out.println(i);

			double excecao = 3 / 0;

		}

		System.out.println("Fim do metodo B");
	}

}
