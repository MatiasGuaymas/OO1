package ar.edu.unlp.info.oo1._Ejercicio19;

public class Individuo extends Cliente {
	private int DNI;

	public Individuo(String nombre, String direccion, int DNI) {
		super(nombre, direccion);
		this.DNI = DNI;
	}

	@Override
	protected double montoAPagarConDescuento(double precio) {
		return precio - precio * 0.1;
	}

}
