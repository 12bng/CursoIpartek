package com.ipartek.formacion.uf2216.ejemplos.poo;

public class PuntoNombre extends Punto {
	private String nombre;

	public PuntoNombre(String nombre, int x, int y) {
		super(x,y);
		setNombre(nombre);
	}
	
	public PuntoNombre(String nombre, int xy) {
		this(nombre, xy, xy);
//		super(xy);
//		setNombre(nombre);
	}
	
	public PuntoNombre(String nombre) {
		this(nombre, getDefaultX(), getDefaultY());
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return getNombre() + super.toString();
	}

	@Override
	public String toString(boolean formatoComplejo) {
		return getNombre() + super.toString(formatoComplejo);
	}

	@Override
	public String toString(Formatos formato) {
		return getNombre() + super.toString(formato);
	}
}
