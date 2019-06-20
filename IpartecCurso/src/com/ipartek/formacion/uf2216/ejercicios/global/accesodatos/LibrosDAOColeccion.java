package com.ipartek.formacion.uf2216.ejercicios.global.accesodatos;

import java.util.ArrayList;
import java.util.stream.IntStream;

import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class LibrosDAOColeccion implements Crudable<Libro> {
	//Data
	//Access
	//Object
	
	// Inicio patr�n Singleton
	private LibrosDAOColeccion() {}
	
	private static LibrosDAOColeccion instancia; // = new LibrosDAOColeccion();
	
	public static LibrosDAOColeccion getInstance() {
		if(instancia == null) {
			instancia = new LibrosDAOColeccion();
		}
		
		return instancia;
	}
	// Fin patr�n Singleton
	
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	
	@Override
	public Iterable<Libro> obtenerTodos() {
		return libros;
	}

	@Override
	public Libro obtenerPorId(long id) {
		for(Libro libro: libros) {
			if(libro.getId()==id) {
				return libro;
			}
		}
		return null;
	}

	@Override
	public void insertar(Libro libro) {
		Libro libroEnLista = obtenerPorId(libro.getId());
		if(libroEnLista!=null&&libroEnLista.isBorrado()) {
			System.out.println("Ya existe un libro con esa ID, no es posible a�adirlo.");
		}
		else {
			libros.add(libro);
		}
		
	}

	@Override
	public void modificar(Libro libro) {
		int posicionLibro = buscarPosicionLibro(libro.getId());
		if(posicionLibro>-1) {
		libros.set(posicionLibro, libro);}
		else {System.out.println("No hay libro ha modificar con esa ID");}
		
	}

	@Override
	public void borrar(Libro libro) {
		if(obtenerPorId(libro.getId()).getTitulo().equals(libro.getTitulo())) {libro.setIsBorrado(true);}
		else {System.out.println("El libro con esa ID y titulo no existe");}
		
		
	}

	@Override
	public void borrar(long id) {
		Libro libro = obtenerPorId(id);
	if(libro!=null) {libro.setIsBorrado(true);}
	else {System.out.println("El libro con esa ID no existe");}
	
		
	}
//	public void comparar(Libro libro1, Libro libro2) {
//		if(libro1.getId()==libro2.getId()) {
//			
//		}
//	}
	
	private int buscarPosicionLibro(long id) {
		int index=0;
//		boolean noEncontrado=true;
//		while(noEncontrado||index<libros.size()) {
//			if(id==libros.get(index).getId()) {
//				
//			}
//			index++;
//		}
		for(Libro libro: libros) {
			if(libro.getId()==id) {
				return index;
			}
			index++;
		}
		return -1;
	}

}
