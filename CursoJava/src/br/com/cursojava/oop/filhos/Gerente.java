package br.com.cursojava.oop.filhos;

import br.com.cursojava.oop.interfaces.Autenticavel;
import br.com.cursojava.oop.pais.Funcionario;
import br.com.cursojava.oop.util.AutenticacaoUtil;

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	// a classe Gerente recebe todos atributos e métodos da classe Funcionario

	/*
	 * construtor recebe mesmos parametros do construtor da classe pai, e pode
	 * conter novos parametros
	 */
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil();
	}
	
	public Gerente(String nome, String cpf, double salario, String senha) {

		// super(parametros) -> diz que estes parametros recebidos se comportam igual na
		// classe pai
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil(senha);

	}

	// Sobrescreve um método da classe Pai
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.3;
	}

	public static void main(String[] args) {

		Gerente vitor = new Gerente("Vitor Costanzo", "123.234.345-89", 3000, "1234");
		Gerente caio = new Gerente("Caio Costanzo", "234.987.111-55", 3000, "4321");
		Gerente rosi = new Gerente("Rosilene Cordeiro", "123.321.123-77", 4500, "senha1234");

		// utilizando métodos
		System.out.println("Bonificação da gerente Rosi: R$ " + rosi.getBonificacao());
		System.out.println("Rosi logada? " + rosi.autentica("senha1234"));

		// id's e qtdTotal
		System.out.println();
		System.out
				.println("Id de Vitor: #" + vitor.getIdFuncionario() + ", Função: " + vitor.getClass().getSimpleName());
		System.out.println("Id de Caio: #" + caio.getIdFuncionario() + ", Função: " + caio.getClass().getSimpleName());
		System.out.println("Id de Rosi: #" + rosi.getIdFuncionario() + ", Função: " + rosi.getClass().getSimpleName());
		System.out.println("\nQtd total de funcionarios: " + Funcionario.getQtdFunc());

		System.out.println(rosi.getBonificacao());
	}

	@Override
	public void setSenha(String novasenha) {
		this.autenticador.setSenha(novasenha);
	}

	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public String getSenha() {
		return this.autenticador.getSenha();
	}
	
	@Override
	public String getNome() {
		return super.getNome();
	}

}