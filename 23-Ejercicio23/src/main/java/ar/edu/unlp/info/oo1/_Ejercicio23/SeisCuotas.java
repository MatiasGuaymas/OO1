package ar.edu.unlp.info.oo1._Ejercicio23;

public class SeisCuotas extends FormaDePago {

	@Override
	protected double recargo(double precio) {
		return precio * 1.20;
	}

}
