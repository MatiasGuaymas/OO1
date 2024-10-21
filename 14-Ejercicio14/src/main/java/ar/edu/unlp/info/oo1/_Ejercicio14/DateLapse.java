package ar.edu.unlp.info.oo1._Ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date {
	private LocalDate from;
	private LocalDate to;

	public DateLapse(LocalDate primera, LocalDate segunda) {
		this.from = primera;
		this.to = segunda;
	}

	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.to;
	}

	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(this.from, this.to);
	}

	public boolean includesDate(LocalDate other) {
		return (other.equals(this.from) || other.equals(this.to)
				|| (other.isBefore(this.to) && other.isAfter(this.from)));
	}
}
