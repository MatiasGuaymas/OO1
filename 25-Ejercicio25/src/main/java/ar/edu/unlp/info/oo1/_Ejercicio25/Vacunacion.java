package ar.edu.unlp.info.oo1._Ejercicio25;

public class Vacunacion extends ServicioConMedico {
	private String vacuna;
	private double precioVacuna;

	public Vacunacion(Medico veterinario, Mascota mascota, String vacuna, double precioVacuna) {
		super(veterinario, mascota);
		this.vacuna = vacuna;
		this.precioVacuna = precioVacuna;
	}

	protected double calcularMateriales() {
		return 500;
	}

	protected double calcularExtra() {
		return this.precioVacuna;
	}
}
