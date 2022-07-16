package br.com.cursojava.mainlibs.io;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Classe_Base64 {

	
	public static void main(String[] args) throws Exception{
		
		String imagem64 = encode64("Arquivos/dwight.jpg");
		System.out.println(imagem64);
		
		try (FileOutputStream fos = new FileOutputStream(new File("Arquivos/dwightcopy.jpg"))){
			fos.write(decode64(imagem64));
		}
		
	}
	
	public static String encode64(String imagePath) throws Exception{
		byte[] data = Files.readAllBytes(Paths.get(imagePath));
		return Base64.getEncoder().encodeToString(data);
	}
	
	public static byte[] decode64(String base64Strig) {
		return Base64.getDecoder().decode(base64Strig);
	}
}
