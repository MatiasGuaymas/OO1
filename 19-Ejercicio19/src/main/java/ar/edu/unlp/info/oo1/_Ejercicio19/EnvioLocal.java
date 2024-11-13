package ar.edu.unlp.info.oo1._Ejercicio19;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
	private boolean envioRapido;

	public EnvioLocal(LocalDate fechaDespacho, String dirOrigen, String dirDestino, double peso, boolean envioRapido) {
		super(fechaDespacho, dirOrigen, dirDestino, peso);
		this.envioRapido = envioRapido;
	}

	@Override
	public double getMonto() {
		if (this.envioRapido) {
			return 1500;
		}
		return 1000;
	}

}
