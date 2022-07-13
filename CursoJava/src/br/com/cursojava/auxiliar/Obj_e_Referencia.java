package br.com.cursojava.auxiliar;

import br.com.cursojava.oop.filhos.ClienteEspecial;
import br.com.cursojava.oop.filhos.ContaPoupanca;

public class Obj_e_Referencia {

	public static void main(String[] args) {

		ClienteEspecial original = new ClienteEspecial("Original", "Conta", "123", 0);
		ContaPoupanca contaOriginal = new ContaPoupanca(2, original);

		// copiando uma referencia
		ContaPoupanca contaCopia = contaOriginal;

		contaCopia.depositar(1000); // -> deposita na conta referenciada (original)
		System.out.println("Novo Saldo: R$ " + contaOriginal.getSaldo());
		// hashCode() -> identificação da referencia
		// as duas abaixo possuem o mesmo hashcode
		System.out.println();
		System.out.println(contaOriginal.hashCode());
		System.out.println(contaCopia.hashCode());
		System.out.println(contaOriginal == contaCopia);
		// contaOriginal ---> obj_na_memoria <--- contaCopia

	}

}
