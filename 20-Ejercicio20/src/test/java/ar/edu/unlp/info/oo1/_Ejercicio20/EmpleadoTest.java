package ar.edu.unlp.info.oo1._Ejercicio20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

	private Empleado emp;
	private Empleado emp2;
	private ContratoPorHoras ph;
	private ContratoPorHoras ph1;
	private ContratoDePlanta dp;

	@BeforeEach
	public void setUp() {
		emp = new Empleado("Mateo", "LaMorant", 123, LocalDate.of(2005, 6, 10), true, true);
		emp2 = new Empleado("Fran", "Acoster", 144, LocalDate.of(2005, 2, 22), false, false);
		ph = new ContratoPorHoras(emp, LocalDate.of(2000, 5, 15), 100, 20, LocalDate.of(2023, 12, 10));
		ph1 = new ContratoPorHoras(emp, LocalDate.of(2024, 5, 15), 100, 20, LocalDate.of(2025, 12, 10));
		dp = new ContratoDePlanta(emp2, LocalDate.of(2023, 1, 1), 1000, 500, 100);
		emp.agregarContrato(ph);
		emp.agregarContrato(ph1);
		emp2.agregarContrato(dp);
	}

	@Test
	public void testRecibo() {
		ReciboDeSueldo r = emp.generarRecibo();
		assertEquals(emp.getNombre(), r.getNombre());
		assertEquals(emp.getApellido(), r.getApellido());
		assertEquals(emp.calcularAntiguedad(), r.getAntiguedad());
		ReciboDeSueldo r2 = emp2.generarRecibo();
		assertEquals(4000, r.getMontoTotal());
		assertEquals(2000, r2.getMontoTotal());
	}
}
