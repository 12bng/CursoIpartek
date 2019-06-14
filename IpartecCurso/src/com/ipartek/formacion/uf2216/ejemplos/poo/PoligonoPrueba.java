package com.ipartek.formacion.uf2216.ejemplos.poo;

public class PoligonoPrueba {

	public static void main(String[] args) {
		Poligono poligono = new Poligono();
		
		poligono.add(new Punto(1,2));
		poligono.add(new Punto(3,4));
		
		Iterable<Punto> puntos = poligono.getPuntos(); 
		
		for(Punto punto: puntos) {
			System.out.println(punto.toString());
		}
		
		for(Punto punto: poligono.getPuntosClonados()) {
			System.out.println(punto.toString());
		}
	}

}
