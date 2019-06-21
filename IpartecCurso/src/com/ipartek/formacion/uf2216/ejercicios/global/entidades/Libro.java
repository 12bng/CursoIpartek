package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

import java.io.Serializable;

public class Libro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6962854947567284865L;
	// TODO: ISBN, Editorial, Autor, Descripci�n, G�nero, Edici�n, IsBorrado, Fecha
	// de impresi�n
	private long id;
	private String titulo;
	private String ISBN, Editorial, Autor, Descripci�n, G�nero, Edici�n;
	private Boolean borrado = false;

	public Libro(long id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public Libro(long id, String titulo, String iSBN, String editorial, String autor, String descripci�n, String g�nero,
			String edici�n) {
		super();
		this.id = id;
		this.titulo = titulo;
		ISBN = iSBN;
		Editorial = editorial;
		Autor = autor;
		Descripci�n = descripci�n;
		G�nero = g�nero;
		Edici�n = edici�n;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + "]";
	}

	public String toStringCompleto() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", ISBN=" + ISBN + ", Editorial=" + Editorial + ", Autor="
				+ Autor + ", Descripci�n=" + Descripci�n + ", G�nero=" + G�nero + ", Edici�n=" + Edici�n + "Borrado="
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
		return Descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		Descripci�n = descripci�n;
	}

	public String getGenero() {
		return G�nero;
	}

	public void setG�nero(String g�nero) {
		G�nero = g�nero;
	}

	public String getEdicion() {
		return Edici�n;
	}

	public void setEdici�n(String edici�n) {
		Edici�n = edici�n;
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
