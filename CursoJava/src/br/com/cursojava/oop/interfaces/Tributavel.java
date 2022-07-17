package br.com.cursojava.oop.interfaces;

import br.com.cursojava.oop.pais.Cliente;

public interface Tributavel {

	public abstract double getImpostoMensal();

	public abstract Cliente getTitular();

	// métodos default -> podem ser escritos nas interfaces para serem 
	// utilizados nas classes que a implementam, sem necessidade
	// de reescrita do metodo
	default public void imprimeQqrCoisa() { 
		System.out.println("Qualquer coisa");
	}
}
