package br.com.cursojava.mainlibs.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class LerTecladoEscreverArquivo{

	public static void main(String[] args) throws Exception{
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os1 = System.out;
		OutputStreamWriter osw1 = new OutputStreamWriter(os1);
		BufferedWriter bw1 = new BufferedWriter(osw1);
		
		
		ArrayList<String> arq = new ArrayList<String>();
		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			arq.add(linha + "\n");
			bw1.write(linha);
			bw1.flush(); // limpa o buffer // -> irá escrever imediatamente no console
			linha = br.readLine();
		}
		br.close();
		
		
		OutputStream os2 = new FileOutputStream("Arquivo.txt");
		OutputStreamWriter osw2 = new OutputStreamWriter(os2);
		BufferedWriter bw2 = new BufferedWriter(osw2);
		
		for (String row : arq) {
			bw2.write(row);
		}
		
		bw2.close();
	} 
	
}
