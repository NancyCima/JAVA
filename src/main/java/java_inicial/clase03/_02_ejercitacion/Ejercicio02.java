package java_inicial.clase03._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio02
 * 
 * Programa que pide 10 numeros por teclado, los almacena en un array y que
 * luego muestra el maximo valor, el minimo y las posiciones que ocupan en el
 * array.
 * 
 * @author NancyCima
 *
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		// Creacion del array
		final int CANT_ELEMENTOS = 10;
		int[] array = new int[CANT_ELEMENTOS];

		int maximo = Integer.MIN_VALUE; // Lo inicializo con el menor valor int
		int minimo = Integer.MAX_VALUE; // Lo inicializo con el mayor valor int
		int indiceMaximo = 0;
		int indiceMinimo = 0;

		System.out.println("Ingrese " + CANT_ELEMENTOS + " numeros");
		for (int i = 0; i < array.length; i++) {
			array[i] = Consola.leerEntero("numeros[" + i + "]= ");

			if (array[i] < minimo) {
				minimo = array[i];
				indiceMinimo = i;
			}

			if (array[i] > maximo) {
				maximo = array[i];
				indiceMaximo = i;
			}
		}

		System.out.println("El maximo es " + maximo + " y su indice es " + (indiceMaximo));
		System.out.println("El minimo es " + minimo + " y su indice es " + (indiceMinimo));
	}
}
