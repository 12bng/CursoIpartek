package aves;

public class Ave {
	enum sexoEleccion{
		Macho,
		Hembra
	}
	private sexoEleccion sexo;
	private int edad;
	private static int numeroDeAves;
	public Ave(sexoEleccion sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
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
	
}
