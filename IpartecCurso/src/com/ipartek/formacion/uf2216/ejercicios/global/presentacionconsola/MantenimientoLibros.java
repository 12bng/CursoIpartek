package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.io.IOException;

import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {
	static java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
	static java.io.BufferedReader br = new java.io.BufferedReader(isr);

	public static void main(String[] args) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		Boolean terminar = false;
		dao.insertar(new Libro(1, "Título 1"));
		dao.insertar(new Libro(2, "Título 2"));

		for (Libro libro : dao.obtenerTodos()) {
			System.out.println(libro);
		}

		// TODO Menú con insertar, modificar, borrar, listar, buscar por id
		// TODO Buscar por titulo
		while (!terminar) {
			try {
				System.out.println("1. Añadir");
				System.out.println("2. Modificar");
				System.out.println("3. Borrar");
				System.out.println("4. Listado");
				System.out.println("5. Buscar por Id");
				System.out.println("Pon ''Fin'' para terminar la ejecución");
				String inputTexto;

				inputTexto = br.readLine();
				if (inputTexto == "1") {
					System.out.println();
				} 
				else if (inputTexto == "2") {
					
				} 
				else if (inputTexto == "3") {
					
				} 
				else if (inputTexto == "4") {
					
				} 
				else if (inputTexto == "5") {
					
				} 
				else if (inputTexto == "Fin") {
					terminar = true;
				} 
				else {
					System.out.println(
							"No has introducido una opcion valida, introduce otra vez un numero o Fin para terminar la ejecución.");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
