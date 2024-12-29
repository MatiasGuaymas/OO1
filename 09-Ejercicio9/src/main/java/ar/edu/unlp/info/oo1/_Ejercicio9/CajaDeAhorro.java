package ar.edu.unlp.info.oo1._Ejercicio9;

public class CajaDeAhorro extends Cuenta {
	public CajaDeAhorro() {
		super();
	}

	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}

	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + (monto * 0.02));
	}

	@Override
	public boolean puedeExtraer(double monto) {
		return this.getSaldo() >= monto + (monto * 0.02) ? true : false;
	}

}
