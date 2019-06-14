package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.util.HashSet;

public class Poligono {
	private HashSet<Punto> puntos = new HashSet<Punto>();

	public Iterable<Punto> getPuntos() {
		return puntos;
	}
	
	public Punto[] getPuntosClonados() {
		Punto[] array = new Punto[puntos.size()];
		
		int i = 0;
		for(Punto punto: puntos) {
			array[i++] = new Punto(punto.getX(), punto.getY());
		}
//		Punto punto;
//		for(int i = 0; i < array.length; i++) {
//			punto = puntos.get(i);
//			array[i] = new Punto(punto.getX(), punto.getY());
//		}
		
		return array;
	}
	
	public void add(Punto p) {
		puntos.add(p);
	}
}
