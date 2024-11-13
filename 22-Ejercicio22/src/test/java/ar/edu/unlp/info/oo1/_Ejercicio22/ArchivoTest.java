package ar.edu.unlp.info.oo1._Ejercicio22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {
	private Archivo arc;

	@BeforeEach
	void setUp() {
		arc = new Archivo("Archivo");
	}

	@Test
	void tamanio() {
		assertEquals(7, arc.tamanio());
	}
}
