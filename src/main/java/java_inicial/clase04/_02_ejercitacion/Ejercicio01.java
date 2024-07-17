package java_inicial.clase04._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio01 Programa que pide el ingreso de un numero e indica si es un
 * numero primo o no.
 * 
 * @author NancyCima
 *
 */

public class Ejercicio01 {

	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero: ");

		esPrimo(numero);
	}

	/**
	 * esPrimo Recibe un numero entero por parametro y muestra si es primo o no.
	 * 
	 * @param numero
	 */
	static void esPrimo(int numero) {
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
				break;
			}
		}
		if (primo) {
			System.out.println("El numero " + numero + " es primo");
		} else {
			System.out.println("El numero " + numero + " no es primo");
		}
	}

}