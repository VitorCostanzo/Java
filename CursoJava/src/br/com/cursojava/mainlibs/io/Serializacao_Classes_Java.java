package br.com.cursojava.mainlibs.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializacao_Classes_Java {
// transformar o objeto na memoria em um fluxo de bits e bytes

	public static void main(String[] args) {
		
		String nome = "Vitor Cordeiro Costanzo";
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Arquivos/objeto.bin"))){
			oos.writeObject(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Arquivos/objeto.bin"))){
			String nomelido = (String) ois.readObject();
			System.out.println(nomelido);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
