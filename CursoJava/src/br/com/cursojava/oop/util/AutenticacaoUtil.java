package br.com.cursojava.oop.util;

// para reaproveitamento de código (composição)
public class AutenticacaoUtil {
	
	private String senha = "senhapadrao";
	
	public AutenticacaoUtil() {
		
	}
	
	public AutenticacaoUtil(String senha) {
		this.senha = senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean autentica(String senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public String getSenha() {
		return this.senha;
	}
}
