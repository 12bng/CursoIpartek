package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibroException;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {
	private static final String RUTA_FICHERO = "C:\\Users\\curso\\Documents\\pruebas\\fichero.txt";
	private static final String RUTA_FICHERO_BINARIO = "C:\\Users\\curso\\Documents\\pruebas\\fichero.dat";
	private static final String RUTA_FICHERO_CSV = "C:\\Users\\curso\\Documents\\pruebas\\fichero.csv";
	private static final boolean AUTO_FLUSH = true;
	private static final boolean APPEND = false; // true = mantiene lo que contenia anteriormente el fichero; false =
													// guarda lo que le metemos la ultima vez
	private static final String SEPARATOR = ",";

	static java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
	static java.io.BufferedReader br = new java.io.BufferedReader(isr);
	static String inputTexto1, titulo, ISBN, editorial, autor, descripcion, genero, edicion, añoImpresion;
	static int opcion;
	static int idLibro;

	public static void main(String[] args) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		Boolean terminar = false;

		for (Libro libro : dao.obtenerTodos()) {
			System.out.println(libro);
		}

		while (!terminar) {
			try {
				mostrarOpcionesMenu();
				idLibro = -1;

				inputTexto1 = br.readLine();
				try {
					opcion = Integer.parseInt(inputTexto1);
				} catch (Exception e) {
					opcion = -1;
				}

				if (opcion == 1) {
					añadirLibro(dao);
				} else if (opcion == 2) {
					modificarLibro(dao);
				} else if (opcion == 3) {
					borrarLibro(dao);
				} else if (opcion == 4) {
					listarLibros(dao);
				} else if (opcion == 5) {
					buscarPorID(dao);
				} else if (opcion == 6) {
					guardarTXT(dao);
				} else if (opcion == 7) {
					guardarBinario(dao);
				} else if (opcion == 8) {
					dao = cargarBinario(dao);
				} else if (opcion == 9) {
					esportCSV(dao);
				} else if (opcion == 10) {
					importCSV(dao);
				} else if (opcion == 0) {
					// Cerrar programa
					terminar = true;
					br.close();
					isr.close();
				} else {
					// Ninguna de las opciones anteriores
					System.out.println("No has introducido una opcion valida, introduce un numero.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	private static void añadirLibro(Crudable<Libro> dao) throws IOException {
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
			idLibro = introduccionDeNumeroID(inputTexto1);
			if (idLibro > 0) {
				System.out.println("Introduce el Título del libro a introducir.");
				titulo = br.readLine();
				Libro nuevoLibro = new Libro(idLibro, titulo);
				System.out.println(nuevoLibro.toString() + "esta siendo añadido");
				try {
					dao.insertar(nuevoLibro);
				} catch (LibroException e) {
					System.out.println(e.getMessage());
				}
			}
		} else if (opcion == 2) {
			System.out.println("Introduce el id del libro a introducir.");
			inputTexto1 = br.readLine();
			idLibro = introduccionDeNumeroID(inputTexto1);
			if (idLibro > 0) {
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
				System.out.println("Introduce el año de Impresion del libro a introducir. dd/mm/aaaa");
				añoImpresion = br.readLine();
				Libro nuevoLibro = new Libro(idLibro, titulo, ISBN, editorial, autor, descripcion, genero, edicion,
						añoImpresion);
				System.out.println(nuevoLibro.toStringCompleto() + "esta siendo añadido");
				try {
					dao.insertar(nuevoLibro);
				} catch (LibroException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

	private static void modificarLibro(Crudable<Libro> dao) throws IOException {
		System.out.println("1. Simple");
		System.out.println("2. Completo");
		System.out.println("Si el libro con esa ID esta borrado, se dara de alta otra vez");
		System.out.println("El ID ha de ser de un libro ya creado con anterioridad");
		inputTexto1 = br.readLine();
		opcion = Integer.parseInt(inputTexto1);
		if (opcion == 1) {
			System.out.println("Introduce el ID del libro a modificar.");
			inputTexto1 = br.readLine();
			idLibro = introduccionDeNumeroID(inputTexto1);
			if (idLibro > 0) {
				System.out.println("Introduce el Titulo del libro a modificar.");
				titulo = br.readLine();
				Libro nuevoLibro = new Libro(idLibro, titulo);
				System.out.println(nuevoLibro.toString() + "esta siendo modificado");
				try {
					dao.modificar(nuevoLibro);
				} catch (LibroException e) {
					System.out.println(e.getMessage());
				}
			}
		} else if (opcion == 2) {
			System.out.println("Introduce el id del libro a modificar.");
			inputTexto1 = br.readLine();
			idLibro = introduccionDeNumeroID(inputTexto1);
			if (idLibro > 0) {
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
				System.out.println("Introduce el año de Impresion del libro a modificar. dd/mm/aaaa");
				añoImpresion = br.readLine();
				Libro nuevoLibro = new Libro(idLibro, titulo, ISBN, editorial, autor, descripcion, genero, edicion,
						añoImpresion);
				System.out.println(nuevoLibro.toStringCompleto() + "esta siendo modificado");
				try {
					dao.modificar(nuevoLibro);
				} catch (LibroException e) {
					System.out.println(e.getMessage());
				}
			}

		}
	}

	private static void borrarLibro(Crudable<Libro> dao) throws IOException {
		System.out.println("1. Por ID");
		System.out.println("2. Por ID + Titulo");
		inputTexto1 = br.readLine();
		opcion = Integer.parseInt(inputTexto1);
		if (opcion == 1) {
			System.out.println("Introduce el ID del libro a borrar");
			inputTexto1 = br.readLine();
			idLibro = introduccionDeNumeroID(inputTexto1);
			if (idLibro > 0) {
				System.out.println("Libro con ID: " + idLibro + " esta siendo borrado");
				try {
					dao.borrar(idLibro);
				} catch (LibroException e) {
					System.out.println(e.getMessage());
				}
			}
		} else if (opcion == 2) {
			System.out.println("Introduce el ID del libro a borrar");
			inputTexto1 = br.readLine();
			idLibro = introduccionDeNumeroID(inputTexto1);
			if (idLibro > 0) {
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
		}
	}

	private static void listarLibros(Crudable<Libro> dao) throws IOException {
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
	}

	private static void buscarPorID(Crudable<Libro> dao) throws IOException {
		System.out.println("Introduce el id del libro a buscar");
		inputTexto1 = br.readLine();
		idLibro = introduccionDeNumeroID(inputTexto1);
		if (idLibro > 0) {
			Libro libroBuscado = dao.obtenerPorId(idLibro);
			if (libroBuscado == null) {
				System.out.println("No existe ningun libro con esa ID");
			} else {
				System.out.println(libroBuscado.toString());
			}
		}
	}

	private static void guardarTXT(Crudable<Libro> dao) throws IOException {
		FileWriter fw = new FileWriter(RUTA_FICHERO, APPEND);
		PrintWriter pw = new PrintWriter(fw, AUTO_FLUSH);
		for (Libro libro : dao.obtenerTodos()) {
			pw.println(libro);
		}

		System.out.println("Creando fichero txt en: " + RUTA_FICHERO);
		pw.close();
		fw.close();
	}

	private static void guardarBinario(Crudable<Libro> dao) {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;

		try {
			fos = new FileOutputStream(RUTA_FICHERO_BINARIO, APPEND);
			salida = new ObjectOutputStream(fos);
			System.out.println("Creando fichere binario en: " + RUTA_FICHERO_BINARIO);
			salida.writeObject(dao);
			fos.close();
			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void importCSV(Crudable<Libro> dao) {
		// 0:ID 1:Titulo 2:ISBN 3:Editorial 4:Autor 5:Descripcion 6:Genero 7:Edicion
		// 8:Fecha 9:Borrado
		try {
			BufferedReader br = new BufferedReader(new FileReader(RUTA_FICHERO_CSV));
			String line = br.readLine();
			line = br.readLine();
			line = br.readLine();
			while (null != line) {
				String[] fields = line.split(SEPARATOR);
				line = br.readLine();
				Libro nuevoLibro = new Libro(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3], fields[4],
						fields[5], fields[6], fields[7], fields[8]);
				nuevoLibro.setIsBorrado(Boolean.parseBoolean(fields[9]));
				try {
					dao.insertar(nuevoLibro);
				} catch (LibroException e) {
					dao.modificar(nuevoLibro);
				}
			}
			br.close();
			System.out.println("Importando datos de " + RUTA_FICHERO_CSV);
		} catch (IOException e) {
			System.out.println("Documento no encontrado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void esportCSV(Crudable<Libro> dao) throws IOException {
		// 0:ID 1:Titulo 2:ISBN 3:Editorial 4:Autor 5:Descripcion 6:Genero 7:Edicion
		// 8:Fecha 9:Borrado
		FileWriter fw = new FileWriter(RUTA_FICHERO_CSV, APPEND);
		PrintWriter pw = new PrintWriter(fw, AUTO_FLUSH);
		pw.println("sep=,");
		pw.println("ID,Titulo,ISBN,Editorial,Autor,Descripcion,Genero,Edicion,Fecha,Borrado");
		for (Libro libro : dao.obtenerTodos()) {

			pw.println((libro.getId() + "," + libro.getTitulo() + "," + libro.getISBN() + "," + libro.getEditorial()
					+ "," + libro.getAutor() + "," + libro.getDescripcion() + "," + libro.getGenero() + ","
					+ libro.getEdicion() + "," + libro.getFecha() + "," + libro.isBorrado()));
		}
		System.out.println("Exportando datos a " + RUTA_FICHERO_CSV);
		pw.close();
	}

	private static Crudable<Libro> cargarBinario(Crudable<Libro> dao) {
		FileInputStream fis = null;
		ObjectInputStream entrada = null;
		try {
			System.out.println("Cargando fichere binario de: " + RUTA_FICHERO_BINARIO);
			fis = new FileInputStream(RUTA_FICHERO_BINARIO);
			entrada = new ObjectInputStream(fis);
			dao = (Crudable<Libro>) entrada.readObject();
		} catch (IOException e) {
			System.out.println("Documento no encontrado");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return dao;
	}

	private static void mostrarOpcionesMenu() {
		System.out.println("1. Añadir");
		System.out.println("2. Modificar");
		System.out.println("3. Borrar");
		System.out.println("4. Listado");
		System.out.println("5. Buscar por ID");
		System.out.println("6. Guardar txt");
		System.out.println("7. Guardar binario");
		System.out.println("8. Cargar binario");
		System.out.println("9. Exportar (CSV)");
		System.out.println("10. Importar (CSV)");
		System.out.println("0. Terminar ejecución");
	}

	private static int introduccionDeNumeroID(String inputTexto) {
		int numeroIntroducido;
		try {
			numeroIntroducido = Integer.parseInt(inputTexto);
		} catch (Exception e) {
			numeroIntroducido = -1;
		}
		if (numeroIntroducido < 0) {
			System.out.println("El ID ha de ser un numero entero y positivo");
		}
		return numeroIntroducido;
	}

}
