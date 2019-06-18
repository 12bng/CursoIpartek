package ejercicios1;

public class Fecha {
	private int año = 0;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_AÑO = 12;

	public static boolean esBisiesto(int año) {
		boolean esBisiesto = false;
		if (año % 400 == 0) {
			esBisiesto = true;
		} else if (año % 4 == 0 && año % 100 != 0) {
			esBisiesto = true;
		}
		return esBisiesto;
	}

	public Fecha() {

	}

	public Fecha(int año, int mes, int dia) {
		setAño(año);
		setMes(mes);
		setDia(dia);
	}

	public Fecha(Fecha f) {
		set(f);
	}

	public boolean esBisiesto() {
		return esBisiesto(año);
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes > 12 || mes < 1) {
			throw new FechaException("El mes ha de ser un número entre 1 y 12", new Throwable("Mes incorrecto"));
		}
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia < 1) {
			throw new FechaException("El día no puede ser inferior a 1", new Throwable("Día incorrecto"));
		}
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31)) {
			throw new FechaException("El día máximo para este mes es 31", new Throwable("Día incorrecto"));
		}
		if ((mes == 4 || mes == 6 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 30)) {
			throw new FechaException("El dia máximo para este mes es 30", new Throwable("Día incorrecto"));
		}
		if (esBisiesto() && (dia > 29)) {
			throw new FechaException("El diía máximo para febrero en año bisiesto es 29",
					new Throwable("Día incorrecto"));
		}
		if (!esBisiesto() && (dia > 28)) {
			throw new FechaException("El día máximo para febrero en año no bisiesto es 28",
					new Throwable("Día incorrecto"));
		}
		this.dia = dia;
	}

	public void set(int año, int mes, int dia) {
		setAño(año);
		setMes(mes);
		setDia(dia);
	}

	public void set(Fecha f) {
		setAño(f.getAño());
		setMes(f.getMes());
		setDia(f.getDia());
	}

	public String toString() {
		String log = "";
		log = new StringBuffer(log).append(dia).append("/").append(mes).append("/").append(año).toString();
		return log;
	}

	public boolean equals(Object o) {
		boolean esIgual = true;
		if (o instanceof Fecha) {
			if (!(((Fecha) o).getAño() == this.año)) {
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
