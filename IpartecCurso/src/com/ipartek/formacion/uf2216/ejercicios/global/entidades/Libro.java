package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

public class Libro {
	//TODO: ISBN, Editorial, Autor, Descripción, Género, Edición, IsBorrado, Fecha de impresión
	private long id;
	private String titulo;
	private String ISBN, Editorial, Autor, Descripción, Género, Edición;
	private Boolean isBorrado = false;
	
	
	public Libro(long id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + "]";
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

	public String getDescripción() {
		return Descripción;
	}

	public void setDescripción(String descripción) {
		Descripción = descripción;
	}

	public String getGénero() {
		return Género;
	}

	public void setGénero(String género) {
		Género = género;
	}

	public String getEdición() {
		return Edición;
	}

	public void setEdición(String edición) {
		Edición = edición;
	}

	public Boolean getIsBorrado() {
		return isBorrado;
	}

	public void setIsBorrado(Boolean isBorrado) {
		this.isBorrado = isBorrado;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
