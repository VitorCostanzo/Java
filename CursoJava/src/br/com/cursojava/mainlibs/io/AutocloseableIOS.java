package br.com.cursojava.mainlibs.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class AutocloseableIOS {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("Arquivos/Arquivo.txt")) {
			try (InputStreamReader isr = new InputStreamReader(fis)) {
				try (BufferedReader br = new BufferedReader(isr)) {

					String linha = br.readLine();
					while (linha != null) {
						System.out.println(linha);
						linha = br.readLine();
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Arquivos/Arquivo.txt")))) {

			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (FileWriter fw = new FileWriter("Arquivos/Arquivo.txt")) {
			fw.write("Arquivo");
			fw.write(System.lineSeparator());
			fw.write("Sobrescrito");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (PrintStream ps = new PrintStream("Arquivos/Arquivo.txt")){
			ps.println("Arquivo");
			ps.println("Sobrescrito!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (PrintWriter pw = new PrintWriter("Arquivos/Arquivo.txt")){
			pw.println("Arquivo");
			pw.println("Sobrescrito");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
