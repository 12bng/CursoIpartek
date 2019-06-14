package com.ipartek.formacion.uf2216.ejemplos.poo;

import com.ipartek.formacion.uf2216.ejemplos.poo.Punto.Formatos;

public class PuntoPrueba {
	public static void main(String[]args) {
		Punto pt1 = null;
		
		pt1 = new Punto();
		
		try {
			pt1.setX(-400); pt1.setY(7);
		} catch (PooException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(pt1);
		System.out.println(pt1.getX());
		System.out.println(pt1.getY());
		
		System.out.println(String.format("P(%s,%s)", pt1.getX(), pt1.getY()));
		System.out.println(pt1.toString());
		
		pt1.setXY(1, 2);
		System.out.println(pt1.toString());
		
		Punto pt2 = new Punto(8,9);
		
		System.out.println(pt2.toString(Formatos.SIMPLE));
		System.out.println(pt2.toString(true));
		
//		System.out.println(5);
//		System.out.println(new java.util.Date());
//		System.out.println(5.6);

		Punto.setDefaultX(15);
		Punto.setDefaultY(20);
		
		Punto pt3 = new Punto();
		
		System.out.println(pt3.toString());
	}
}
