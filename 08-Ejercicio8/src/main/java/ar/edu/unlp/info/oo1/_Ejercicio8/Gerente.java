package ar.edu.unlp.info.oo1._Ejercicio8;

public class Gerente extends EmpleadoJerarquico {
	public Gerente(String nombre) {
		super(nombre);
	}

	public double aportes() {
		return this.montoBasico() * 0.05d;
	}

	public double montoBasico() {
		return 57000;
	}
}
