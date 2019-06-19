package aves;

public class Loro extends Ave {
	enum cardinales{
		Norte,
		Sur,
		Este,
		Oeste
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
	
	
}
