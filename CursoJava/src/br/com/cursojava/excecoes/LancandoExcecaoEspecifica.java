package br.com.cursojava.excecoes;

public class LancandoExcecaoEspecifica { // Unchecked

	public static void main(String[] args) {

		System.out.println("Inicio do main");
		try {
			
			metodo1();
			
		} catch (Exception e) {
			
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
			System.out.println("Classe: " + e.getClass().getSimpleName());
		}
		System.out.println("Fim do main");

	}

	private static void metodo1(){

		System.out.println("Inicio do metodo1");

		metodo2();

		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {

		System.out.println("Inicio do metodo2");

		// Jogando a 'bomba' manualmente
		throw new ExcecaoEspecifica("Errrrou! Oloco bixo! Olha essa fera! Ta pegando fogo meu!");

		// System.out.println("Fim do metodo2");
	}

}
