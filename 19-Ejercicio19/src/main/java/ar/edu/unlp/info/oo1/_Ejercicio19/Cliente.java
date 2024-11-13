package ar.edu.unlp.info.oo1._Ejercicio19;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo1._Ejercicio14.DateLapse;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios;

	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.envios = new ArrayList<Envio>();
	}

	public void agregarEnvio(Envio e) {
		this.envios.add(e);
	}

	public double montoAPagar(DateLapse periodo) {
		return this.envios.stream().filter(fecha -> periodo.includesDate(fecha.getFechaDespacho()))
				.mapToDouble(monto -> this.montoAPagarConDescuento(monto.getMonto())).sum();
	}

	protected abstract double montoAPagarConDescuento(double precio);

	public List<Envio> getEnvios() {
		return new ArrayList<Envio>(this.envios);
	}
}
