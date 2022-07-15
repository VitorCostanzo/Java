package br.com.cursojava.mainlibs.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacaoClassesJava {
// transformar o objeto na memoria em um fluxo de bits e bytes

	public static void main(String[] args) {
		
		String nome = "Vitor Cordeiro Costanzo";
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"))){
			oos.writeObject(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"))){
			String nomelido = (String) ois.readObject();
			System.out.println(nomelido);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
