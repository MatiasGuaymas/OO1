package ar.edu.unlp.info.oo1._Ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1._Ejercicio14.DateLapse;

class TestEnvios {
	private Individuo per;
	private Empresa emp;
	private Envio env1;
	private Envio env2;
	private Envio env3;

	@BeforeEach
	public void SetUp() {
		per = new Individuo("Carlos", "116, 175", 46628);
		emp = new Empresa("Globant", "Moreno 1700", 1231);
		env1 = new EnvioLocal(LocalDate.of(2024, 10, 5), "Tolosa", "Los Hornos", 100.00, true);
		env2 = new EnvioInterurbano(LocalDate.of(2024, 11, 10), "Moron", "La Matanza", 250.0, 100);
		env3 = new EnvioInternacional(LocalDate.of(2024, 7, 15), "Argentina", "Alemania", 1500);
	}

	@Test
	void testAgregarEnvio() {
		per.agregarEnvio(env1);
		per.agregarEnvio(env2);
		per.agregarEnvio(env3);
		assertEquals(3, per.getEnvios().size());
	}

	@Test
	void testMontos() {
		per.agregarEnvio(env1);
		per.agregarEnvio(env2);
		per.agregarEnvio(env3);
		emp.agregarEnvio(env1);
		emp.agregarEnvio(env2);
		emp.agregarEnvio(env3);
		assertEquals(1500, emp.montoAPagar(new DateLapse(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 30))));
		assertEquals(23000, emp.montoAPagar(new DateLapse(LocalDate.of(2024, 7, 1), LocalDate.of(2024, 7, 31))));
		assertEquals(5000, emp.montoAPagar(new DateLapse(LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 30))));
		assertEquals(29500, emp.montoAPagar(new DateLapse(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 12, 31))));
		assertEquals(1350, per.montoAPagar(new DateLapse(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 31))));
		assertEquals(26550.0, per.montoAPagar(new DateLapse(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 12, 31))));
	}

}
