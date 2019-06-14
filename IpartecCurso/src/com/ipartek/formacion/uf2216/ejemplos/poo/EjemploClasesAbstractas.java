package com.ipartek.formacion.uf2216.ejemplos.poo;

public class EjemploClasesAbstractas {

	public static void main(String[] args) {
		Number[] numeros = new Number[2];
		
		numeros[0] = new Integer(5); //5;
		numeros[1] = new Double(7.2); //7.2;
		
		for(Number numero: numeros) {
			System.out.println(numero.doubleValue());
		}
	}

}
