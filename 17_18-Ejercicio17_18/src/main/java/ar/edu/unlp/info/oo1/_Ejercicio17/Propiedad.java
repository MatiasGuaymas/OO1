package ar.edu.unlp.info.oo1._Ejercicio17;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo1._Ejercicio14.DateLapse;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precioNoche;
	private List<Reserva> reservas;
	private PoliticaDeCancelacion politica;

	public Propiedad(String direccion, String nombre, double precio, PoliticaDeCancelacion pol) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioNoche = precio;
		this.reservas = new ArrayList<Reserva>();
		this.politica = pol;
	}

	public double getPrecioNoche() {
		return this.precioNoche;
	}

	public List<Reserva> getReservas() {
		return new ArrayList<Reserva>(reservas);
	}

	public boolean isDisponible(DateLapse periodo) {
		return this.reservas.stream().noneMatch(r -> r.isDisponible(periodo));
	}

	public Reserva crearReserva(Usuario inquilino, DateLapse periodo) {
		if (this.isDisponible(periodo)) {
			Reserva r = new Reserva(periodo, this, inquilino);
			this.reservas.add(r);
			return r;
		}
		return null;
	}

	public double cancelarReserva(Reserva r) {
		if (!r.estaEnCurso()) {
			this.reservas.remove(r);
			return this.politica.reembolsar(r);
		}
		return 0;
	}

	public double montoTotal() {
		return this.reservas.stream().mapToDouble(r -> r.costo()).sum();
	}

}
