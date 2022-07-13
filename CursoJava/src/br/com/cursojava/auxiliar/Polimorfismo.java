package br.com.cursojava.auxiliar;

import br.com.cursojava.oop.filhos.ClienteEspecial;
import br.com.cursojava.oop.filhos.ContaPoupanca;
import br.com.cursojava.oop.filhos.Gerente;
import br.com.cursojava.oop.pais.Conta;
import br.com.cursojava.oop.pais.Funcionario;

public class Polimorfismo {

	// somando as bonificações

	private static double soma = 0;

	// pode receber como parametro qualquer classe filha da classe funcionario
	// (polimorfismo)
	public static void registra(Funcionario f) {

		// chamará o método getBonificacao de acordo com a classe RECEBIDA, e não da
		// classe esperada
		double boni = f.getBonificacao();
		soma += boni;
	}

	public static double getSoma() {
		return soma;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// criando funcionarios do banco
		System.out.println();
		Gerente f001 = new Gerente("Antonio", "321.423.543-65", 3000, "4312");
		System.out.println(f001.getBonificacao());

		// criando gerentes
		System.out.println();
		Gerente g01 = new Gerente("Paulo", "123.234.345-78", 4000, "senha1234");
		System.out.println(g01.getBonificacao());
		System.out.println(g01.autentica("senha1234"));

		// Utilizando ControleBonificacao
		System.out.println();
		registra(f001);
		registra(g01);
		System.out.println(Polimorfismo.getSoma());

		// Referenciação
		Gerente gg = new Gerente("GerenteGerente", "123", 4000, "1234");
		Funcionario fg = new Gerente("FuncionarioGerente", "321", 4000, "1234");
		/*
		 * Quando o método getBonificacao é chamado, o método da classe correta é
		 * utilizado, pois ambas as classes possuem este método
		 */
		System.out.println();
		System.out.println(gg.getBonificacao());
		System.out.println(fg.getBonificacao());
		/*
		 * O método autentica é somente da classe Gerente Ao criarmos um gerente com
		 * referencia para funcionário -> Func. fg = new Ger.(); esté não possuirá
		 * método autentica
		 */
		System.out.println();
		System.out.println(gg.autentica("1234"));
		// System.out.println(fg.autentica("1234")); -> ERRO

		// também são herdados os statics
		ClienteEspecial vitor = new ClienteEspecial("Vitor", "Costanzo", "314.234.345-09", 0);
		ClienteEspecial rosi = new ClienteEspecial("Rosilene", "Cordeiro", "111.222.333-45", 0);
		ContaPoupanca contaPoupVitor = new ContaPoupanca(12, vitor);
		ContaPoupanca contaPoupRosi = new ContaPoupanca(12, rosi);
		System.out.println("\nQuantidade de contas: " + Conta.getQtdContas());
	}

}
