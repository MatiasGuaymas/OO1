package ar.edu.unlp.info.oo1.Ejercicio3_Presupuesto;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;

	public Item(String detalle, int cantidad, double costo) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costo;
	}

	public String getDetalle() {
		return detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public double costo() {
		return this.cantidad * this.costoUnitario;
	}

}
