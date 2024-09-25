package ar.edu.unlp.info.oo1._Ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	public double valorActual() {
		double cantDias = ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now());
		return this.montoDepositado + (this.montoDepositado * this.porcentajeDeInteresDiario * cantDias);
	}
}
