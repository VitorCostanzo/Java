package br.com.cursojava.enums;

// não pode ser instanciada
// cria ordens nomeadas, iniciadas do indice 0
public enum Prioridade {

	// já com argumentos do construtor
	// ordinal() criado automaticamente
	MIN("Mínima"), LOW("Baixa"), NORMAL("Normal"), HIGH("Alta"), MAX("Máxima");
	
	
	private String descricao;
	
	// construtor personalizado
	Prioridade(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}
