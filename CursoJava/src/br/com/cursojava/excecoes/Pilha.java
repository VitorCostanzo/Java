package br.com.cursojava.excecoes;

/*
 * Debugar (Depurar):
 * step over -> executa a linha analisada. Se for um método, este será executado
 * step into -> para entrar nos métodos e continuar o debugger dentro deles
*/

public class Pilha {

	// pilha de execução / call stack

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
			System.out.println(i);
			int a = i / 0; // -> este código gera uma excecao // o erro no console mostra o 'rastro' da 'bomba'
		}
		System.out.println("Fim do metodo2");
	}
}