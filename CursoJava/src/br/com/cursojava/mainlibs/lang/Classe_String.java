package br.com.cursojava.mainlibs.lang;

public class Classe_String {

	public static void main(String[] args) {

		// imutavel
		String name = "vitor"; // objeto literal
		String middleName = "cordeiro";
		String lastName = "costanzo";

		// concat
		String fullname = name.concat(" " + middleName.concat(" " + lastName));

		System.out.println("Nome: " + name);
		System.out.println("Nome Completo: " + fullname);

		// replace
		System.out.println("Iniciais: " + fullname.replace('v', 'V').replace('c', 'C'));

		// toUpper
		System.out.println("Uppercase: " + fullname.toUpperCase());

		// charAt
		System.out.println("Sétima letra: " + fullname.charAt(6));

		// indexOf
		System.out.println("Localização letra a: " + (fullname.indexOf('a') + 1) + "ª posição");
		System.out.println("Inicio sobrenome: " + (fullname.indexOf("costanzo") + 1) + "ª posição");

		// length
		System.out.println("Tamanho do nome: " + fullname.length() + " caracteres");

		// isEmpty
		System.out.println("isEmpty?: " + "".isEmpty());

		// trim
		System.out.println("Sem Trim: " + "    Vitor    ");
		System.out.println("Com Trim: " + "    Vitor    ".trim());
	}

}
