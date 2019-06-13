package com.ipartek.formacion.uf2216.prueba;

import java.util.*;
//import java.util.Map.Entry;
import java.util.Map.Entry;

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
		
		
		
		//switch soporta Enteros y char
		//java 5 soporta ademas string
		
		String opcion = "uno";
		switch(opcion) {
		case "uno":  System.out.println(1); break;
		case "dos":  System.out.println(2); break;
		case "tres": System.out.println(3); break;
		}
		
		
		//switch
		int mes = 5, dias;
		switch(mes) {
		case 2: dias = 28; break;
		case 4:
		case 6:
		case 9:
		case 11: dias =30; break;
		default: dias = 31;
		}
		System.out.println(dias);
		
		
		//dowhile
		int x=1;
		do {
			System.out.println(x++);
		} while(x<=10);
		
		
		//for autorrecorrido
		System.out.println("for autorrecorrido");
		int[] enteros = {5,2,3,5,4,8,7,9};
		for(int entero: enteros) {
			System.out.println(entero);
		}
		
		//Diccionario
		HashMap<String,String> diccionario = new HashMap<String,String>();
		diccionario.put("casa", "home");
		diccionario.put("coche", "bus");
		diccionario.put("coche", "car");
		System.out.println(diccionario.get("coche"));
		
		System.out.println(diccionario.keySet());
		System.out.println(diccionario.values());
		for(String valor: diccionario.values()) {
		System.out.println(valor);
		}
		
		
		String linea;
		for(Entry<String,String> par: diccionario.entrySet()) {
			linea= String.format("(%s,%s, args)", par.getKey(), par.getValue());
			System.out.println(linea);
		}
		
		//conversiones
		String sNumero ="5";
		int iNumero = Integer.parseInt(sNumero);
		System.out.println(iNumero);
		String texto = String.valueOf(iNumero);
		System.out.println(texto);
		
	}
		
	
//	public void cuenta() {
//		nombres.add("Mikel");
//		// grupo gfi norte, informatica euskadi (ide), ibermatica, serikat, gertek, ipartek serv inform
//	}

}
