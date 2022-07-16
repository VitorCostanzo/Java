package br.com.cursojava.excecoes;

public class Try_Catch {

	/*
	 * o bloco try_catch lida com as exceções sem impedir a finalização do bloco que
	 * 
	 * "A Exceção é uma bomba que estoura os métodos da pilha na ordem em que estão
	 * empilhadas, o try_catch desarma a bomba"
	 * 
	 * o possui trocar o try de lugar e experimentar sugestoes (dentro e fora do
	 * for, dentro e fora dos métodos)
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");

	}

	private static void metodo1() {

		System.out.println("Inicio do metodo1");

		metodo2();

		System.out.println("Fim do metodo1");

	}

	@SuppressWarnings("unused")
	private static void metodo2() {

		System.out.println("Inicio do metodo2");

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(i);

				int a = i / 0; // -> este código gera uma excecao // o erro no console mostra o 'rastro' da
			} catch (Exception e) {
				System.out.println("Exceção: " + e);
			} // 'bomba'
		}

		System.out.println("Fim do metodo2");
	}

}
