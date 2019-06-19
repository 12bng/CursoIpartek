package estrellastv;

import aves.Ave;
import aves.DatosPersonales;
import aves.Ave.sexoEleccion;
import aves.pajaros.Canario;
import aves.tropicales.Loro;
import aves.tropicales.Loro.cardinales;

public class Piolin extends Canario {
	int numeroDePeliculas;

	public Piolin(sexoEleccion sexo, int edad, float tamano, int numeroDePeliculas) {
		super(sexo, edad, tamano);
		this.numeroDePeliculas = numeroDePeliculas;
	}

	public static void main(String[] args) {
		// parte1
//		Piolin miPiolin = new Piolin(sexoEleccion.Macho,77, (float) 8.5,42);
//		Loro miLoro = new Loro(sexoEleccion.Hembra, 5, cardinales.Sur, "Rojo");
//		miPiolin.quienSoy();
//		miLoro.quienSoy();
//		miLoro.deDondeEres();
//		miPiolin.setTamano(10);
//		miPiolin.altura();
//		miLoro.setRegion(cardinales.Oeste);
//		miPiolin.numeroDeAvesCreadas();

		// Parte2
		Piolin[] bandadaPiolines = new Piolin[3];
		for (int i = 0; i < 3; i++) {
			bandadaPiolines[i] = new Piolin(sexoEleccion.Macho, 77, (float) 8.5, 42);
		}
		DatosPersonales datos = bandadaPiolines[0].getNombres();
		datos.setNombreDelAve("Figaro");
		datos.setNombreDelDueño("Pavarotti");
		Loro miLoro = new Loro(sexoEleccion.Hembra, 5, cardinales.Sur, "Rojo");
		miLoro.cantar();
		for (int i = 0; i < 3; i++) {
			bandadaPiolines[i].cantar();
		}
		System.out.println(datos.getNombreDelAve());
		System.out.println(datos.getNombreDelDueño());

	}

	@Override
	public void cantar() {
		System.out.println("Me parecio ver un lindo gatito");
	}

}
