package ar.edu.unlp.info.oo1._Ejercicio23;

public abstract class FormaDePago {

	public double montoTotal(double precio) {
		return precio + this.recargo(precio);
	}

	protected abstract double recargo(double precio);
}
