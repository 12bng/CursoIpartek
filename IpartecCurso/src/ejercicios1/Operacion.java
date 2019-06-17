package ejercicios1;

public class Operacion {

	public Operacion() {

	}

	public static void main(String[] args) {
		//TODO
	}
	private static long combinaciones(int grupos, int total) {
		long combinaciones = factorial(grupos)/(factorial(grupos-total)*factorial(total));
		System.out.println(combinaciones);
		return combinaciones;
				
	}
	private static int factorial(int x) {
		int aux = 1;
		for(int i=1; i<=x; i++) {
			aux=aux*i;
		}
		return aux;
	}
	private void esPrimo(int numero) {
		int aux
		for()
	}

}
