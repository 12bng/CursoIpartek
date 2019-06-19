package aves;

public class DatosPersonales {
	String nombreDelAve, nombreDelDueño;

	public DatosPersonales(String nombreDelAve, String nombreDelDueño) {
		this.nombreDelAve = nombreDelAve;
		this.nombreDelDueño = nombreDelDueño;
	}

	public String getNombreDelAve() {
		return nombreDelAve;
	}

	public void setNombreDelAve(String nombreDelAve) {
		this.nombreDelAve = nombreDelAve;
	}

	public String getNombreDelDueño() {
		return nombreDelDueño;
	}

	public void setNombreDelDueño(String nombreDelDueño) {
		this.nombreDelDueño = nombreDelDueño;
	}

}
