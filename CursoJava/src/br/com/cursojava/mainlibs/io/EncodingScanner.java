package br.com.cursojava.mainlibs.io;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class EncodingScanner {

	public static void main(String[] args) throws Exception {
		
		// Podemos passar os charsets como referencias para os readers e writers
		Scanner scanner = new Scanner(System.in, StandardCharsets.US_ASCII);
		String entrada = scanner.nextLine();
		while (!entrada.isEmpty()) {
			System.out.println(entrada);	
			entrada = scanner.nextLine();
		}
		
		try (PrintWriter pw = new PrintWriter("Arquivos/Arquivo.txt", "ASCII")){
			pw.println("Começo");
			pw.println("arquivão");
			pw.println("éééé");			
		}
	}
	
}
