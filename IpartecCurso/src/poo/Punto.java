package poo;

public class Punto {
	// Constantes
	private static final int MINIMO_X = -100;
	private static final int MAXIMO_X = 100;

	// Enumeración
	enum Formatos {
		SIMPLE, COMPLEJO
	}

	// Variables de instancia (objeto)
	private int x, y;

	// Variables estáticas, "de clase" (compartidas)
	private static int defaultX = 1;
	private static int defaultY = 1;

	// Constructores
	public Punto(int x, int y) {
		setXY(x, y);
	}

	public Punto(int xy) {
		this(xy, xy);
	}

	public Punto() {
		this(defaultX, defaultY);
	}

	// Métodos de acceso (getters y setters)
	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x > MAXIMO_X || x < MINIMO_X) {
			throw new RuntimeException("No se admite el valor " + x);
		}

		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getXY() {
		return String.format("P(%s,%s)", getX(), getY());
	}

	public String getXY(boolean formatoComplejo) {
		return formatoComplejo ? getXY(Formatos.COMPLEJO) : getXY(Formatos.SIMPLE);
	}

	public String getXY(Formatos formato) {
		switch (formato) {
		case SIMPLE:
			return String.format("%s,%s", getX(), getY());
		case COMPLEJO:
			return getXY();
		default:
			throw new RuntimeException("Formato no reconocido");
		}
	}

	public void setXY(int x, int y) {
		setX(x);
		setY(y);
	}

	// Métodos estáticos
	public static int getDefaultX() {
		return defaultX;
	}

	public static void setDefaultX(int defaultX) {
		Punto.defaultX = defaultX;
	}

	public static int getDefaultY() {
		return defaultY;
	}

	public static void setDefaultY(int defaultY) {
		Punto.defaultY = defaultY;
	}

}
