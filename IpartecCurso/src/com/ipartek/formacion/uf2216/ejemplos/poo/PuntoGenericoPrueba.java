package com.ipartek.formacion.uf2216.ejemplos.poo;

import java.util.Date;

public class PuntoGenericoPrueba {

	public static void main(String[] args) {
		PuntoGenerico<Double, Date> pg = 
				new PuntoGenerico<Double, Date>(1.2, 3.4, new Date());
		
		System.out.println(pg);
	}
}
