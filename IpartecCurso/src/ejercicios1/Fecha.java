package ejercicios1;

public class Fecha {
	private int a�o = 0;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_A�O = 12;

	public static boolean esBisiesto(int a�o) {
		boolean esBisiesto = false;
		if (a�o % 400 == 0) {
			esBisiesto = true;
		} else if (a�o % 4 == 0 && a�o % 100 != 0) {
			esBisiesto = true;
		}
		return esBisiesto;
	}

	public Fecha() {

	}

	public Fecha(int a�o, int mes, int dia) {
		setA�o(a�o);
		setMes(mes);
		setDia(dia);
	}

	public Fecha(Fecha f) {
		set(f);
	}

	public boolean esBisiesto() {
		return esBisiesto(a�o);
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes > 12 || mes < 1) {
			throw new FechaException("El mes ha de ser un n�mero entre 1 y 12", new Throwable("Mes incorrecto"));
		}
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia < 1) {
			throw new FechaException("El d�a no puede ser inferior a 1", new Throwable("D�a incorrecto"));
		}
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31)) {
			throw new FechaException("El d�a m�ximo para este mes es 31", new Throwable("D�a incorrecto"));
		}
		if ((mes == 4 || mes == 6 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 30)) {
			throw new FechaException("El dia m�ximo para este mes es 30", new Throwable("D�a incorrecto"));
		}
		if (esBisiesto() && (dia > 29)) {
			throw new FechaException("El di�a m�ximo para febrero en a�o bisiesto es 29",
					new Throwable("D�a incorrecto"));
		}
		if (!esBisiesto() && (dia > 28)) {
			throw new FechaException("El d�a m�ximo para febrero en a�o no bisiesto es 28",
					new Throwable("D�a incorrecto"));
		}
		this.dia = dia;
	}

	public void set(int a�o, int mes, int dia) {
		setA�o(a�o);
		setMes(mes);
		setDia(dia);
	}

	public void set(Fecha f) {
		setA�o(f.getA�o());
		setMes(f.getMes());
		setDia(f.getDia());
	}

	public String toString() {
		String log = "";
		log = new StringBuffer(log).append(dia).append("/").append(mes).append("/").append(a�o).toString();
		return log;
	}

	public boolean equals(Object o) {
		boolean esIgual = true;
		if (o instanceof Fecha) {
			if (!(((Fecha) o).getA�o() == this.a�o)) {
				esIgual = false;
			} else if (!(((Fecha) o).getMes() == this.mes)) {
				esIgual = false;
			} else if (!(((Fecha) o).getDia() == this.dia)) {
				esIgual = false;
			}
		} else {
			esIgual = false;
		}
		return esIgual;

	}

}
