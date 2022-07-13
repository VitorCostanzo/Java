package br.com.cursojava.oop.interfaces;

/* clientes e funcionarios especificos possuem acesso ao sistema,
 * mas não podem ser filhos da mesma classe. 
 * Neste caso criamos a interface Autenticavel*/

/* Interfaces são abstratas e possuem métodos abstratos que DEVEM ser
 * compartilhados por todos que participam da interface (implements)*/

public abstract interface Autenticavel {

	public abstract void setSenha(String senha);

	public abstract boolean autentica(String senha);

	public abstract String getSenha();
	
	public abstract String getNome();

}
