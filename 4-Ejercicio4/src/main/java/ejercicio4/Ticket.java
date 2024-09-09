package ejercicio4;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> lista;

	public Ticket(List<Producto> lista) {
		this.fecha = LocalDate.now();
		this.lista = lista;
	}

	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}

	public String toString() {
		String ticket = "Fecha emitida: " + this.fecha.toString() + "\n" + "Cantidad de productos comprados: "
				+ this.getCantidadDeProductos() + "\n" + "Peso total en productos: " + this.getPesoTotal() + "\n"
				+ "Total a pagar: " + this.getPrecioTotal();
		return ticket;
	}

	public double getPesoTotal() {
		return this.lista.stream().mapToDouble(Producto::getPeso).sum();
	}

	public double getPrecioTotal() {
		return this.lista.stream().mapToDouble(Producto::getPrecio).sum();
	}

	public int getCantidadDeProductos() {
		return this.lista.size();
	}

	public List<Producto> getProductos() {
		return this.lista;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

}
