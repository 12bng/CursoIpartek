package aves.tropicales;

import aves.Ave;
import aves.Ave.sexoEleccion;

public class Loro extends Ave {
	public enum cardinales {
		Norte, Sur, Este, Oeste
	}

	private cardinales region;
	private String color;

	public Loro(sexoEleccion sexo, int edad, cardinales region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}

	public void deDondeEres() {
		System.out.println(region.name());
	}

	public void setRegion(cardinales region) {
		this.region = region;
	}

	@Override
	public void cantar() {
		System.out.println("Piiio-piiiio loro bonito");
	}

}
