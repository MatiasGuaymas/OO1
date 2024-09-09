package ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Balanza {
	private List<Producto> lista = new LinkedList<Producto>();

	public void ponerEnCero() {
		this.lista.clear();
	}

	public void agregarProducto(Producto p) {
		this.lista.add(p);
	}

	public Ticket emitirTicket() {
		Ticket tick = new Ticket(new LinkedList<Producto>(this.lista));
		return tick;
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
}
