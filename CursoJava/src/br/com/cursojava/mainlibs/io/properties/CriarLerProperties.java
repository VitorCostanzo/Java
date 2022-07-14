package br.com.cursojava.mainlibs.io.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class CriarLerProperties {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("login", "dwight.schrute");
		prop.setProperty("password", "beetfarm");
		prop.setProperty("url", "www.dundermifflin.com");
		
		try (FileWriter fw = new FileWriter("dwight.properties")){
			prop.store(fw, "comments");
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		try (FileReader fr = new FileReader("dwight.properties")){
			prop.load(fr);
			String login = prop.getProperty("login");
			String password = prop.getProperty("password");
			String url = prop.getProperty("url");
			
			String lido = String.format("Login: %s\nSenha: %s\nUrl: %s", login, password, url );
			
			System.out.println(lido);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
