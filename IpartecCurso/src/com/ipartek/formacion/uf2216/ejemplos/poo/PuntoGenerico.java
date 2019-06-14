package com.ipartek.formacion.uf2216.ejemplos.poo;

// Java5
public class PuntoGenerico<C,T> {
	private C x, y;
	private T etiqueta;
	
	public PuntoGenerico(C x, C y, T etiqueta) {
		super();
		this.x = x;
		this.y = y;
		this.etiqueta = etiqueta;
	}
	
	public C getX() {
		return x;
	}
	public void setX(C x) {
		this.x = x;
	}
	public C getY() {
		return y;
	}
	public void setY(C y) {
		this.y = y;
	}
	public T getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(T etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	@Override
	public String toString() {
		return "PuntoGenerico [x=" + x + ", y=" + y + ", etiqueta=" + etiqueta + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((etiqueta == null) ? 0 : etiqueta.hashCode());
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PuntoGenerico other = (PuntoGenerico) obj;
		if (etiqueta == null) {
			if (other.etiqueta != null)
				return false;
		} else if (!etiqueta.equals(other.etiqueta))
			return false;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		return true;
	}
}
