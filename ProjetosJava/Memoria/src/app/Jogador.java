package app;

public class Jogador implements Comparable<Jogador>{

	String nome;
	String pontuacao;
	Integer pontos;
	
	public Jogador(String nome, String pontuacao) {
		
		if (nome.length() > 15) {
			this.nome = nome.substring(0, 14);
		} else {
			int dif = 15 - nome.length();
			String spacing = "";
			for (int i = 0; i < dif; i++) {
				spacing = spacing + " ";
			}
			this.nome = nome + spacing;
		}
		
		this.pontuacao = "      " + pontuacao;
		
		String[] sss = pontuacao.split(" ");
		this.pontos = Integer.parseInt(sss[0]);
	}
	
	@Override
	public String toString() {
		return this.nome + " -> " + this.pontuacao;
	}

	@Override
	public int compareTo(Jogador outro) {
		return this.pontos - outro.pontos;
	}
}
