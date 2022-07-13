package br.com.cursojava.auxiliar;

// testar visibilidade em outras classes/pacotes

@SuppressWarnings("unused")
public class Visibilidade {

	public String publica = "pública"; // acessivel de qualquer lugar do projeto
	protected String protegida = "protegida"; // acessivel somente à classe e suas filhas
	String privadapacote = "privadapacote"; // visivel somente dentro do pacote
	private String privada = "privada"; // visivel somente dentro da classe

}
