package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

import java.io.Serializable;

import ejercicios1.Fecha;
import ejercicios1.FechaException;

public class Libro implements Serializable {

	private static final long serialVersionUID = -6962854947567284865L;

	private long id;
	private String titulo;
	private String ISBN, Editorial, Autor, Descripci�n, G�nero, Edici�n;
	private Fecha fechaImpresion = new Fecha();
	private Boolean borrado = false;

	public Libro(long id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public Libro(long id, String titulo, String iSBN, String editorial, String autor, String descripci�n, String g�nero,
			String edici�n, String date) {
		this.id = id;
		this.titulo = titulo;
		ISBN = iSBN;
		Editorial = editorial;
		Autor = autor;
		Descripci�n = descripci�n;
		G�nero = g�nero;
		Edici�n = edici�n;
		fechaImpresion.setDateFromString(date);

	}
	public Libro(long id, String titulo, String iSBN, String editorial, String autor, String descripci�n, String g�nero,
			String edici�n) {
		this.id = id;
		this.titulo = titulo;
		ISBN = iSBN;
		Editorial = editorial;
		Autor = autor;
		Descripci�n = descripci�n;
		G�nero = g�nero;
		Edici�n = edici�n;
		fechaImpresion.setDateFromString("00/00/0000");
		

	}


	@Override
	public String toString() {
		return "Libro [ID=" + id + ", Titulo=" + titulo + "]";
	}

	public String toStringCompleto() {
		return "Libro [ID=" + id + ", Titulo=" + titulo + ", ISBN=" + ISBN + ", Editorial=" + Editorial + ", Autor="
				+ Autor + ", Descripci�n=" + Descripci�n + ", G�nero=" + G�nero + ", Edici�n=" + Edici�n +", Fecha impresi�n=" + fechaImpresion.toString() + ", Borrado="
				+ borrado + "]";
	}

	public long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getEditorial() {
		return Editorial;
	}

	public String getAutor() {
		return Autor;
	}

	public String getDescripcion() {
		return Descripci�n;
	}

	public String getGenero() {
		return G�nero;
	}

	public String getEdicion() {
		return Edici�n;
	}

	public Boolean isBorrado() {
		return borrado;
	}
	public String getFecha() {
		return fechaImpresion.toString();
	}

	public void setIsBorrado(Boolean isBorrado) {
		this.borrado = isBorrado;
	}


}
