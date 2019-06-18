package ejercicios1;

import java.io.IOException;

public class PruebaEntradaEstandar {
	static java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
	static java.io.BufferedReader br = new java.io.BufferedReader(isr);

	public static void main(String[] args) {
		int numero1, numero2;
		float float1, float2;
		String nombre;

		numero1 = peticionDeInt("operando entero 1: ");
		numero2 = peticionDeInt("operando entero 2: ");
		System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		float1 = peticionDeFloat("Operando flotante 1: ");
		float2 = peticionDeFloat("Operando flotante 2: ");
		System.out.println(float1 + " / " + float2 + " = " + (float1 / float2));
		nombre = peticionDeString("Introduzca su nombre: ");
		System.out.println("Hola " + nombre + ". ¡Bienvenido a Java!");
		try {
			br.close();
			isr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static int peticionDeInt(String mensaje) {
		boolean entradaCorrecta = false;
		String texto = null;
		int aux = 0;
		while (!entradaCorrecta) {
			System.out.print(mensaje);
			try {
				texto = br.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				aux = EntradaEstandar.leerInt(texto);
				entradaCorrecta = true;
			} catch (Exception e) {
				System.out.println("ERROR: El valor introducido no es correcto.");
			}
		}
		return aux;
	}

	private static float peticionDeFloat(String mensaje) {
		boolean entradaCorrecta = false;
		String texto = null;
		Float aux = null;
		while (!entradaCorrecta) {
			System.out.print(mensaje);
			try {
				texto = br.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				aux = EntradaEstandar.leerFloat(texto);
				entradaCorrecta = true;
			} catch (Exception e) {
				System.out.println("ERROR: El valor introducido no es correcto.");
			}
		}
		return aux;
	}

	private static String peticionDeString(String mensaje) {
		boolean entradaCorrecta = false;
		String texto = null;
		String aux = null;
		while (!entradaCorrecta) {
			System.out.print(mensaje);
			try {
				texto = br.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				aux = EntradaEstandar.leerString(texto);
				entradaCorrecta = true;
			} catch (Exception e) {
				System.out.println("ERROR: El valor introducido no es correcto.");
			}
		}
		return aux;
	}

}
