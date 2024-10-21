package ar.edu.unlp.info.oo1._Ejercicio14;

import java.time.LocalDate;

public class DateLapse2 implements Date {
	private LocalDate from;
	private int sizeInDays;

	public DateLapse2(LocalDate desde, int cant) {
		this.from = desde;
		this.sizeInDays = cant;
	}

	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}

	public int sizeInDays() {
		return this.sizeInDays;
	}

	public boolean includesDate(LocalDate other) {
		return (other.equals(this.from) || other.equals(this.getTo())
				|| (other.isBefore(this.getTo()) && other.isAfter(this.from)));
	}
}
