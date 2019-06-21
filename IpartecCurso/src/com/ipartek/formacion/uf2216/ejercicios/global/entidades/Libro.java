package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

import java.io.Serializable;

public class Libro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6962854947567284865L;
	// TODO: ISBN, Editorial, Autor, Descripción, Género, Edición, IsBorrado, Fecha
	// de impresión
	private long id;
	private String titulo;
	private String ISBN, Editorial, Autor, Descripción, Género, Edición;
	private Boolean borrado = false;

	public Libro(long id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public Libro(long id, String titulo, String iSBN, String editorial, String autor, String descripción, String género,
			String edición) {
		super();
		this.id = id;
		this.titulo = titulo;
		ISBN = iSBN;
		Editorial = editorial;
		Autor = autor;
		Descripción = descripción;
		Género = género;
		Edición = edición;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + "]";
	}

	public String toStringCompleto() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", ISBN=" + ISBN + ", Editorial=" + Editorial + ", Autor="
				+ Autor + ", Descripción=" + Descripción + ", Género=" + Género + ", Edición=" + Edición + "Borrado="
				+ borrado + "]";
	}

	public long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getDescripcion() {
		return Descripción;
	}

	public void setDescripción(String descripción) {
		Descripción = descripción;
	}

	public String getGenero() {
		return Género;
	}

	public void setGénero(String género) {
		Género = género;
	}

	public String getEdicion() {
		return Edición;
	}

	public void setEdición(String edición) {
		Edición = edición;
	}

	public Boolean isBorrado() {
		return borrado;
	}

	public void setIsBorrado(Boolean isBorrado) {
		this.borrado = isBorrado;
	}

	public void setId(long id) {
		this.id = id;
	}

}
