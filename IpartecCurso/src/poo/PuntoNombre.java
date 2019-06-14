package poo;

public class PuntoNombre extends Punto {
private String nombre;

public PuntoNombre(String nombre, int x, int y) {
	super(x,y);
	setNombre(nombre);
}

public PuntoNombre(String nombre, int xy) {
	this(nombre, xy, xy);
}
public PuntoNombre(String nombre) {
	setNombre(nombre);
}

public void setNombre(String nombre) {
	this.nombre=nombre;
}

}
