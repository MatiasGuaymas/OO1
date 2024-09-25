package ar.edu.unlp.info.oo1._Ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;

	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarInversion(Inversion i) {
		this.inversiones.add(i);
	}

	public double valorActual() {
		return this.inversiones.stream().mapToDouble(inversion -> inversion.valorActual()).sum();
	}

}
