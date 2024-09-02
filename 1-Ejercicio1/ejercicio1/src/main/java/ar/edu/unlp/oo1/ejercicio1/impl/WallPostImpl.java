package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {
	private String text = "Undefined post";
	private int likes = 0;
	private boolean featured = false;

	/* Retorna el texto descriptivo de la publicación */
	public String getText() {
		return this.text;
	}

	/* Asigna el texto descriptivo de la publicación */
	public void setText(String descriptionText) {
		this.text = descriptionText;
	}

	/* Retorna la cantidad de “me gusta” */
	public int getLikes() {
		return this.likes;
	}

	/* Incrementa la cantidad de likes en uno. */
	public void like() {
		this.likes++;
	}

	/* Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada. */
	public void dislike() {
		if (this.likes != 0)
			this.likes--;
	}

	/*
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 */
	public boolean isFeatured() {
		return this.featured;
	}

	/* Cambia el post del estado destacado a no destacado y viceversa. */
	public void toggleFeatured() {
		this.featured = !this.featured;
	}

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
