package ejercicioFecha;

public class Fecha {
	private int a�o = 0;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_A�O = 12;

	public static boolean esBisiesto(int a�o) {
		boolean esBisiesto = false;
		if(a�o%400==0) {esBisiesto=true;}
		else if(a�o%4==0&&a�o%100!=0) {esBisiesto= true;}
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
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
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
		if(o instanceof Fecha) {
			boolean esIgual =true;
			if(!( ((Fecha)o).getA�o()==this.a�o))  {esIgual=false;}
			else if(!( ((Fecha)o).getMes()==this.mes)){esIgual=false;}
			else if(!( ((Fecha)o).getDia()==this.dia)){esIgual=false;}
		};
		return true;
		
	}



}
