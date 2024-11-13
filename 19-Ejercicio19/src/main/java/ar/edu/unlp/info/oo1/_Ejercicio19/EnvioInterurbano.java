package ar.edu.unlp.info.oo1._Ejercicio19;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
	private double distanciaKm;

	public EnvioInterurbano(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double peso,
			int distanciaKm) {
		super(fechaDespacho, dirOrigen, dirDestino, peso);
		this.distanciaKm = distanciaKm;
	}

	@Override
	public double getMonto() {
		double peso = this.getPeso();
		if (this.distanciaKm <= 100)
			return 20 * peso;
		else if (this.distanciaKm <= 500)
			return 25 * peso;
		return 30 * peso;
	}

}
