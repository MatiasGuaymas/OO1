package ar.edu.unlp.info.oo1._Ejercicio22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {
	private Email email, emailVacio;
	private Archivo arc1, arc2;

	@BeforeEach
	void setUp() {
		email = new Email("Objetos1", "Ejercicio13");
		emailVacio = new Email("", "");
		arc1 = new Archivo("Archivo1");
		arc2 = new Archivo("Archivo2");
		email.agregarAdjunto(arc1);
		email.agregarAdjunto(arc2);
	}

	@Test
	void testTamanioEmail() {
		assertEquals(35, email.tamanioEmail());
		assertEquals(0, emailVacio.tamanioEmail());
	}

	@Test
	void testCumple() {
		assertTrue(email.cumple("Objetos1"));
		assertTrue(emailVacio.cumple(""));
		assertFalse(email.cumple(null));
		assertFalse(email.cumple("Hola!"));
	}
}
