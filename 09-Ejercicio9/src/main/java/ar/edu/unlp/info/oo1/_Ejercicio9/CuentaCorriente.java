package ar.edu.unlp.info.oo1._Ejercicio9;

public class CuentaCorriente extends Cuenta {
	private double descubierto;

	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	public boolean puedeExtraer(double monto) {
		return monto <= (this.getSaldo() + this.descubierto);
	}
}
