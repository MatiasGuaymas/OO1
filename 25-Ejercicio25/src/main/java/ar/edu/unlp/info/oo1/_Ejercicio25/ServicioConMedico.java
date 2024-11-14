package ar.edu.unlp.info.oo1._Ejercicio25;

import java.time.DayOfWeek;

public abstract class ServicioConMedico extends ServicioGeneral {
	private Medico veterinario;

	public ServicioConMedico(Medico veterinario, Mascota m) {
		super(m);
		this.veterinario = veterinario;
	}

	public Medico getVeterinario() {
		return this.veterinario;
	}

	public int getAntiguedadVeterinario() {
		return this.veterinario.getAntiguedad();
	}

	private double calcularDomingo() {
		return this.getFecha().getDayOfWeek().equals(DayOfWeek.SUNDAY) ? 500 : 0;
	}

	protected abstract double calcularMateriales();

	protected abstract double calcularExtra();

	public double calcularCostoServicio() {
		return this.veterinario.getHonorarios() + this.calcularMateriales() + this.calcularDomingo()
				+ this.calcularExtra();
	}

}
