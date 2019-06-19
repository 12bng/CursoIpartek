package aves.pajaros;

import aves.Ave;
import aves.Ave.sexoEleccion;

public class Canario extends Ave {
	float tamano;

	public Canario(sexoEleccion sexo, int edad, float tamano) {
		super(sexo, edad);
		setTamano(tamano);
	}

	public Canario(sexoEleccion sexo, int edad) {
		super(sexo, edad);
	}

	public void setTamano(float tamaño) {
		this.tamano = tamaño;
	}

	public void altura() {
		if (tamano > 30) {
			System.out.println("Alto");
		} else if (tamano < 15) {
			System.out.println("Bajo");
		} else {
			System.out.println("Mediano");
		}
	}

}
