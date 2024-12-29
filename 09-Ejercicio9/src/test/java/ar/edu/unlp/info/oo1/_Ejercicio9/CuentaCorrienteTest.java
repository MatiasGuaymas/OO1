package ar.edu.unlp.info.oo1._Ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {
	private CuentaCorriente cuentaCorriente1;
	private CuentaCorriente cuentaCorriente2;

	@BeforeEach
	void setUp() {
		cuentaCorriente1 = new CuentaCorriente();
		cuentaCorriente2 = new CuentaCorriente();
	}

	@Test
	void testExtraer() {
		cuentaCorriente1.setDescubierto(500);
		cuentaCorriente1.depositar(100);
		assertTrue(cuentaCorriente1.extraer(300));
		assertEquals(-200, cuentaCorriente1.getSaldo());
		assertFalse(cuentaCorriente1.extraer(600));
	}

	@Test
	void testDepositar() {
		cuentaCorriente1.depositar(1000);
		cuentaCorriente1.extraer(400);
		cuentaCorriente1.depositar(2000);
		assertEquals(2600, cuentaCorriente1.getSaldo());
	}

	@Test
	void testTransferir() {
		cuentaCorriente1.setDescubierto(500);
		cuentaCorriente1.depositar(100);
		assertTrue(cuentaCorriente1.transferirACuenta(500, cuentaCorriente2));
		assertEquals(-400, cuentaCorriente1.getSaldo());
	}
}
