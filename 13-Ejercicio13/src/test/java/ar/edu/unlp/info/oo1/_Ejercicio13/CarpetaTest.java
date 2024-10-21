package ar.edu.unlp.info.oo1._Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {
	private Carpeta carpeta, carpetaAuxiliar;
	private Email email1, email2;

	@BeforeEach
	void setUp() {
		carpeta = new Carpeta("Recibidos");
		carpetaAuxiliar = new Carpeta("BackUp");
		email1 = new Email("Objetos1", "Ayuda");
		email2 = new Email("Objetos2", "Proximamente");
		carpeta.agregarMail(email1);
		carpeta.agregarMail(email2);
	}

	@Test
	void testTamanioCarpeta() {
		assertEquals(33, carpeta.tamanioCarpeta());
		carpeta.eliminarMail(email1);
		carpeta.eliminarMail(email2);
		assertEquals(0, carpeta.tamanioCarpeta());
	}

	@Test
	void testBuscar() {
		assertNotNull(carpeta.buscar("Objetos1"));
		assertNull(carpeta.buscar(""));
		assertNull(carpeta.buscar("XD"));
		assertNull(carpeta.buscar(null));
	}

	@Test
	void testMover() {
		carpeta.mover(email1, carpetaAuxiliar);
		assertNotNull(carpetaAuxiliar.buscar("Objetos1"));
		assertNull(carpeta.buscar("Objetos1"));
	}

}
