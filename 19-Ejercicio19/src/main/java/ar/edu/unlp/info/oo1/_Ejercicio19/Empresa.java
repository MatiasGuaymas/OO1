package ar.edu.unlp.info.oo1._Ejercicio19;

public class Empresa extends Cliente {
	private int CUIT;

	public Empresa(String nombre, String direccion, int CUIT) {
		super(nombre, direccion);
		this.CUIT = CUIT;
	}

	protected double montoAPagarConDescuento(double precio) {
		return precio;
	}

}
