package com.ipartek.formacion.uf2216.ejercicios.global.accesodatos;

public class LibroException extends RuntimeException {
	public LibroException() {

	}

	public LibroException(String message) {
		super(message);
		// System.out.println(message);
	}

	public LibroException(String message, Throwable cause) {
		// System.out.println(message);
		super(message, cause);
	}

	public LibroException(Throwable cause) {
		super(cause);
	}

}
