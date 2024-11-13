package ar.edu.unlp.info.oo1._Ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1._Ejercicio14.DateLapse;

class PropiedadTest {
	Usuario userCliente;
	Propiedad prop1;

	@BeforeEach
	public void setUp() {
		userCliente = new Usuario("Tobias", "117, 331", 4859288);
		prop1 = new Propiedad("115, 2212", "Alto Rancho", 2000, new PoliticaDeCancelacionFlexible());
	}

	@Test
	public void testCrearReservas() {
		DateLapse periodo1 = new DateLapse(LocalDate.of(2024, 2, 10), LocalDate.of(2024, 2, 15));
		DateLapse periodo2 = new DateLapse(LocalDate.of(2024, 5, 10), LocalDate.of(2024, 5, 15));
		DateLapse periodoSolapado = new DateLapse(LocalDate.of(2024, 2, 12), LocalDate.of(2024, 2, 18));

		assertTrue(prop1.crearReserva(userCliente, periodo1) != null);
		assertFalse(prop1.crearReserva(userCliente, periodoSolapado) != null);
		assertTrue(prop1.crearReserva(userCliente, periodo2) != null);
		assertFalse(prop1.isDisponible(periodo1));
	}

	@Test
	public void testCancelarReserva() {
		DateLapse periodo = new DateLapse(LocalDate.of(2024, 2, 10), LocalDate.of(2024, 2, 15));
		Reserva reserva = prop1.crearReserva(userCliente, periodo);
		assertEquals(1, prop1.getReservas().size());
		assertFalse(prop1.isDisponible(periodo));
		assertTrue(prop1.cancelarReserva(reserva) > 0);
		assertEquals(0, prop1.getReservas().size());
		assertTrue(prop1.isDisponible(periodo));
	}

}
