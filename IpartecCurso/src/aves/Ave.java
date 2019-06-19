package aves;

public class Ave {
	public enum sexoEleccion {
		Macho, Hembra
	}

	private sexoEleccion sexo;
	private int edad;
	private static int numeroDeAves;
	private DatosPersonales nombres;

	public Ave(sexoEleccion sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		nombres = new DatosPersonales("Sin nombre", "Sin dueño");
		aumentarNumeroDeAves();
	}

	public int getEdad() {
		return this.edad;
	}

	public void numeroDeAvesCreadas() {
		System.out.println(numeroDeAves);
	}

	private void aumentarNumeroDeAves() {
		numeroDeAves++;
	}

	public void quienSoy() {
		String log = "";
		log = new StringBuffer(log).append("Sexo: ").append(sexo.name()).append(" Edad: ").append(edad).toString();
		System.out.println(log);
	}

	public void cantar() {
	}

	public DatosPersonales getNombres() {
		return nombres;
	}
}
