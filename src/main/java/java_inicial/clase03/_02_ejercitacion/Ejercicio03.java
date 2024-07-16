package java_inicial.clase03._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio03
 * 
 * Programa que pide 5 numeros enteros, los almacena en un array, e indica por
 * pantalla si dicho array es capicua.
 * 
 * @author NancyCima
 *
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// Creacion del array
		final int CANT_ELEMENTOS = 5;
		int[] array = new int[CANT_ELEMENTOS];

		int inicial = 0;
		int fin = array.length - 1;
		boolean esCapicua = true;

		// Llenado del array
		System.out.println("Ingrese " + CANT_ELEMENTOS + " numeros");
		for (int i = 0; i < array.length; i++) {
			array[i] = Consola.leerEntero("numeros[" + i + "]= ");
		}

		// Comprobacion
		while (inicial <= fin && esCapicua) {
			esCapicua = (array[inicial++] == array[fin--]);
		}

		if (esCapicua) {
			System.out.println("El array es capicua");
		} else {
			System.out.println("El array NO es capicua");
		}
	}

}
