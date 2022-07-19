package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void funcionarioComSalarioAltoDeveriaLancarIllegalArgumentException() {
		BonusService service = new BonusService();
		
		// assertThrows(IllegalArgumentException.class, 
		//		() -> service.calcularBonus(new Funcionario("Teste", LocalDate.now(), new BigDecimal("25000.00"))));
		// ou
		
		try {
			service.calcularBonus(new Funcionario("Teste", LocalDate.now(), new BigDecimal("25000.00")));
			fail("Não foi lançada a Exception"); // força a falha do teste, a linha de cima deveria causar exception
		} catch (Exception e) {
			assertEquals("Funcionário com salário alto não pode receber bônus.", e.getMessage());
		}
		
	}
	
	@Test
	void bonusDeveriaSerDezPorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Vitor", LocalDate.now(), new BigDecimal("2500.00")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerMilReaisParaSalarioDeDezMil() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Vitor", LocalDate.now(), new BigDecimal("10000.00")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
}
