package br.com.cursojava.oop;

import br.com.cursojava.oop.filhos.Administrador;
import br.com.cursojava.oop.filhos.Escriturario;
import br.com.cursojava.oop.filhos.Gerente;
import br.com.cursojava.oop.interfaces.Autenticavel;
import br.com.cursojava.oop.pais.Funcionario;

@SuppressWarnings("unused")
public class SistemaInterno {

	public static boolean logar(Autenticavel usuario, String senha) {
		if (usuario.autentica(senha)) {
			System.out.println("Usuario logado.");
		} else {
			System.out.println("Usuario ou senhaincorretos");
		}
		return usuario.autentica(senha);
	}

	public static void main(String[] args) {

		Administrador adm = new Administrador("Joseph", "123123", 3500, "senha1234");
		Gerente grt = new Gerente("Stanley Hudson", "234345", 3760, "SIUYAdontcare");
		Escriturario esc = new Escriturario("Erin Hannon", "345345", 3000);

		logar(adm, "senha1234");
		logar(grt, "SIUYAdontcare");
	}
}
