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
		String inputTexto1, titulo, ISBN, editorial, autor, descripcion, genero, edicion;
		int opcion, idLibro;
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
				System.out.println("5. Buscar por ID1");
				System.out.println("6. Terminar ejecución");

				idLibro = -1;

				// boolean estarDentroDeLoop;

				inputTexto1 = br.readLine();
				try {
					opcion = Integer.parseInt(inputTexto1);
				} catch (Exception e) {
					opcion = 0;
				}

				if (opcion == 1) {
					System.out.println("1. Simple");
					System.out.println("2. Completo");
					inputTexto1 = br.readLine();
					try {
						opcion = Integer.parseInt(inputTexto1);
					} catch (Exception e) {
						opcion = 0;
					}

					if (opcion == 1) {
						System.out.println("Introduce el ID del libro a introducir.");
						inputTexto1 = br.readLine();
						idLibro = introduccionDeNumero(inputTexto1);
						System.out.println("Introduce el Título del libro a introducir.");
						titulo = br.readLine();
						Libro nuevoLibro = new Libro(idLibro, inputTexto1);
						dao.insertar(nuevoLibro);
					} else if (opcion == 2) {
						System.out.println("Introduce el id del libro a introducir.");
						inputTexto1 = br.readLine();
						idLibro = introduccionDeNumero(inputTexto1);
						System.out.println("Introduce el Título del libro a introducir.");
						titulo = br.readLine();
						System.out.println("Introduce el ISBN del libro a introducir.");
						ISBN = br.readLine();
						System.out.println("Introduce la Editorial del libro a introducir.");
						editorial = br.readLine();
						System.out.println("Introduce el Autor del libro a introducir.");
						autor = br.readLine();
						System.out.println("Introduce la Descripción del libro a introducir.");
						descripcion = br.readLine();
						System.out.println("Introduce el Género del libro a introducir.");
						genero = br.readLine();
						System.out.println("Introduce la Edición del libro a introducir.");
						edicion = br.readLine();

					}

				} else if (opcion == 2) {
					System.out.println("1. Simple");
					System.out.println("2. Completo");
					inputTexto1 = br.readLine();
					opcion = Integer.parseInt(inputTexto1);
					if (opcion == 1) {
						System.out.println("Introduce el ID del libro a modificar.");
						System.out.println("Si el libro con esa ID esta borrado, se dara de alta otra vez");
						inputTexto1 = br.readLine();
						idLibro = introduccionDeNumero(inputTexto1);
						System.out.println("Introduce el Titulo del libro a modificar.");
						titulo = br.readLine();
						Libro nuevoLibro = new Libro(idLibro, titulo);
						dao.modificar(nuevoLibro);
					} else if (opcion == 2) {
						// while(idLibro==-1) {
						System.out.println("Introduce el id del libro a modificar.");
						inputTexto1 = br.readLine();
						idLibro = introduccionDeNumero(inputTexto1);
						// }
						System.out.println("Introduce el Título del libro a modificar.");
						titulo = br.readLine();
						System.out.println("Introduce el ISBN del libro a modificar.");
						ISBN = br.readLine();
						System.out.println("Introduce la Editorial del libro a modificar.");
						editorial = br.readLine();
						System.out.println("Introduce el Autor del libro a modificar.");
						autor = br.readLine();
						System.out.println("Introduce la Descripción del libro a modificar.");
						descripcion = br.readLine();
						System.out.println("Introduce el Género del libro a modificar.");
						genero = br.readLine();
						System.out.println("Introduce la Edición del libro a modificar.");
						edicion = br.readLine();
						Libro nuevoLibro = new Libro(idLibro, titulo, ISBN, editorial, autor, descripcion, genero,
								edicion);
						dao.modificar(nuevoLibro);

					}

				} else if (opcion == 3) {
					System.out.println("Introduce el id del libro a borrar");
					inputTexto1 = br.readLine();
					idLibro = introduccionDeNumero(inputTexto1);
					dao.borrar(idLibro);
//					estarDentroDeLoop = true;
//					while(estarDentroDeLoop) {
//						System.out.println("1.");
//					if() {}
//					else if() {}
//					else if() {}
//					else{}
//					}
				} else if (opcion == 4) {
					System.out.println("1. Simple");
					System.out.println("2. Completo");
					System.out.println("2. Completo");
					inputTexto1 = br.readLine();
					try {
						opcion = Integer.parseInt(inputTexto1);
					} catch (Exception e) {
						opcion = 0;
					}
					if (opcion == 1) {
						for (Libro libro : dao.obtenerTodos()) {
							System.out.println(libro.toString());
						}
					}

					else if (opcion == 2) {
						for (Libro libro : dao.obtenerTodos()) {
							System.out.println(libro.toStringCompleto());
						}
					}

				} else if (opcion == 5) {

				} else if (opcion == 6) {
					terminar = true;
				} else {
					System.out.println("No has introducido una opcion valida, introduce otra vez un numero.");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private static int introduccionDeNumero(String inputTexto) {
		int numeroIntroducido;
		try {
			numeroIntroducido = Integer.parseInt(inputTexto);
		} catch (Exception e) {
			numeroIntroducido = -1;
		}
		if (numeroIntroducido < 0) {
			System.out.println("El id ha de ser un numero entero y positivo");
		}
		return numeroIntroducido;
	}

}
