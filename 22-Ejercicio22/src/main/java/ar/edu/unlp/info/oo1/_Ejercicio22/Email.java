package ar.edu.unlp.info.oo1._Ejercicio22;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;

	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}

	public void agregarAdjunto(Archivo arc) {
		this.adjuntos.add(arc);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public List<Archivo> adjuntos() {
		return new ArrayList<Archivo>(adjuntos);
	}

	public int tamanioEmail() {
		return this.titulo.length() + this.cuerpo.length() + this.adjuntos.stream().mapToInt(a -> a.tamanio()).sum();
	}

	public boolean cumple(String texto) {
		return this.titulo.equals(texto) || this.cuerpo.equals(texto);
	}
}
