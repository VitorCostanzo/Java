package br.com.cursojava.oop.filhos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.cursojava.oop.pais.Cliente;

public class ClienteEspecial extends Cliente {

	private Map<String, String> dependentes = new HashMap<String, String>();
	Scanner input = new Scanner(System.in);

	public ClienteEspecial(String nome, String sobreNome, String cpf, int qtdDependentes) {

		super(nome, sobreNome, cpf);
		for (int i = 0; i < qtdDependentes; i++) {

			System.out.println("\n" + (i + 1) + "° dependente: ");
			System.out.print("Nome: ");
			String nomeDep = input.nextLine();
			System.out.print("Parentesco:");
			String parentesco = input.nextLine();
			this.dependentes.put(nomeDep, parentesco);
		}

	}
	
	public ClienteEspecial(String nome, String sobreNome, String cpf, int qtdDependentes, String senha) {
		this(nome, sobreNome, cpf, qtdDependentes);
		super.setSenha(senha);
	}

	public Map<String, String> getDependentes() {
		return this.dependentes;
	}

	@Override
	public void agendarAtendimento(String data) {
		System.out.println("Cliente especial, agendado atendimente para " + data);
	}

	public static void main(String[] args) {

		ClienteEspecial rosi = new ClienteEspecial("Rosilene", "Cordeiro", "111.222.333-45", 2);

		System.out.println("\nDependentes da Rosi:");
		rosi.getDependentes().forEach((k, v) -> {

			System.out.print(v + " ");
			System.out.println(k);

		});

	}
}
