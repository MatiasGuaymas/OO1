package ar.edu.unlp.info.oo1._Ejercicio19;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private String dirOrigen;
	private String dirDestino;
	private double peso;

	public Envio(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double peso) {
		super();
		this.fechaDespacho = fechaDespacho;
		this.dirOrigen = dirOrigen;
		this.dirDestino = dirDestino;
		this.peso = peso;
	}

	public LocalDate getFechaDespacho() {
		return fechaDespacho;
	}

	public String getDirOrigen() {
		return dirOrigen;
	}

	public String getDirDestino() {
		return dirDestino;
	}

	public double getPeso() {
		return peso;
	}

	public abstract double getMonto();

}
