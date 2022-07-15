package br.com.cursojava.mainlibs.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializacaoClassesProprias {

	public static void main(String[] args) {
		
		Individuo vitor = new Individuo("Vitor", 26, "Desenvolvedor", 1.83, 97);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Arquivos/objeto.bin"))){
			oos.writeObject(vitor);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Arquivos/objeto.bin"))){
			Individuo recebido = (Individuo) ois.readObject();
			System.out.println(recebido);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}


class Individuo implements Serializable{
	
private static final long serialVersionUID = 1723465872L; // aparecerá no stacktrace

// Pode causar InvalidClassException se o ID esperado não for o mesmo lido
// com srialVersionUID podemos fazer mudanças compativeis nas classes e manter o mesmo id

	String nome;
	int idade;
	String profissao;
	double altura;
	double peso;
	
	public Individuo(String nome, int idade, String profissao, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
		this.altura = altura;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nProfissão: %s\nAltura: %.2f\nPeso: %.2f", nome, idade, profissao, altura, peso);
	}
}