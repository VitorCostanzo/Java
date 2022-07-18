package br.com.cursojava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interface_Stream {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Peter Parker");
		nomes.add("Caio");
		nomes.add("Donkey Kong");
		nomes.add("Vitor");
		nomes.add("Antedeguemon");

		// stream retornará valores e não alterará o objeto original
		System.out.print("Nomes com 5 ou menos caracteres: ");
		Stream<String> nomespequenos = nomes.stream().filter(s -> s.length() < 6);
		nomespequenos.forEach(s -> System.out.print(s + ", "));

		// contador
		System.out.println(" -> " + nomes.stream().filter(n -> n.length() < 6).count() + " nomes.");

		System.out.print("Nomes com 6 ou mais caracteres: ");
		nomes.stream().filter(n -> n.length() > 5).forEach(s -> System.out.print(s + ", "));

		// contador
		System.out.println(" -> " + nomes.stream().filter(n -> n.length() > 5).count() + " nomes.");

		// map
		System.out.print("Tamanhos dos nomes: ");
		nomes.stream().map(s -> s.length()).forEach(tamanho -> System.out.print(tamanho + "-"));
		System.out.println();

		// sum
		System.out.println("Soma do tamanho dos nomes: " + nomes.stream().mapToInt(s -> s.length()).sum());

		// average
		OptionalDouble mediaTamanho = nomes.stream().mapToInt(s -> s.length()).average();
		System.out.println(mediaTamanho.getAsDouble());

		// conversão
		Stream<Integer> tamanhos = nomes.stream().map(s -> s.length());
		tamanhos.forEach(System.out::print);
		System.out.println();

		// findAny
		// Optional -> permite receber ou não um objeto esperado / dá acesso a metodos como ifPresent, orElse ...
		Optional<String> opt = nomes.stream().filter(n -> n.length() > 50).findAny();
		System.out.println(opt.orElse("não achei"));
		nomes.stream().filter(n -> n.length() > 100).findAny().ifPresentOrElse((c -> System.out.println(c)),
				() -> System.out.println("não encontrado"));

		// Collectors -> para alterar a collection original
		nomes = nomes.stream().filter(nome -> nome.length() < 6).collect(Collectors.toList());
		nomes.forEach(System.out::print);
		System.out.println();
		
		Map<Integer, String> mapaNomes = nomes.stream().collect(Collectors.toMap(n -> n.length(), n -> n.substring(0, 3)));
		mapaNomes.forEach((k, v) -> System.out.println(v + ": eram " + k + " letras"));
		
		// parallelStream -> divide as threads, trabalha em paralelo
		nomes.parallelStream().forEach(System.out::print);
		System.out.println();
	}

}
