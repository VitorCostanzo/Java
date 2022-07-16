package br.com.cursojava.collections;

import java.util.HashSet;
import java.util.Set;

public class Interface_Set {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<String>();
		alunos.add("Vitor C C");
		alunos.add("Nico Steppat");
		alunos.add("Antedeguemon");
		alunos.add("Kevin Malone");
		
		// não possui ordem definida
		System.out.print(alunos);
		System.out.println(" -> " + alunos.size() + " alunos");
		
		// não aceita repetição
		alunos.add("Vitor C C");
		alunos.add("Kevin Malone");
		System.out.print(alunos);
		System.out.println(" -> " + alunos.size() + " alunos");

		// vantagens na performance
		alunos.remove("Kevin Malone"); // -> ao procurar elementos, não precisa iterar
		alunos.contains("Vitor CC"); // -> ao procurar elementos, não precisa iterar
		
	}
	
}
