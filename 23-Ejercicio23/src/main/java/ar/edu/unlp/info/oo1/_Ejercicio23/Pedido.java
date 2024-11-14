package ar.edu.unlp.info.oo1._Ejercicio23;

public class Pedido {
	private Producto prod;
	private Persona persona;
	private FormaDePago pago;
	private TipoDeEnvio envio;
	private int cantSolicitada;

	public Pedido(Producto prod, Persona persona, FormaDePago pago, TipoDeEnvio envio, int cantSolicitada) {
		super();
		this.prod = prod;
		this.persona = persona;
		this.pago = pago;
		this.envio = envio;
		this.cantSolicitada = cantSolicitada;
	}

	public Producto getProd() {
		return prod;
	}

	public Persona getPersona() {
		return persona;
	}

	public FormaDePago getPago() {
		return pago;
	}

	public TipoDeEnvio getEnvio() {
		return envio;
	}

	public int getCantSolicitada() {
		return cantSolicitada;
	}

	public double calcularCosto(String dirVendedor) {
		return this.pago.montoTotal(this.prod) + this.envio.costoDeEnvio(dirVendedor, this.persona.getDireccion());
	}

}
