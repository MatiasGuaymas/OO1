package ar.edu.unlp.info.oo1._Ejercicio19;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {

	public EnvioInternacional(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double peso) {
		super(fechaDespacho, dirOrigen, dirDestino, peso);
	}

	@Override
	public double getMonto() {
		double peso = this.getPeso();
		return peso <= 1000 ? (5000 + 10 * peso) : (5000 + 12 * peso);
	}

}
