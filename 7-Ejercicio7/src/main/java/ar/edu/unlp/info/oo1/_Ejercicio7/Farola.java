package ar.edu.unlp.info.oo1._Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean on;
	private ArrayList<Farola> farolas;

	/* Crear una farola. Debe inicializarla como apagada */

	public Farola() {
		this.on = false;
		this.farolas = new ArrayList<Farola>();
	}

	/*
	 * Crea la relación de vecinos entre las farolas. La relación de vecinos entre
	 * las farolas es recíproca, es decir el receptor del mensaje será vecino de
	 * otraFarola, al igual que otraFarola también se convertirá en vecina del
	 * receptor del mensaje
	 */

	private void agregarFarola(Farola farola) {
		this.farolas.add(farola);
	}

	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.farolas.contains(otraFarola)) { // Evito farolas repetidas
			this.agregarFarola(otraFarola);
			otraFarola.agregarFarola(this);
			// otraFarola.farolas.add(this);
			// otraFarola.getNeighbors().add(this); -> Queda descargada, porque en el
			// getLista le paso la copia, no la original.
		}
	}

	/* Retorna sus farolas vecinas */

	public List<Farola> getNeighbors() {
		return new ArrayList<Farola>(this.farolas); // Le paso la copia de la lista, no la original con las referencias.
	}

	/* Si la farola no está encendida, la enciende y propaga la acción. */

	public void turnOn() {
		if (!this.isOn()) {
			this.on = true;
			for (Farola f : farolas) {
				f.turnOn();
			}
		}
	}

	/* Si la farola no está apagada, la apaga y propaga la acción. */

	public void turnOff() {
		if (this.isOn()) {
			this.on = false;
			for (Farola f : farolas) {
				f.turnOff();
			}
		}
	}

	/* Retorna true si la farola está encendida. */
	public boolean isOn() {
		return this.on;
	}

	public boolean isOff() {
		return !this.on;
	}
}
