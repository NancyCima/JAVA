package java_inicial.clase02._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio03 El programa leera por teclado un numero entero positivo y
 * calculara la suma de sus cifras. Por ejemplo, si se ingresa el numero 3601 el
 * programa debera mostrar: "La suma de sus cifras es: 10".
 * 
 * @author NancyCima
 *
 */
public class Ejercicio03 {
	public static void main(String[] args) {

		int numero;
		int sumaCifras = 0;

		do {
			numero = Consola.leerEntero("Ingrese un numero positivo");
		} while (numero <= 0);

		while (numero > 0) {
			// Calculo la ultima cifra y luego me quedo con la division entera (numero sin
			// esa cifra)
			int cifra = numero % 10;
			sumaCifras += cifra;
			numero /= 10;
		}

		System.out.print("La suma de la cifra es: " + sumaCifras);
	}
}
