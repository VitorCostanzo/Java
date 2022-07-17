package br.com.cursojava.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interface_Map {
// pares de chave : valor
// espalhamento
// Map na classe LojinhaJogo	

	public static void main(String[] args) {

		LojinhaJogo superGames = new LojinhaJogo("Super Games");
		superGames.cadastrarJogo(new Jogo("God of War", 137));
		superGames.cadastrarJogo(new Jogo("Guitar Hero", 452));
		superGames.cadastrarJogo(new Jogo("Castlevania", 545));
		superGames.cadastrarJogo(new Jogo("Need for Speed", 123));
		superGames.cadastrarJogo(new Jogo("GTA V", 321));

		System.out.println(superGames.buscaPorCadastro(137));
		System.out.println(superGames.buscaPorCadastro(452));
		System.out.println(superGames.buscaPorCadastro(545));
		System.out.println(superGames.buscaPorCadastro(123));
		System.out.println(superGames.buscaPorCadastro(321));

		// LinkedHashMap -> mantem a ordem dos puts
		// HashTable -> threadsafe

		Map<Integer, String> cadastros = new HashMap<>();
		cadastros.put(1, "Vitor");
		cadastros.put(2, "Jonas");
		cadastros.put(3, "Andrea");

		cadastros.keySet().forEach(key -> System.out.println(cadastros.get(key)));
		
		cadastros.values().forEach(value -> System.out.println(value));
	}
}

class LojinhaJogo {
	private String nome;
	private List<Jogo> jogos = new ArrayList<Jogo>();
	// Map<Chave,Valor>
	private Map<Integer, Jogo> jogoPorID = new HashMap<>();

	public LojinhaJogo(String nome) {
		this.nome = nome;
	}

	public void cadastrarJogo(Jogo jogo) {
		jogos.add(jogo);
		jogoPorID.put(jogo.getId(), jogo); // jogo.getId() -> chave // jogo -> valor
	}

	public Jogo buscaPorCadastro(int id) {
		return jogoPorID.get(id); // busca o valor relacionado à chave
	}

}

class Jogo {
	private String nome;
	private int id;

	public Jogo(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return this.nome;
	}

}