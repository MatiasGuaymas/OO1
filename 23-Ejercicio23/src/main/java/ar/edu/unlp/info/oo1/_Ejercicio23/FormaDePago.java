package ar.edu.unlp.info.oo1._Ejercicio23;

public abstract class FormaDePago {

	public double montoTotal(Producto p) {
		return p.getPrecio() + this.recargo(p);
	}

	protected abstract double recargo(Producto p);
}
