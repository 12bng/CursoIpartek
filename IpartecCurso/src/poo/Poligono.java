package poo;

import java.util.ArrayList;

public class Poligono {
	private ArrayList<Punto> puntos = new ArrayList<Punto>();

	public Punto[] getPuntos() {
		return puntos.toArray(new Punto[puntos.size()]);
	}

	public Punto[] getPuntosClonados() {
		Punto[] array = new Punto[puntos.size()];

		Punto punto;
		for (int i = 0; i < array.length; i++) {
			punto = puntos.get(i);
			array[i] = new Punto(punto.getX(), punto.getY());
		}

		return array;
	}

	public void add(Punto p) {
		puntos.add(p);
	}
}
