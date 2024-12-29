package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> lista;

	public Balanza() {
		this.ponerEnCero();
	}

	public void ponerEnCero() {
		this.lista = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto p) {
		this.lista.add(p);
	}

	public Ticket emitirTicket() {
		Ticket tick = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
		this.ponerEnCero();
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
