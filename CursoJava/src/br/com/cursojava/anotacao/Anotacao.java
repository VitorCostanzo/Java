package br.com.cursojava.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface Anotacao {
	
	@Retention(value = RetentionPolicy.RUNTIME) // identificada pelo runtime
	@Target(ElementType.METHOD) // A anotação criada só sera válida acima de um método
	public @interface CriandoAnnotation {
		
	}
}
