package ar.edu.unlp.info.oo1._Ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {
	private CajaDeAhorro cajaDeAhorro1;
	private CajaDeAhorro cajaDeAhorro2; // Podria instanciarse solamente en el transferirACuenta

	@BeforeEach
	void setUp() {
		cajaDeAhorro1 = new CajaDeAhorro();
		cajaDeAhorro2 = new CajaDeAhorro();
	}

	@Test
	void testConstructor() {
		assertEquals(0, cajaDeAhorro1.getSaldo());
	}

	@Test
	void testDepositar() {
		this.cajaDeAhorro1.depositar(400);
		assertEquals(392, cajaDeAhorro1.getSaldo());
	}

	@Test
	void testExtraer() {
		this.cajaDeAhorro1.depositar(400);
		this.cajaDeAhorro1.extraer(350);
		assertEquals(35, cajaDeAhorro1.getSaldo());
		assertFalse(cajaDeAhorro1.extraer(100));
	}

	@Test
	void testTransferirACuenta() {
		this.cajaDeAhorro1.depositar(400);
		this.cajaDeAhorro1.transferirACuenta(300, cajaDeAhorro2);
		assertEquals(86, cajaDeAhorro1.getSaldo());
		assertEquals(294, cajaDeAhorro2.getSaldo());
	}

}
