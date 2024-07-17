package java_inicial.clase04._02_ejercitacion;

/**
 * Ejercicio02 Programa que genera un array de 8 enteros aleatorios entre 1 y
 * 10, lo ordena utilizando el algoritmo de ordenamiento de burbuja y lo
 * muestra.
 * 
 * @author NancyCima
 *
 */

public class Ejercicio02 {

	public static void main(String[] args) {

		final int CANT_ELEMENTOS = 8;
		int array[] = new int[CANT_ELEMENTOS];

		// Se llena el array con valores aleatorios entre 1 y 10
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
		}

		// Se muestra el array completo
		System.out.println("Los valores son:");
		mostrarArray(array);

		int[] arrayOrdenado = ordenamientoBurbuja(array);
		System.out.println("\n Los valores ordenados son:");
		mostrarArray(arrayOrdenado);
	}

	/*
	 * ordenamientoBurbuja implementa el algoritmo de ordenamiento de burbuja sobre
	 * un array de enteros
	 * 
	 * @param array
	 */
	static int[] ordenamientoBurbuja(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < (array.length - 1 - i); j++) {
				if (array[j] > array[j + 1]) {
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		return array;
	}

	/**
	 * mostrarArray imprime cada uno de los elementos de un array
	 * 
	 * @param array
	 */
	static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}