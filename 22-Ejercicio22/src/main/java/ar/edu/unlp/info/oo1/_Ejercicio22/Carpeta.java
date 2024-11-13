package ar.edu.unlp.info.oo1._Ejercicio22;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo1._Ejercicio21.BagImpl;

public class Carpeta {
	private String nombre;
	private List<Email> emails;

	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void agregarMail(Email mail) {
		this.emails.add(mail);
	}

	public void eliminarMail(Email mail) {
		this.emails.remove(mail);
	}

	public int tamanioCarpeta() {
		return this.emails.stream().mapToInt(e -> e.tamanioEmail()).sum();
	}

	public void mover(Email email, Carpeta destino) {
		this.eliminarMail(email);
		destino.agregarMail(email);
	}

	public List<Email> getEmails() {
		return new ArrayList<Email>(emails);
	}

	public Email buscar(String texto) {
		return this.emails.stream().filter(e -> e.cumple(texto)).findFirst().orElse(null);
	}

	public int getCantEmail() {
		return this.emails.size();
	}

	public void sumarCategoria(BagImpl<String> bolsa) {

	}
}
