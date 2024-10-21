package ar.edu.unlp.info.oo1._Ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {
	private ReporteDeConstruccion reporte;
	private Cilindro cilindro;
	private Esfera esfera;
	private PrismaRectangular prismaRectangular;

	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
		cilindro = new Cilindro("Hierro", "Rojo", 10, 20);
		esfera = new Esfera("Hierro", "Azul", 8);
		prismaRectangular = new PrismaRectangular("Metal", "Azul", 10, 5, 30);
		reporte.agregarPieza(cilindro);
		reporte.agregarPieza(esfera);
		reporte.agregarPieza(prismaRectangular);
	}

	@Test
	void testVolumen() {
		assertEquals(6283, Math.round(cilindro.volumen()));
		assertEquals(2145, Math.round(esfera.volumen()));
		assertEquals(1500, prismaRectangular.volumen());
	}

	@Test
	void testSuperficie() {
		assertEquals(1885, Math.round(cilindro.superficie()));
		assertEquals(804, Math.round(esfera.superficie()));
		assertEquals(1000, prismaRectangular.superficie());
	}

	@Test
	void testVolumenDeMaterial() {
		assertEquals(8428, Math.round(reporte.getVolumenDeMaterial("Hierro")));
		assertEquals(0, reporte.getVolumenDeMaterial("XD"));
		assertEquals(0, reporte.getVolumenDeMaterial(null));
	}

	void testSuperficieDeColor() {
		assertEquals(1804, Math.round(reporte.getSuperficieDeColor("Azul")));
		assertEquals(0, reporte.getSuperficieDeColor("Verde"));
		assertEquals(0, reporte.getSuperficieDeColor(null));
	}

}
