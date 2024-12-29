package ejercicio4;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;

	public Ticket(int cantidad, double peso, double precio) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidad;
		this.pesoTotal = peso;
		this.precioTotal = precio;
	}

	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}

	public String toString() {
		String ticket = "Fecha emitida: " + this.fecha.toString() + "\n" + "Cantidad de productos comprados: "
				+ this.cantidadDeProductos + "\n" + "Peso total en productos: " + this.pesoTotal + "\n"
				+ "Total a pagar: " + this.precioTotal;
		return ticket;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

}
