package java_inicial.clase03._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio01
 * 
 * Programa que lee la altura de N personas y calcula:
 * 
 * 1. La altura media.
 * 
 * 2. Cuantas personas tienen una altura superior a la media.
 * 
 * 3. Cuantas tienen una altura inferior a la media.
 * 
 * El valor de N se pide por teclado y debe ser entero positivo.
 * 
 * @author NancyCima
 *
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		int i, N, cantMayorMedia = 0, cantMenorMedia = 0;
		double media = 0;

		// Leer el numero de personas
		do {
			N = Consola.leerEntero("Cantidad de personas: ");
		} while (N <= 0);

		// Se crea el array de tamanio N
		double[] alturas = new double[N];

		// Se leen las alturas
		System.out.println("Lectura de la altura de las personas: ");
		for (i = 0; i < N; i++) {
			alturas[i] = Consola.leerDouble("Persona " + (i + 1) + "= ");
			media = media + alturas[i]; // Se suma la estatura leida para calcular la media
		}

		// Se calcula la media
		media = media / N;

		// Se recorre todo el array para ver cuantos hay mas altos que la media y
		// cuantos mas bajos
		for (i = 0; i < alturas.length; i++) {
			if (alturas[i] > media) { // Si la estatura es mayor que la media
				cantMayorMedia++;
			} else if (alturas[i] < media) { // Si es menor
				cantMenorMedia++;
			}
		}

		// Mostrar resultados
		System.out.println("Estatura media: " + media);
		System.out.println("Personas con estatura superior a la media: " + cantMayorMedia);
		System.out.println("Personas con estatura inferior a la media: " + cantMenorMedia);
	}
}
