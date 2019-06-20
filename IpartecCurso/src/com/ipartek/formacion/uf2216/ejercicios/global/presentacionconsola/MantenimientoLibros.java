package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibroException;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {
	private static final String RUTA_FICHERO = "C:\\Users\\curso\\Documents\\pruebas";
	private static final boolean AUTO_FLUSH = true;
	private static final boolean APPEND = true;
	
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
				System.out.println("5. Buscar por ID");
				System.out.println("6. Guardar");
				System.out.println("7. Cargar");
				System.out.println("8. Importar (CSV)");
				System.out.println("9. Exportar (CSV)");
				System.out.println("10. Terminar ejecución");

				idLibro = -1;

				// boolean estarDentroDeLoop;

				inputTexto1 = br.readLine();
				try {
					opcion = Integer.parseInt(inputTexto1);
				} catch (Exception e) {
					opcion = 0;
				}

				// Añadir
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
						System.out.println(nuevoLibro.toString() + "esta siendo añadido");
						try {
							dao.insertar(nuevoLibro);
						} catch (LibroException e) {
							System.out.println(e.getMessage());
						}
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
						Libro nuevoLibro = new Libro(idLibro, titulo, ISBN, editorial, autor, descripcion, genero,
								edicion);
						System.out.println(nuevoLibro.toStringCompleto() + "esta siendo añadido");
						try {
							dao.insertar(nuevoLibro);
						} catch (LibroException e) {
							System.out.println(e.getMessage());
						}
					}}
					// Modificar
					else if (opcion == 2) {
						System.out.println("1. Simple");
						System.out.println("2. Completo");
						System.out.println("Si el libro con esa ID esta borrado, se dara de alta otra vez");
						System.out.println("El ID ha de ser de un libro ya creado con anterioridad");
						inputTexto1 = br.readLine();
						opcion = Integer.parseInt(inputTexto1);
						if (opcion == 1) {
							System.out.println("Introduce el ID del libro a modificar.");
							inputTexto1 = br.readLine();
							idLibro = introduccionDeNumero(inputTexto1);
							System.out.println("Introduce el Titulo del libro a modificar.");
							titulo = br.readLine();
							Libro nuevoLibro = new Libro(idLibro, titulo);
							System.out.println(nuevoLibro.toString() + "esta siendo modificado");
							try {
								dao.modificar(nuevoLibro);
							} catch (LibroException e) {
								System.out.println(e.getMessage());
							}
						} else if (opcion == 2) {
							System.out.println("Introduce el id del libro a modificar.");
							inputTexto1 = br.readLine();
							idLibro = introduccionDeNumero(inputTexto1);
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
							System.out.println(nuevoLibro.toStringCompleto() + "esta siendo modificado");
							try {
								dao.modificar(nuevoLibro);
							} catch (LibroException e) {
								System.out.println(e.getMessage());
							}

						}
						// Borrar
					} else if (opcion == 3) {
						System.out.println("1. Por ID");
						System.out.println("2. Por ID + Titulo");
						inputTexto1 = br.readLine();
						opcion = Integer.parseInt(inputTexto1);
						if (opcion == 1) {
							System.out.println("Introduce el ID del libro a borrar");
							inputTexto1 = br.readLine();
							idLibro = introduccionDeNumero(inputTexto1);
							System.out.println("Libro con ID: " + idLibro + " esta siendo borrado");
							try {
								dao.borrar(idLibro);
							} catch (LibroException e) {
								System.out.println(e.getMessage());
							}
						} else if (opcion == 2) {
							System.out.println("Introduce el ID del libro a borrar");
							inputTexto1 = br.readLine();
							idLibro = introduccionDeNumero(inputTexto1);
							System.out.println("Introduce el Titulo del libro a borrar");
							titulo = br.readLine();
							Libro libroABorrar = new Libro(idLibro, titulo);
							System.out.println(libroABorrar.toString() + "esta siendo borrado");
							try {
								dao.borrar(libroABorrar);
							} catch (LibroException e) {
								System.out.println(e.getMessage());
							}
						}

						// Listado
					} else if (opcion == 4) {
						System.out.println("1. Disponibles");
						System.out.println("2. Todos");
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
								for (Libro libro : dao.obtenerExistentes()) {
									System.out.println(libro);
								}
							} else if (opcion == 2) {
								for (Libro libro : dao.obtenerExistentes()) {
									System.out.println(libro.toStringCompleto());
								}
							}

						} else if (opcion == 2) {
							System.out.println("1. Simple");
							System.out.println("2. Completo");
							inputTexto1 = br.readLine();
							try {
								opcion = Integer.parseInt(inputTexto1);
							} catch (Exception e) {
								opcion = 0;
							}
							if (opcion == 1) {
								for (Libro libro : dao.obtenerTodos()) {
									System.out.println(libro);
								}
							} else if (opcion == 2) {
								for (Libro libro : dao.obtenerTodos()) {
									System.out.println(libro.toStringCompleto());
								}
							}

						}

						// Buscar por ID
					} else if (opcion == 5) {
						System.out.println("Introduce el id del libro a buscar");
						inputTexto1 = br.readLine();
						idLibro = introduccionDeNumero(inputTexto1);
						Libro libroBuscado = dao.obtenerPorId(idLibro);
						if (libroBuscado == null) {
							System.out.println("No existe ningun libro con esa ID");
						} else {
							System.out.println(libroBuscado.toString());
						}
					}
					else if (opcion == 6) {
						//Guardar
						FileWriter fw = new FileWriter(RUTA_FICHERO, APPEND);
						PrintWriter pw = new PrintWriter(fw, AUTO_FLUSH);
						for (Libro libro : dao.obtenerTodos()) {
							pw.println(libro.toStringCompleto());
						}
						
						System.out.println("Creando fichero txt en: " + RUTA_FICHERO);
						pw.close();
						fw.close();
					}
					else if (opcion == 7) {
						//Cargar
					}
					else if (opcion == 8) {
						//Importar(CSV)
					}
					else if (opcion == 9) {
						//Exportar(CSV)
					}
					// Cerrar programa
					else if (opcion == 10) {
						terminar = true;
					}
					// Ninguna de las opciones anteriores
					else {
						System.out.println("No has introducido una opcion valida, introduce un numero.");
					}
				}
			 catch (IOException e) {
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
