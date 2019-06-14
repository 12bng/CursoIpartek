package poo;

public class PoligonoPrueba {

	public static void main(String[] args) {
		Poligono poligono = new Poligono();
		
		poligono.add(new Punto(1,2));
		poligono.add(new Punto(3,4));
		
		Punto[] array = poligono.getPuntosClonados(); 
		array[0] = new Punto(11,12);
		array[1].setX(10);
		
		for(Punto punto: array) {
			System.out.println(punto.getXY());
		}
		
		for(Punto punto: poligono.getPuntosClonados()) {
			System.out.println(punto.getXY());
		}
	}

}
