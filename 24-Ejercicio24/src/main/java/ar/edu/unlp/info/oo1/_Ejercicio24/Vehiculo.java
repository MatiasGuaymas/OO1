package ar.edu.unlp.info.oo1._Ejercicio24;

import java.time.Year;

public class Vehiculo {
	private Conductor propietario;
	private String descripcion;
	private int capacidad;
	private int anioFabricacion;
	private double valor;

	public Vehiculo(Conductor propietario, String descripcion, int capacidad, int anioFabricacion, double valor) {
		super();
		this.propietario = propietario;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
		this.anioFabricacion = anioFabricacion;
		this.valor = valor;
	}

	public Conductor getPropietario() {
		return this.propietario;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public int getAntiguedad() {
		return Year.now().getValue() - this.anioFabricacion;
	}

	public double getValor() {
		return valor;
	}

}
