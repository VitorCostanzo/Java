package br.com.cursojava.auxiliar;

public class StckOvrflw {

	public static void main(String[] args) {
		
		metodo1();
		
	}
	
	private static void metodo1() {
		
		System.out.println("Mais um na pilha!");
		metodo1();
		
		// Excedido o limite da pilha (StackOverflow)
	}
	
}
