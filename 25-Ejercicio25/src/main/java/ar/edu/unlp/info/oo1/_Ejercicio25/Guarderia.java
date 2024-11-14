package ar.edu.unlp.info.oo1._Ejercicio25;

public class Guarderia extends ServicioGeneral {
	private int cantDias;

	public Guarderia(Mascota m, int cantDias) {
		super(m);
		this.cantDias = cantDias;
	}

	public double calcularCostoServicio() {
		double precio = this.cantDias * 500;
		if (this.getMascota().cumpleServicio(5)) {
			precio -= precio * 0.1;
		}
		return precio;
	}

}
