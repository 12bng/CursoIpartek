package com.ipartek.formacion.uf2216.ejemplos.poo;

public class ExcepcionesPrueba {

	public static void main(String[] args) {
		String s = null;
		int[] arr = null;
		
		System.out.println("Antes");
		
		try {
			arr = new int[2];
			//s.toUpperCase();
			arr[2] = 5;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error en el acceso al array");
			arr[1] = 10;
		} catch (Exception e) {
			System.out.println("Error no esperado");
			return;
		} finally {
			System.out.println("Me ejecuto por cojones");
		}
		
		System.out.println("Después");
		System.out.println(arr[1]);
	}
}
