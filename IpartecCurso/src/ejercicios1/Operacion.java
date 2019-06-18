package ejercicios1;

public class Operacion {

	public Operacion() {

	}

	public static void main(String[] args) {
		// TODO
		mostrarPrimos(50, 10);
	}

	private static long combinaciones(int grupos, int total) {
		long combinaciones = factorial(grupos, false) / (factorial(grupos - total, false) * factorial(total, false));
		System.out.println(combinaciones);
		return combinaciones;

	}

	private static long factorial(int x, boolean mostrar) {
		int aux = 1;
		StringBuffer log = new StringBuffer();
		for (int i = 1; i <= x; i++) {
			if (i > 1) {
				log.append("*");
			}
			aux = aux * i;
			log.append(i);
		}
		if (mostrar) {
			System.out.println(log);
			System.out.println(aux);
		}
		return aux;
	}

	private static boolean esPrimo(int numero) {
		boolean primo = true;
		int aux = numero - 1;
		while (primo && aux > 1) {
			if (numero % aux == 0) {
				primo = false;
			}
			aux--;
		}
//		if (!primo) {
//			System.out.println("No es un numero primo");
//		} else {
//			System.out.println("Es un numero primo");
//		}
		return primo;
	}

	private static void fibonacci(int num_factores) {
		int aux1 = 0, aux2 = 1, aux3;
		for (int i = 0; i < num_factores; i++) {
			aux3 = aux1;
			aux1 = aux2 + aux1;
			aux2 = aux3;
			System.out.println(aux2);
		}
	}

	private static void mostrarDivisores(int numero) {
		int aux = numero;
		System.out.println("Divisores:");
		while (aux > 0) {
			if (numero % aux == 0) {
				System.out.println(aux);
			}
			aux--;
		}
	}

	private static void mostrarDivisores(int numero, boolean primos) {
		int aux = numero;
		System.out.println("Divisores:");
		while (aux > 0) {
			if (!primos) {
				mostrarDivisores(numero);
			}

			if (primos) {
				if (numero % aux == 0) {
					if (esPrimo(aux))
						System.out.println(aux);
				}
			}
			aux--;
		}
	}

	private static void mostrarPrimos(int num_ini, int num_fin) {
		while (num_ini < num_fin) {
			if (esPrimo(num_ini)) {
				System.out.println(num_ini);
			}
			num_ini++;
		}
		while (num_ini > num_fin) {
			if (esPrimo(num_ini)) {
				System.out.println(num_ini);
			}
			num_ini--;
		}
		if (esPrimo(num_ini)) {
			System.out.println(num_ini);
		}

	}
}
