package br.com.cursojava.basico;

public class Condicional {

	public static void main(String[] args) {
		
		ifCondicional();
		switchCondicional();
		
	}
	
	public static void switchCondicional() {
		
		int idade = 18;
		
		switch (idade) {
		case 18:
			System.out.println("18 anos");
			break;
		case 19:
			System.out.println("19 anos");
			break;
		default:
			System.out.println("Outra idade");
			break;
		}
		
	}
	
	
	public static void ifCondicional() {
		System.out.println("testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 && acompanhado) {

			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}

		
		idade = 18;
	    quantidadePessoas = 3;

	    if (idade >= 18) {

	        System.out.println("Você tem mais que 18 anos");
	        System.out.println("Seja bem vindo");
	    } else {
	        if (quantidadePessoas >= 2) {
	        	System.out.println("voce nao tem 18, mas pode entrar, " 
	        			+ "pois está acompanhado");
	        } else {

	            System.out.println("infelizmente voce nao pode entrar");
	        }

	    }
	}
	
}