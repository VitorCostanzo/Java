package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	ReajusteService service;
	Funcionario func;
	
	@BeforeEach // chamará este método antes de cada um dos testes
	public void inicializar() {
		System.out.println("inicio");
		this.service = new ReajusteService();
		this.func = new Funcionario("AAA", LocalDate.now(), new BigDecimal("1000.00"));
	}
	
	@AfterEach
	public void finalizar() {
		System.out.println("fim");
	}
	
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("antes de todos".toUpperCase());
	}
	
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("depois de todos".toUpperCase());
	}
	
	@Test
	public void reajusteDeveriaSerDeTresPorCentoDesempenhoADesejar() {
		service.reajustarSalario(func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), func.getSalario());
	}
	
	
	@Test
	public void reajusteDeveriaSerDeQuinzePorCentoDesempenhoBom() {
		service.reajustarSalario(func, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), func.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDeVintePorCentoDesempenhoOtimo() {
		service.reajustarSalario(func, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), func.getSalario());
	}
}
