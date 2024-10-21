package ar.edu.unlp.info.oo1._Ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;

	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}

	public void agregarPieza(Pieza p) {
		this.piezas.add(p);
	}

	public double getVolumenDeMaterial(String nombreDeMaterial) {
		return this.piezas.stream().filter(Pieza -> Pieza.getMaterial().equals(nombreDeMaterial))
				.mapToDouble(p -> p.volumen()).sum();
	}

	public double getSuperficieDeColor(String unNombreDeColor) {
		return this.piezas.stream().filter(Pieza -> Pieza.getColor().equals(unNombreDeColor))
				.mapToDouble(p -> p.superficie()).sum();
	}
}
