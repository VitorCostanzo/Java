package br.com.cursojava.mainlibs.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		try (Scanner scanner = new Scanner(new File("pessoas.csv"))) { // escaneia o documento

			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine(); // pega a proxima linha do documento
				try (Scanner dados = new Scanner(linha)) { // escaneia a linha lida
					dados.useLocale(Locale.US); // usará o padrão de escrita americano independente da linguagem do SO
					dados.useDelimiter(","); // semelhante ao metodo split da classe String
					pessoas.add(new Pessoa(dados.next(), dados.next(), dados.nextInt(), dados.nextDouble()));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
		}

	}

}

class Pessoa {

	String nome;
	String cpf;
	int idade;
	double altura;

	public Pessoa(String nome, String cpf, int idade, Double altura) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return String.format("%s, documento n° %s, %d anos de idade, %.2fm", nome, cpf, idade, altura);
	}
}