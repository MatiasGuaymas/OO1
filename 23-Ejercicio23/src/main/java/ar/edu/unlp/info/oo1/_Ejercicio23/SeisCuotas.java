package ar.edu.unlp.info.oo1._Ejercicio23;

public class SeisCuotas extends FormaDePago {

	@Override
	protected double recargo(Producto p) {
		return p.getPrecio() * 1.20;
	}

}
