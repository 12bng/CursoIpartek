package ejercicioFecha;

public class Fecha {
	private int año = 0;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_AÑO = 12;

	public static boolean esBisiesto(int año) {
		boolean esBisiesto = false;
		if(año%400==0) {esBisiesto=true;}
		else if(año%4==0&&año%100!=0) {esBisiesto= true;}
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
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
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
		if(o instanceof Fecha) {
			boolean esIgual =true;
			if(!( ((Fecha)o).getAño()==this.año))  {esIgual=false;}
			else if(!( ((Fecha)o).getMes()==this.mes)){esIgual=false;}
			else if(!( ((Fecha)o).getDia()==this.dia)){esIgual=false;}
		};
		return true;
		
	}



}
