package ar.edu.unlp.info.oo1._Ejercicio5;

public class Circulo implements Figura {
	private double radio;
	private double diametro;

	public Circulo() {
	}

	public double getDiametro() {
		this.diametro = radio * 2;
		return this.diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPerimetro() {
		return Math.PI * this.diametro;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}

}
