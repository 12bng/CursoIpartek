package com.ipartek.formacion.uf2216.ejemplos.poo;

public class Punto { // extends Object
	// Constantes
	private static final int MINIMO_X = -100;
	private static final int MAXIMO_X = 100;

	// Enumeración
	enum Formatos {
		SIMPLE,
		COMPLEJO
	}
	
	// Variables de instancia (objeto)
	private int x, y;

	// Variables estáticas, "de clase" (compartidas)
	private static int defaultX = 1;
	private static int defaultY = 1;
	
	// Constructores
	public Punto(int x, int y) {
		setXY(x, y);
	}
	
	public Punto(int xy) {
		this(xy, xy);
	}
	
	public Punto() {
		this(defaultX,defaultY);
	}
	
	// Métodos de acceso (getters y setters)
	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x > MAXIMO_X || x < MINIMO_X) {
			throw new PooException("No se admite el valor " + x);
		}
		
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return transformarATexto(Formatos.COMPLEJO);
	}
	
	public String toString(boolean formatoComplejo) {
		return formatoComplejo ? this.transformarATexto(Formatos.COMPLEJO): this.transformarATexto(Formatos.SIMPLE);
	}
	
	public String toString(Formatos formato) {
		return transformarATexto(formato);
	}
	
	private String transformarATexto(Formatos formato) {
		switch(formato) {
		case SIMPLE: return String.format("%s,%s", getX(), getY());
		case COMPLEJO: return String.format("P(%s,%s)", getX(), getY());
		default: throw new RuntimeException("Formato no reconocido");
		}
	}
	
	public void setXY(int x, int y) {
		setX(x); setY(y);
	}
	
	// Métodos estáticos
	public static int getDefaultX() {
		return defaultX;
	}

	public static void setDefaultX(int defaultX) {
		Punto.defaultX = defaultX;
	}

	public static int getDefaultY() {
		return defaultY;
	}

	public static void setDefaultY(int defaultY) {
		Punto.defaultY = defaultY;
	}

}
