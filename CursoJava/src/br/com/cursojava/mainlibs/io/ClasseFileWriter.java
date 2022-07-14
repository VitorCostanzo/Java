package br.com.cursojava.mainlibs.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ClasseFileWriter {

	public static void main(String[] args) throws Exception{

//		FileWriter fw = new FileWriter("ArqFileWriter.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
// ou
		BufferedWriter bw = new BufferedWriter(new FileWriter("ArqFileWriter.txt"));
		
		bw.write("String");
		bw.newLine(); // ou bw.write(System.lineSeparator());
		bw.write("do arquivo !!!");
		bw.close();
		
	}
}
