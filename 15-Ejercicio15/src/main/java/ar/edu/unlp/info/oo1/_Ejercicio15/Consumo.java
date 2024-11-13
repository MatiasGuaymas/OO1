package ar.edu.unlp.info.oo1._Ejercicio15;

public class Consumo {
	private double energiaR;
	private double energiaA;

	public Consumo(double energiaR, double energiaA) {
		this.energiaR = energiaR;
		this.energiaA = energiaA;
	}

	public double getEnergiaR() {
		return energiaR;
	}

	public double getEnergiaA() {
		return energiaA;
	}

	public double precio(double precioKw) {
		return this.energiaA * precioKw;
	}

	public boolean hayBonificacion() {
		return (0.8 >= this.energiaA / (Math.sqrt(Math.pow(energiaA, 2) + Math.pow(energiaR, 2))));
	}
}
