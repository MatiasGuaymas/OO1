package ar.edu.unlp.info.oo1._Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
	private ClienteDeCorreo clienteCorreo;
	private Carpeta carpeta;

	@BeforeEach
	void setUp() {
		clienteCorreo = new ClienteDeCorreo("Matias");
		carpeta = new Carpeta("Eliminados");
		clienteCorreo.agregarCarpeta(carpeta);
	}

	@Test
	void testBuscar() {
		Email email = new Email("hola", "chau");
		clienteCorreo.recibir(email);
		assertNotNull(clienteCorreo.buscar("hola"));
		clienteCorreo.mover(email, carpeta);
		assertNotNull(clienteCorreo.buscar("hola"));
	}

	@Test
	void testEspacioOcupado() {
		Email email1 = new Email("1", "2");
		Email email2 = new Email("Uno", "Dos");
		clienteCorreo.recibir(email1);
		clienteCorreo.mover(email2, carpeta);
		assertEquals(8, clienteCorreo.espacioOcupado());
	}

}
