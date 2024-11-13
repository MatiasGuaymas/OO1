package ar.edu.unlp.info.oo1._Ejercicio20;

import java.time.LocalDate;

public class ReciboDeSueldo {
	private String nombre;
	private String apellido;
	private int CUIL;
	private int antiguedad;
	private LocalDate fechaCreacion;
	private double montoTotal;

	public ReciboDeSueldo(String nombre, String apellido, int CUIL, int antiguedad, LocalDate fechaCreacion,
			double montoTotal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.antiguedad = antiguedad;
		this.fechaCreacion = fechaCreacion;
		this.montoTotal = montoTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getCUIL() {
		return CUIL;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

}
