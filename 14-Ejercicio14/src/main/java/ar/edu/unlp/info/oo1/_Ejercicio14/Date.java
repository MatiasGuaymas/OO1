package ar.edu.unlp.info.oo1._Ejercicio14;

import java.time.LocalDate;

public interface Date {
	public LocalDate getFrom();

	public LocalDate getTo();

	public int sizeInDays();

	public boolean includesDate(LocalDate other);
}
