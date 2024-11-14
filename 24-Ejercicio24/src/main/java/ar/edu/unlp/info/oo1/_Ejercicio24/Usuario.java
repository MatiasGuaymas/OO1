package ar.edu.unlp.info.oo1._Ejercicio24;

public abstract class Usuario {
	private String nombre;
	private double saldo;

	public Usuario(String nombre, double saldo) {
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void cargarSaldo(double monto) {
		this.saldo += monto + this.recargo();
	}

	protected abstract double recargo();

	public void descontarSaldo(double monto) {
		this.saldo -= monto - this.bonificacion();
	}

	protected abstract double bonificacion();
}
