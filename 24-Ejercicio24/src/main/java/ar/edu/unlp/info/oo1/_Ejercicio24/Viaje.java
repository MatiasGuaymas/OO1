package ar.edu.unlp.info.oo1._Ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
	private String origen;
	private String destino;
	private double costo;
	private Vehiculo vehiculo;
	private LocalDate fechaViaje;
	private List<Usuario> pasajeros;

	public Viaje(String origen, String destino, double costo, Vehiculo vehiculo, LocalDate fechaViaje) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.vehiculo = vehiculo;
		this.fechaViaje = fechaViaje;
		this.pasajeros = new ArrayList<Usuario>();
		this.pasajeros.add(this.vehiculo.getPropietario());
	}

	public LocalDate getFecha() {
		return this.fechaViaje;
	}

	public void registrarPasajero(Pasajero p) {
		if (this.pasajeros.size() < this.vehiculo.getCapacidad() && p.sinSaldoRojo()
				&& LocalDate.now().isBefore(this.fechaViaje.minusDays(2))) {
			this.pasajeros.add(p);
			p.agregarViaje(this);
		}
	}

	public void procesarViaje() {
		this.pasajeros.stream().forEach(p -> p.descontarSaldo(costo / this.pasajeros.size()));
	}

}
