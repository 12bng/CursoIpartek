package com.ipartek.formacion.uf2216.prueba;

import java.util.*;

public class Lenguaje {
	
	ArrayList<String> nombres = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Tipos primitivos
		 * ---------------------
		 * ENTEROS CON SIGNO
		 * byte 8 -> Byte
		 * short 18 -> Short
		 * int 36 -> Integer
		 * long 64 -> Long
		 * 
		 * CON COMA
		 * float 32 -> Float
		 * double 64 -> Double
		 * 
		 * boolean 16 -> Boolean
		 * char 16 Unicode -> 'a' -> Character
		 * 
		 * 
		 */

		float coma = 10;
		System.out.println(coma);
		int sincoma = Math.round(coma);
		System.out.println(sincoma);
		String s1 = "Mikel";
		System.out.println(s1.toUpperCase().charAt(s1.length()-1));
		
		
		
		String log1 = "Mi nombre es "+s1+" y concatenar mola";
		System.out.println(log1);
		//mejor
		StringBuffer log3 = new StringBuffer();
		log3.append("Mi nombre es ");
		log3.append(s1);
		log3.append(" y concatenar mola");
		
		System.out.println(log3);
		
		//ArrayList<String> lista = new ArrayList<String>();
		//lista.add("Uno");
		System.out.println("Operadores");
		System.out.println(5 | 3);
		System.out.println(5 & 3);
		System.out.println(5 ^ 3);
		System.out.println(~5);
		
		System.out.println("Desplazamiento de bits");
		System.out.println(5 >> 1);
		System.out.println(-5 >> 1);
		System.out.println(5 << 1);
		System.out.println(10 >>> 1);
		System.out.println(-5 >>> 1);
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	public void cuenta() {
		nombres.add("Mikel");
	}

}
