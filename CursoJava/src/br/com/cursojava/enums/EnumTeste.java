package br.com.cursojava.enums;

public class EnumTeste {

	public static void main(String[] args) {
		
		// Enum Prioridade
		Prioridade pMin = Prioridade.MIN;
		Prioridade pLow = Prioridade.LOW;
		Prioridade pNormal = Prioridade.NORMAL;
		Prioridade pHigh = Prioridade.HIGH;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name() + ": " + pMin.ordinal() + " -> Descrição: " + pMin.getDescricao());
		System.out.println(pLow.name() + ": " + pLow.ordinal() + " -> Descrição: " + pLow.getDescricao());
		System.out.println(pNormal.name() + ": " + pNormal.ordinal() + " -> Descrição: " + pNormal.getDescricao());
		System.out.println(pHigh.name() + ": " + pHigh.ordinal() + " -> Descrição: " + pHigh.getDescricao());
		System.out.println(pMax.name() + ": " + pMax.ordinal() + " -> Descrição: " + pMax.getDescricao());
		System.out.println();
		
		
		// Enum Estacoes
		Estacoes verao = Estacoes.VERAO;
		Estacoes outono = Estacoes.OUTONO;
		Estacoes inverno = Estacoes.INVERNO;
		Estacoes primavera = Estacoes.PRIMAVERA;
		
		System.out.println(verao.name() + ": " + verao.ordinal() + " -> Clima: " + verao.getClima());
		System.out.println(outono.name() + ": " + outono.ordinal() + " -> Clima: " + outono.getClima());
		System.out.println(inverno.name() + ": " + inverno.ordinal() + " -> Clima: " + inverno.getClima());
		System.out.println(primavera.name() + ": " + primavera.ordinal() + " -> Clima: " + primavera.getClima());
	}
	
}
