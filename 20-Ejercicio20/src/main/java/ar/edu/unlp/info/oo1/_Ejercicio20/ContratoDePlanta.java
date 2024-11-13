package ar.edu.unlp.info.oo1._Ejercicio20;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato {
	private double sueldoMensual;
	private double montoConyuge;
	private double montoHijo;

	public ContratoDePlanta(Empleado emp, LocalDate fechaInicio, double sueldoMensual, double montoConyuge,
			double montoHijo) {
		super(emp, fechaInicio);
		this.sueldoMensual = sueldoMensual;
		this.montoConyuge = montoConyuge;
		this.montoHijo = montoHijo;
	}

	public boolean isActivo() {
		return true;
	}

	public double calcularSueldoBasico() {
		double sueldoBasico = this.sueldoMensual;
		if (this.getEmpleado().tieneHijos()) {
			sueldoBasico += this.montoHijo;
		}
		if (this.getEmpleado().tieneConyugue()) {
			sueldoBasico += this.montoConyuge;
		}
		return sueldoBasico;
	}
}
