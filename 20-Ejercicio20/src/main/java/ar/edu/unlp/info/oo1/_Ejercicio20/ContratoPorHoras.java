package ar.edu.unlp.info.oo1._Ejercicio20;

import java.time.LocalDate;

public class ContratoPorHoras extends Contrato {
	private double valorHora;
	private int cantHoras;
	private LocalDate fechaFin;

	public ContratoPorHoras(Empleado emp, LocalDate fechaInicio, double valorHora, int cantHoras, LocalDate fechaFin) {
		super(emp, fechaInicio);
		this.valorHora = valorHora;
		this.cantHoras = cantHoras;
		this.fechaFin = fechaFin;
	}

	public boolean isActivo() {
		return this.fechaFin.isAfter(LocalDate.now());
	}

	public double calcularSueldoBasico() {
		return this.valorHora * this.cantHoras;
	}
}
