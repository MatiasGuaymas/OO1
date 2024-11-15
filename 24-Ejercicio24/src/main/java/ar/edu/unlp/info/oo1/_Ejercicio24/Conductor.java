package ar.edu.unlp.info.oo1._Ejercicio24;

public class Conductor extends Usuario {
	private Vehiculo vehiculo;

	public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
		super(nombre, saldo);
		this.vehiculo = vehiculo;
	}

	protected double recargo() {
		double saldo = this.getSaldo();
		if (vehiculo.getAntiguedad() < 5) {
			saldo *= 0.01;
		} else {
			saldo *= 0.10;
		}
		return saldo;
	}

	protected double bonificacion() {
		return this.vehiculo.getValor() * 0.001;
	}

}
