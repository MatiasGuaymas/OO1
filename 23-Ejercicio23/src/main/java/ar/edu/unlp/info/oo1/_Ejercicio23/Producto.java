package ar.edu.unlp.info.oo1._Ejercicio23;

public class Producto {
	private String nombre;
	private String categoria;
	private double precio;
	private int cantDisponibles;

	public Producto(String nombre, String categoria, double precio, int cantDisponibles) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.cantDisponibles = cantDisponibles;
	}

	public boolean hayStock(int cant) {
		return this.cantDisponibles >= cant;
	}

	public void decrementarStock(int cant) {
		this.cantDisponibles -= cant;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantDisponibles() {
		return cantDisponibles;
	}

}
