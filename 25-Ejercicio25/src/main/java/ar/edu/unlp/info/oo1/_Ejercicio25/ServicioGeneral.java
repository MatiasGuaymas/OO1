package ar.edu.unlp.info.oo1._Ejercicio25;

import java.time.LocalDate;

public abstract class ServicioGeneral {
	private Mascota mascota;
	private LocalDate fecha;

	public ServicioGeneral(Mascota m) {
		this.mascota = m;
		this.mascota.agregarServicio(this);
		this.fecha = LocalDate.now();
	}

	public Mascota getMascota() {
		return this.mascota;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public abstract double calcularCostoServicio();
}
