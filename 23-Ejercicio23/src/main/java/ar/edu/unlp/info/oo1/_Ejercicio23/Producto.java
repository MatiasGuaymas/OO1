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

	private boolean hayStock(int cant) {
		return this.cantDisponibles >= cant;
	}

	private void decrementarStock(int cant) {
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

	public Pedido crearPedido(FormaDePago pago, TipoDeEnvio envio, Persona cliente, int cantSolicitada) {
		if (this.hayStock(cantSolicitada)) {
			this.decrementarStock(cantSolicitada);
			Pedido pedido = new Pedido(this, cliente, pago, envio, cantSolicitada);
			cliente.agregarPedido(pedido);
			return pedido;
		}
		return null;
	}

}
