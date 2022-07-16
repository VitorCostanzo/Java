package br.com.cursojava.excecoes;

@SuppressWarnings("serial")
public class Excecao_Especifica extends RuntimeException { // Unchecked
// se estendermos a classe Exception,  compilador irá exigir que explicitemos quem irá lançar a exceção -> [ metodoX() throws Exception ] **Quando não houver try_catch no metodo

// extends Exception => categoria: 'checked'
	// "é verificado pelo compilador"
	// exige throws exception quando não houver tratamento dentro do método
	
	
// extends RuntimeException => categoria: 'unchecked' 
	// "não é verificado pelo compilador"
	
	public Excecao_Especifica(String s) {
		super(s);
	}

}
