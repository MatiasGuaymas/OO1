package ar.edu.unlp.info.oo1._Ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Propiedad> propiedades;

	public Usuario(String nombre, String direccion, int DNI) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		this.propiedades = new ArrayList<Propiedad>();
	}

	public void agregarPropiedad(Propiedad p) {
		this.propiedades.add(p);
	}

	public double calcularIngresos() {
		return this.propiedades.stream().mapToDouble(p -> p.montoTotal()).sum();
	}

	public int cantPropiedades() {
		return this.propiedades.size();
	}

}
