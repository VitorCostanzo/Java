package br.com.cursojava.basico;

import java.util.ArrayList;
import java.util.List;

public class Loops {

	public static void main(String[] args) {
		
		loopFor();
		loopForEach();
		loopWhile();
		
	}
	
	public static void loopFor(){
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(j <= i) {
					System.out.print("* ");
				}
			}	
			System.out.println("");
		}
		
	}
	
	public static void loopForEach(){
		
		List<Integer> pares = new ArrayList<>();
		pares.add(2);
		pares.add(4);
		pares.add(6);
		pares.add(8);
		pares.add(10);
		
		for (Integer numeroPar : pares) {
			System.out.println(numeroPar);
		}
		
	}

	public static void loopWhile(){
		
		int i = 1;
		while (i <= 10) {
			
			if (i % 2 == 0)	System.out.println(i);
			i++;
			
		}
		
	}
}
