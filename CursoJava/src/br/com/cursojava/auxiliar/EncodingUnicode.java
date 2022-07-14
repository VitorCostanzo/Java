package br.com.cursojava.auxiliar;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class EncodingUnicode {

	public static void main(String[] args) throws Exception {

		// imprimindo binarios dos caracteres
		String s = "Vítór CôrDE1r0 C0s74ńZ8";
		String[] lts = s.split("");
		List<String> letras = Arrays.asList(lts);
		for (String letra : letras) {
			System.out.print(letra.codePointAt(0) + " ");
		}
		System.out.println("\n");

		// default charset // -> Java se adapta ao S.O.
		Charset cs = Charset.defaultCharset();
		System.out.println("Charset padrão linux: " + cs.displayName());
		System.out.println();

		// array dos bytes em diferentes encodings
		byte[] bytes = s.getBytes();
		System.out.println("UTF-8: " + bytes.length + " bytes -> " + new String(bytes));

		bytes = s.getBytes("UTF-16");
		System.out.println("UTF-16: " + bytes.length + " bytes -> " + new String(bytes));

		bytes = s.getBytes("ASCII");
		System.out.println("ASCII: " + bytes.length + " bytes -> " + new String(bytes));

		bytes = s.getBytes("windows-1252");
		System.out.println("windows-1252: " + bytes.length + " bytes -> " + new String(bytes));

		bytes = s.getBytes(StandardCharsets.ISO_8859_1);
		System.out.println("ISO_8859_1: " + bytes.length + " bytes -> " + new String(bytes));

		bytes = s.getBytes(StandardCharsets.UTF_16BE);
		System.out.println("UTF_16BE: " + bytes.length + " bytes -> " + new String(bytes));

	}

}
