package br.com.cursojava.mainlibs.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class LerEscreverArquivo {

	public static void main(String[] args) throws Exception {

		// InputStreams -> recebem dados binarios (bits, bytes)
		// Readers -> leem as entradas input e transformam em caracteres/strings/imagens

		// Fluxo de entrada com Arquivo // -> Padrão Decorator
		FileInputStream fis = new FileInputStream("Arquivos/Arquivo.txt"); // Recebe o binario do arquivo
		InputStreamReader isr = new InputStreamReader(fis); // lê o binario e transforma em caracteres
		BufferedReader br = new BufferedReader(isr); // Buffer para guardar os caracteres em linha

		ArrayList<String> arq = new ArrayList<String>();
		String linha = br.readLine();
		while (linha != null) {
			arq.add(linha);
			linha = br.readLine();
		}
		br.close(); // Fechar arquivo SEMPRE

		
		// Fluxo de saida // -> Padrão Decorator
		FileOutputStream fos = new FileOutputStream("Arquivos/Arquivo.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (String row : arq) {
			bw.write(row);
			bw.newLine();
		}
		
		bw.close();
		
	}

}
