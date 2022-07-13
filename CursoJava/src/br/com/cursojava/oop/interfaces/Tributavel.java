package br.com.cursojava.oop.interfaces;

import br.com.cursojava.oop.pais.Cliente;

public interface Tributavel {

	public abstract double getImpostoMensal();

	public abstract Cliente getTitular();

}
