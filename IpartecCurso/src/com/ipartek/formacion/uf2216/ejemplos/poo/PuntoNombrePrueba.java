package com.ipartek.formacion.uf2216.ejemplos.poo;

public class PuntoNombrePrueba {
	public static void main(String[] args) {
		PuntoNombre ptn = new PuntoNombre("Javier");
		
		System.out.println(ptn);
		Punto p = ptn;

		System.out.println(p); //p.toString());
		// System.out.println(p.getNombre());

		Object o = p;
		System.out.println(o);
		
		PuntoNombre ptn2 = (PuntoNombre) p;
		System.out.println(ptn2.getNombre());

		Punto p2 = new Punto();

		if (p2 instanceof PuntoNombre) {
			PuntoNombre ptn3 = (PuntoNombre) p2;

			System.out.println(ptn3.getNombre());
		} else {
			System.out.println("No es una instancia de PuntoNombre");
		}
		
		if(p2 instanceof Object) {
			System.out.println("Es un Object");
		}
		
		if(ptn2 instanceof Object) {
			System.out.println("Es un object también");
		}
		
		System.out.println(ptn2);
	}

	public static void mainPruebas1(String[] args) {
		PuntoNombre ptn;
		ptn = new PuntoNombre("Bilbao");

		System.out.println(ptn.toString());

		ptn.setXY(3, 4);

		System.out.println(ptn.toString(false));

		Poligono poligono = new Poligono();

		poligono.add(ptn);
	}
}
