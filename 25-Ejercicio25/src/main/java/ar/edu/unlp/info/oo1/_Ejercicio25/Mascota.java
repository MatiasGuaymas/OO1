package ar.edu.unlp.info.oo1._Ejercicio25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	private String nombre;
	private LocalDate fechaNacimiento;
	private String especie;
	private List<ServicioGeneral> servicios;

	public Mascota(String nombre, LocalDate fechaNacimiento, String especie) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.especie = especie;
		this.servicios = new ArrayList<ServicioGeneral>();
	}

	public void agregarServicio(ServicioGeneral s) {
		this.servicios.add(s);
	}

	public boolean cumpleServicio(int cant) {
		return this.servicios.size() > cant;
	}

	public double recaudacion(LocalDate fecha) {
		return this.servicios.stream().filter(s -> s.getFecha().equals(fecha))
				.mapToDouble(ser -> ser.calcularCostoServicio()).sum();
	}
}
