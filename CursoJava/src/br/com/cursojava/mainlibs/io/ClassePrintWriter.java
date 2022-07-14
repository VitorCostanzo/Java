package br.com.cursojava.mainlibs.io;

import java.io.PrintWriter;

public class ClassePrintWriter {

	public static void main(String[] args) {
		
		try(PrintWriter pw = new PrintWriter("Arquivo.txt")){
			pw.println("Novo");
			pw.println("arquivo");
			pw.println("Autocloseable");
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

	}

}
