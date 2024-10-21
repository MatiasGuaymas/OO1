package ar.edu.unlp.info.oo1._Ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {
	private Inversor inversor;
	private InversionEnAcciones accion;
	private PlazoFijo plazoFijo;

	@BeforeEach
	void setUp() {
		inversor = new Inversor("Matias");
		accion = new InversionEnAcciones("Crypto", 10, 100);
		plazoFijo = new PlazoFijo(LocalDate.of(2024, 10, 10), 100, 5);
	}

	@Test
	void testInversionEnAcciones() {
		assertEquals(1000, accion.valorActual());
	}

	@Test
	void testPlazoFijo() {
		assertEquals(5100, plazoFijo.valorActual());
	}

	@Test
	void testInversor() {
		assertEquals(0, inversor.valorActual());
		inversor.agregarInversion(accion);
		inversor.agregarInversion(plazoFijo);
		assertEquals(6100, inversor.valorActual());
	}
}
