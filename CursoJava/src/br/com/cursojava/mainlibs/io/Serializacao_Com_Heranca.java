package br.com.cursojava.mainlibs.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializacao_Com_Heranca {

	public static void main(String[] args) {
		
		Aguia careca = new Aguia("Aguia careca", "EUA");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Arquivos/objeto.bin"))){
			oos.writeObject(careca);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Arquivos/objeto.bin"))){
			Aguia recebido = (Aguia) ois.readObject();
			System.out.println(recebido.especie);
			System.out.println(recebido.regiao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

abstract class Animal implements Serializable{
	// a interface Serializable precisa ser implementada na classe mae
	// obs: se uma classe referenciar outra dentro dela, ambas precisam ser serializaveis
	
	private static final long serialVersionUID = 1336519986251133825L;
	
	String especie;
	transient String regiao; // não sera serializado
	
	public Animal(String especie, String regiao) {
		this.especie = especie;
		this.regiao = regiao;
	}
	
	public void migrar(String destino) {
		this.regiao = destino;
	}
	
}

interface Voador{
	public void voar();
}

class Aguia extends Animal implements Voador{

	private static final long serialVersionUID = -5431367098359636206L;

	public Aguia(String especie, String regiao) {
		super(especie, regiao);
	}

	@Override
	public void voar() {
		
		System.out.println(this.especie + " saiu voando");
		
	}
	
}