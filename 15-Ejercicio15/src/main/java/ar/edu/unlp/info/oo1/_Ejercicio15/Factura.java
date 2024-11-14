package ar.edu.unlp.info.oo1._Ejercicio15;

import java.time.LocalDate;

public class Factura {
	private LocalDate fecha;
	private Usuario usuario;
	private double bonificacion;
	private double montoTotal;

	public Factura(Usuario user, double bonif, double monto) {
		this.fecha = LocalDate.now();
		this.usuario = user;
		this.bonificacion = bonif;
		this.montoTotal = monto;
	}

	public double montoTotal() {
		return this.montoTotal;
	}
}
