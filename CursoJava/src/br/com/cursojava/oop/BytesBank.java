package br.com.cursojava.oop;

import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.oop.filhos.Administrador;
import br.com.cursojava.oop.filhos.ClienteBasico;
import br.com.cursojava.oop.filhos.ClienteEspecial;
import br.com.cursojava.oop.filhos.ContaCorrente;
import br.com.cursojava.oop.filhos.ContaPoupanca;
import br.com.cursojava.oop.filhos.ContaSalario;
import br.com.cursojava.oop.filhos.Escriturario;
import br.com.cursojava.oop.filhos.Gerente;
import br.com.cursojava.oop.filhos.SeguroVida;
import br.com.cursojava.oop.filhos.Vigilante;
import br.com.cursojava.oop.interfaces.Autenticavel;
import br.com.cursojava.oop.interfaces.Tributavel;
import br.com.cursojava.oop.pais.Cliente;
import br.com.cursojava.oop.pais.Conta;
import br.com.cursojava.oop.pais.Funcionario;

public class BytesBank {

	public static void main(String[] args) {

		ClienteBasico c1 = new ClienteBasico("Darryl", "Philbin", "123.234.345-90");
		ClienteEspecial c2 = new ClienteEspecial("Pam", "Halpert", "890.345.626-44", 0);
		ClienteBasico c3 = new ClienteBasico("Jim", "Halpert", "333.222.555-98");

		ContaCorrente cc1 = new ContaCorrente(c1);
		ContaPoupanca cp1 = new ContaPoupanca(c2);
		ContaSalario cs1 = new ContaSalario(c3);

		SeguroVida sv1 = new SeguroVida(c1, 5000);

		Escriturario fe1 = new Escriturario("Creed Bratton", "001.123.111-09", 3000);
		Vigilante fv1 = new Vigilante("Hank", "904.994.234-09", 2500, true);
		Gerente fg1 = new Gerente("Michael Scott", "333.444.555-98", 4000);
		Administrador fa1 = new Administrador("Dwight Schrute", "126.655.987-25", 3000);

		// verificando contadores das classes maes
		System.out.println("Quantidade de clientes: " + Cliente.getQtdCliente());
		System.out.println("Quantidade de contas: " + Conta.getQtdContas());
		System.out.println("Quantidade de funcionarios: " + Funcionario.getQtdFunc());

		// métodos das contas
		System.out.println();
		cc1.depositar(4500);
		cc1.transferir(2250, cp1);
		cs1.recebeSalario(2000);
		try {
			cs1.sacar(2100);
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

		System.out.println("Saldo cc1: " + cc1.getSaldo());
		System.out.println("Saldo cp1: " + cp1.getSaldo());
		System.out.println("Saldo cs1: " + cs1.getSaldo());
		System.out.println();

		// métodos do seguro
		System.out.println("Titular do seguro: " + sv1.getTitular().getNome() + " " + sv1.getTitular().getSobreNome());
		System.out.println("Imposto mensal do seguro: " + sv1.getImpostoMensal());
		System.out.println(
				"Imposto anual para " + c1.getNome() + ": R$ " + (getImpostoAnual(cc1) + getImpostoAnual(sv1)));
		System.out.println();

		// métodos dos funciionarios
		System.out.println("Bonificação escriturario: R$" + fe1.getBonificacao());
		System.out.println("Bonificação vigilante: R$" + fv1.getBonificacao());
		System.out.println("Bonificação gerente: R$" + fg1.getBonificacao());
		System.out.println("Bonificação administrador: R$" + fa1.getBonificacao());
		System.out.println();

		// autenticando usuarios do sistema
		List<Autenticavel> usuariosDoSistema = new ArrayList<Autenticavel>();
		usuariosDoSistema.add(c1);
		usuariosDoSistema.add(c2);
		usuariosDoSistema.add(c3);
		usuariosDoSistema.add(fg1);
		usuariosDoSistema.add(fa1);

		for (Autenticavel autenticavel : usuariosDoSistema) {
			System.out.print("Senha de " + autenticavel.getNome() + ": " + autenticavel.getSenha()
					+ " ->  Autenticado: " + autenticavel.autentica("senhapadrao") + "\n");
		}

	}

	// para receber classes que implementam Tributavel
	public static double getImpostoAnual(Tributavel t) {
		return t.getImpostoMensal() * 12;
	}

}
