package ar.edu.unlp.info.oo1._Ejercicio23;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo1._Ejercicio21.BagImpl;

public class Persona {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	private List<Pedido> pedidos;

	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
		this.pedidos = new ArrayList<Pedido>();
	}

	public void agregarPedido(Pedido p) {
		this.pedidos.add(p);
	}

	public Producto publicarProducto(String nombre, String categoria, double precio, int stock) {
		Producto p = new Producto(nombre, categoria, precio, stock);
		this.productos.add(p);
		return p;
	}

	public BagImpl<String> cantCategoria() {
		BagImpl<String> bag = new BagImpl<String>();
		this.pedidos.stream().forEach(p -> bag.add(p.getCategoria()));
		return bag;
	}

	public String getDireccion() {
		return this.direccion;
	}
}
