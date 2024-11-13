package ar.edu.unlp.info.oo1._Ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1._Ejercicio14.DateLapse;

class UsuarioTest {
	Usuario user;
	Propiedad prop1;
	Propiedad prop2;

	@BeforeEach
	public void setUp() {
		user = new Usuario("Francisco", "116, 175", 46628567);
		prop1 = new Propiedad("115, 2212", "Alto Rancho", 2000, new PoliticaDeCancelacionFlexible());
		prop2 = new Propiedad("60, 2212", "Casa Leo", 5000, new PoliticaDeCancelacionFlexible());
	}

	@Test
	public void testAgregarPropiedades() {
		user.agregarPropiedad(prop1);
		user.agregarPropiedad(prop2);
		assertEquals(2, user.cantPropiedades());
	}

	@Test
	public void testCalcularIngresos() {
		user.agregarPropiedad(prop1);
		user.agregarPropiedad(prop2);
		prop1.crearReserva(new Usuario("Cliente1", "Dirección 1", 12345678),
				new DateLapse(LocalDate.of(2024, 2, 10), LocalDate.of(2024, 2, 15)));
		prop2.crearReserva(new Usuario("Cliente2", "Dirección 2", 87654321),
				new DateLapse(LocalDate.of(2024, 2, 10), LocalDate.of(2024, 2, 12)));
		assertEquals(20000, user.calcularIngresos());
	}
}
