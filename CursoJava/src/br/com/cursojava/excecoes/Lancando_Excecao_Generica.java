package br.com.cursojava.excecoes;

public class Lancando_Excecao_Generica { // Checked

	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			metodoA();
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		System.out.println("Fim main");
	}
	
	private static void metodoA() throws Excecao_Generica {
		System.out.println("Inicio metodo A");
		metodoB();
		System.out.println("Fim metodo A");
	}
	
	private static void metodoB() throws Excecao_Generica {
		System.out.println("Inicio metodo B");
		throw new Excecao_Generica("Ta errado bixo!");
	}
	
}
