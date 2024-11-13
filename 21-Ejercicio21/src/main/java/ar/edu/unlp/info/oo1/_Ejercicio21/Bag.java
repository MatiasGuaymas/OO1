package ar.edu.unlp.info.oo1._Ejercicio21;

import java.util.Collection;

public interface Bag<T> extends Collection<T> {

	/**
	 * Agrega un elemento al Bag, incrementando en 1 su cardinalidad.
	 */
	@Override
	boolean add(T element);

	/**
	 * Devuelve la cardinalidad del elemento. Sí el elemento no está en el Bag,
	 * devuelve 0.
	 */
	int occurrencesOf(T element);

	/**
	 * Elimina una referencia del elemento del Bag. Sí el elemento no está en el
	 * Bag, no hace nada.
	 */
	void removeOccurrence(T element);

	/**
	 * Elimina el elemento del Bag. Sí el elemento no está en el Bag, no hace nada
	 */
	void removeAll(T element);

	/**
	 * Devuelve el número total de elementos en el Bag, es decir, la suma de todas
	 * las cardinalidades de todos sus elementos.
	 */
	@Override
	int size();
}
