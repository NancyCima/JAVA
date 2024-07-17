package java_inicial.clase01._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee 1 numero entero por teclado e indica si es multiplo de 2 o
 * de 3.
 * 
 * 
 * @author NancyCima
 *
 */
public class Ejercicio01 {
	public static void main(String[] args) {

		int numero = Consola.leerEntero("Introduce un numero entero:");
		int esMultiploDeDos = numero % 2;
		int esMultiploDeTres = numero % 3;

		if (esMultiploDeDos == 0 & esMultiploDeTres == 0) {
			System.out.println("Es multiplo de dos y tres");
		} else if (esMultiploDeDos == 0) {
			System.out.println("Es multiplo de dos");
		} else if (esMultiploDeTres == 0) {
			System.out.println("Es multiplo de tres");
		} else {
			System.out.println("No es multiplo de dos ni de tres");
		}

	}
}
