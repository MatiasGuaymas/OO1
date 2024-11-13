package ar.edu.unlp.info.oo1._Ejercicio22;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;

	public ClienteDeCorreo(String nombre) {
		this.inbox = new Carpeta(nombre);
		this.carpetas = new ArrayList<Carpeta>();
		this.carpetas.add(this.inbox);
	}

	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}

	public void recibir(Email email) {
		this.inbox.agregarMail(email);
	}

	public void mover(Email email, Carpeta destino) {
		destino.agregarMail(email);
	}

	public Carpeta getInbox() {
		return this.inbox;
	}

	public List<Carpeta> getCarpetas() {
		return new ArrayList<Carpeta>(this.carpetas);
	}

	public Email buscar(String texto) {
		return this.carpetas.stream().map(c -> c.buscar(texto)).filter(e -> e.cumple(texto)).findFirst().orElse(null);
	}

	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(c -> c.tamanioCarpeta()).sum();
	}

	public int totalEmails() {
		return this.carpetas.stream().mapToInt(c -> c.getCantEmail()).sum();
	}
}
