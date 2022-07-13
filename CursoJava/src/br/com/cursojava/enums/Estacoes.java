package br.com.cursojava.enums;

public enum Estacoes {

	VERAO("Quente"), OUTONO("Ameno"), INVERNO("Frio"), PRIMAVERA;
	
	private String clima;
	
	Estacoes(String clima){
		this.clima = clima;
	}
	
	Estacoes(){
		this.clima = "Indefinido";
	}
	
	public String getClima() {
		return this.clima;
	}
}
