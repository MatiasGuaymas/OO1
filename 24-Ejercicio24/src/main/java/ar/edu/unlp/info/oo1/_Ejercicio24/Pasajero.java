package ar.edu.unlp.info.oo1._Ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario {
	private List<Viaje> viajesRealizados;

	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
		this.viajesRealizados = new ArrayList<Viaje>();
	}

	public void agregarViaje(Viaje v) {
		this.viajesRealizados.add(v);
	}

	public boolean sinSaldoRojo() {
		return this.getSaldo() >= 0;
	}

	public boolean debeCobrarComision() {
		return this.viajesRealizados.stream().noneMatch(v -> v.getFecha().isAfter(LocalDate.now().minusDays(30)));
	}

	protected double recargo() {
		if (debeCobrarComision()) {
			return this.getSaldo() * 0.1;
		}
		return 0;
	}

	protected double bonificacion() {
		if (this.viajesRealizados.size() > 0) {
			return 500;
		}
		return 0;
	}

}
