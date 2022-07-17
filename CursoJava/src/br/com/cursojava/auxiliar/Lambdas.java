package br.com.cursojava.auxiliar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

// Lambdas (->)

public class Lambdas {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("ovo");
		palavras.add("palavra");
		palavras.add("paralelepipedo");
		palavras.add("oi");
		palavras.add("interessante");
		
		// foreach
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.print(s + "   ");
			}
		});
		System.out.println();
		// ou
		palavras.forEach(p -> System.out.print(p + "   "));
		// ou
		System.out.println();
		palavras.forEach(System.out::print); // method reference
		System.out.println();

		
		// sort
		palavras.sort(new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.length() - a.length();
			}
		});
		System.out.println(palavras);
		// agora da menor para a maior
		palavras.sort(Comparator.comparing(s -> s.length()));
		// ou
		palavras.sort(Comparator.comparing(String::length)); // method reference
		System.out.println(palavras);
		
		
		
		// lambdas com runnables
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Executando um runnable");
			}
		}).start();

		new Thread(() -> System.out.println("Executando um runnable com lambda")).start();

	}

}