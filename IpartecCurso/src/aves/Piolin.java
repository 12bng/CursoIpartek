package aves;

import aves.Loro.cardinales;

public class Piolin extends Canario {
	int numeroDePeliculas;
	
	public Piolin(sexoEleccion sexo, int edad, float tamano, int numeroDePeliculas) {
		super(sexo, edad, tamano);
		this.numeroDePeliculas = numeroDePeliculas;
	}

	public static void main(String[] args) {
		Piolin miPiolin = new Piolin(sexoEleccion.Macho,77, (float) 8.5,42);
		Loro miLoro = new Loro(sexoEleccion.Hembra, 5, cardinales.Sur, "Rojo");
		miPiolin.quienSoy();
		miLoro.quienSoy();
		miLoro.deDondeEres();
		miPiolin.setTamano(10);
		miPiolin.altura();
		miLoro.setRegion(cardinales.Oeste);
		miPiolin.numeroDeAvesCreadas();

	}

}
