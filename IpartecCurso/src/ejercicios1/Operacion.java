package ejercicios1;

public class Operacion {

	public Operacion() {

	}

	public static void main(String[] args) {
		// TODO
	}

	private static long combinaciones(int grupos, int total) {
		// total==m grupos==n
		long combinaciones = factorial(total, false) / (factorial(total - grupos, false) * factorial(grupos, false));
		System.out.println(combinaciones);
		return combinaciones;

	}

	private static long factorial(int x, boolean mostrar) {
		long aux = 1;
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
		long aux = numero - 1;
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
		long aux1 = 0, aux2 = 1, aux3;
		for (int i = 0; i < num_factores; i++) {
			aux3 = aux1;
			aux1 = aux2 + aux1;
			aux2 = aux3;
			System.out.println(aux2);
		}
	}

	private static void mostrarDivisores(int numero) {
		long aux = numero;
		System.out.println("Divisores:");
		while (aux > 0) {
			if (numero % aux == 0) {
				System.out.println(aux);
			}
			aux--;
		}
	}

	private static void mostrarDivisores(int numero, boolean primos) {
		long aux = numero;
		System.out.println("Divisores:");
		while (aux > 0) {
			if (!primos) {
				mostrarDivisores(numero);
			}

			if (primos) {
				if (numero % aux == 0) {
					if (esPrimo((int) aux))
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

	private static long permutaciones(int num_elementos) {
		long aux = factorial(num_elementos, false);
		System.out.println(aux);
		return aux;
	}

	private static double potencia(int base, int potencia) {
		double aux = 1;
		if (potencia > 0) {
			while (potencia > 0) {
				aux = aux * base;
				potencia--;
			}
		}
		if (potencia < 0) {
			while (potencia < 0) {
				aux = aux / base;
				potencia++;
			}
		}
		System.out.println(aux);
		return aux;
	}

	private static long variaciones(int grupos, int total) {
		// total==m grupos==n
		return factorial(total, false) / factorial(total - grupos, false);
	}
}
