package br.com.cursojava.mainlibs.io;

import java.io.PrintStream;

public class ClassePrintStream {

	public static void main(String[] args) throws Exception{
		
		PrintStream ps = new PrintStream("ArqPrintStream.txt");
		ps.println("Imprimindo");
		ps.println("linha");
		ps.println("por");
		ps.println("linha");
		ps.close();
		
	}
	
}
