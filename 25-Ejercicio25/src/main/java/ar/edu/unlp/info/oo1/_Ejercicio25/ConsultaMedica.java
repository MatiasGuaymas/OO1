package ar.edu.unlp.info.oo1._Ejercicio25;

import java.time.LocalDate;

public class ConsultaMedica extends ServicioConMedico {
	private LocalDate fechaAtencion;

	public ConsultaMedica(Medico veterinario, Mascota mascota) {
		super(veterinario, mascota);
		this.fechaAtencion = LocalDate.now();
	}

	protected double calcularMateriales() {
		return 300;
	}

	protected double calcularExtra() {
		return this.getAntiguedadVeterinario() * 100;
	}
}
