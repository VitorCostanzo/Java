package br.com.cursojava.auxiliar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CurrentTimeMillis {

	public static void main(String[] args) {
		
		long ini = System.currentTimeMillis();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Arquivo.txt")))) {
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("O programa foi executado em " + (fim - ini) + " milisegundos");
	}
	
}
