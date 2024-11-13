package ar.edu.unlp.info.oo1._Ejercicio20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Contrato {
	private LocalDate fechaInicio;
	private Empleado emp;

	public Contrato(Empleado emp, LocalDate fechaInicio) {
		this.emp = emp;
		this.fechaInicio = fechaInicio;
	}

	public abstract boolean isActivo();

	public abstract double calcularSueldoBasico();

	public double calcularSueldoTotal() {
		double sueldoBasico = this.calcularSueldoBasico();
		int antiguedad = this.emp.calcularAntiguedad();
		double bonificacion = 0;
		if ((antiguedad >= 5) && (antiguedad < 10)) {
			bonificacion = 0.3;
		} else if ((antiguedad >= 10) && (antiguedad < 15)) {
			bonificacion = 0.5;
		} else if ((antiguedad >= 15) && (antiguedad < 20)) {
			bonificacion = 0.7;
		} else
			bonificacion = 1.0;
		return sueldoBasico + (sueldoBasico * bonificacion);
	}

	public int getSize() {
		return (int) ChronoUnit.YEARS.between(this.fechaInicio, LocalDate.now());
	}

	public Empleado getEmpleado() {
		return this.emp;
	}

}
