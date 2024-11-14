package ar.edu.unlp.info.oo1._Ejercicio25;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Medico {
	private String nombre;
	private LocalDate fechaIngreso;
	private double honorarios;

	public Medico(String nombre, LocalDate fechaIngreso, double honorarios) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.honorarios = honorarios;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public double getHonorarios() {
		return honorarios;
	}

	public int getAntiguedad() {
		return (int) ChronoUnit.YEARS.between(this.fechaIngreso, LocalDate.now());
	}

}
