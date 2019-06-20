package com.ipartek.formacion.uf2216.ejercicios.global.accesodatos;

import java.util.ArrayList;
import java.util.stream.IntStream;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class LibrosDAOColeccion implements Crudable<Libro> {
	// Data
	// Access
	// Object

	// Inicio patrón Singleton
	private LibrosDAOColeccion() {
	}

	private static LibrosDAOColeccion instancia; // = new LibrosDAOColeccion();

	public static LibrosDAOColeccion getInstance() {
		if (instancia == null) {
			instancia = new LibrosDAOColeccion();
		}

		return instancia;
	}
	// Fin patrón Singleton

	private ArrayList<Libro> libros = new ArrayList<Libro>();

	@Override
	public Iterable<Libro> obtenerTodos() {
		return libros;
	}

	@Override
	public Iterable<Libro> obtenerExistentes() {
		ArrayList<Libro> librosExistentes = new ArrayList<Libro>();
		for (Libro libro : libros) {
			if (!libro.isBorrado()) {
				librosExistentes.add(libro);
			}
		}
		return librosExistentes;
	}

	@Override
	public Libro obtenerPorId(long id) {
		for (Libro libro : libros) {
			if (libro.getId() == id) {
				return libro;
			}
		}
		return null;
	}

	@Override
	public void insertar(Libro libro) {
		Libro libroEnLista = obtenerPorId(libro.getId());
		if (libroEnLista != null) {
			throw new LibroException(
					"Ya existe un libro con esa ID, no es posible añadirlo. Si el ya existente esta borrado, trata de editarlo.");
		} else {
			libros.add(libro);
		}

	}

	@Override
	public void modificar(Libro libro) {
		int posicionLibro = buscarPosicionLibro(libro.getId());
		if (posicionLibro > -1) {
			libros.set(posicionLibro, libro);
		} else {
			throw new LibroException("No hay libro a modificar con esa ID");
		}

	}

	@Override
	public void borrar(Libro libro) {
		Libro libroABorrar = obtenerPorId(libro.getId());
		if (libroABorrar.getTitulo().equals(libro.getTitulo())) {
			libroABorrar.setIsBorrado(true);
			System.out.println(libro + "Ha sido borrado");
		} else {
			throw new LibroException("El libro con esa ID y titulo no existe");
		}

	}

	@Override
	public void borrar(long id) {
		Libro libro = obtenerPorId(id);
		if (libro != null) {
			libro.setIsBorrado(true);
		} else {
			throw new LibroException("El libro con esa ID no existe");
			// System.out.println("El libro con esa ID no existe");}
		}

	}

	private int buscarPosicionLibro(long id) {
		int index = 0;
		for (Libro libro : libros) {
			if (libro.getId() == id) {
				return index;
			}
			index++;
		}
		return -1;
	}

}
