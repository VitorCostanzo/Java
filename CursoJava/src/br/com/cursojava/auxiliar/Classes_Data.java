package br.com.cursojava.auxiliar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Classes_Data {

	public static void main(String[] args) {
		
		// localdate
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje + " = " + hoje.format(formatador));
		
		LocalDate olimpiadas = LocalDate.of(2026, Month.JUNE, 5);
		System.out.println(olimpiadas);
		int anoOlimpiadas = olimpiadas.getYear();
		int mesOlimpiadas = olimpiadas.getMonthValue();
		int diaOlimpiadas = olimpiadas.getDayOfMonth();
		System.out.println(String.format("Inicio das Olimpiadas: %02d/%02d/%s", diaOlimpiadas, mesOlimpiadas, anoOlimpiadas));
		
		Period faltam = Period.between(hoje, olimpiadas);
		System.out.println(String.format("Faltam %s anos, %s meses e %s dias para as Olimpiadas!",
				faltam.getYears(), faltam.getMonths(), faltam.getDays()));
		
		
		
		// localdatetime
		LocalDateTime agora = LocalDateTime.now();
		formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println(agora.format(formatador));
		
		// Outras Classes
		YearMonth mesDoAno = YearMonth.of(anoOlimpiadas, mesOlimpiadas);
		System.out.println(mesDoAno);
		
		MonthDay diaDoMes = MonthDay.now();
		System.out.println(diaDoMes);
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		ZonedDateTime aquiagora = ZonedDateTime.now();
		System.out.println(aquiagora);
				
	}
	
}
