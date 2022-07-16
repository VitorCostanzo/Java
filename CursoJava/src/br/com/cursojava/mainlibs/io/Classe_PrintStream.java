package br.com.cursojava.mainlibs.io;

import java.io.PrintStream;

public class Classe_PrintStream {

	public static void main(String[] args) throws Exception{
		
		PrintStream ps = new PrintStream("Arquivos/Arquivo.txt");
		ps.println("Imprimindo");
		ps.println("linha");
		ps.println("por");
		ps.println("linha");
		ps.close();
		
	}
	
}
