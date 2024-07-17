package java_inicial.clase02._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio01
 *
 * Programa que muestra los N primeros numeros de la serie de Fibonacci. El
 * valor de N se lee por teclado. La serie de fibonacci la forman una serie de
 * numeros tales que: El primer termino de la serie es el numero 1. El segundo
 * termino de la serie es el numero 1. Los siguientes terminos de la serie de
 * fibonacci se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…
 * 
 * @author NancyCima
 *
 */
public class Ejercicio01 {
	public static void main(String[] args) {
		int numero;
		int fibonacci;
		int fibonacciAnt;
		int aux;

		do {
			numero = Consola.leerEntero("Ingrese un numero mayor o igual a 1: ");
		} while (numero < 1);

		fibonacci = 1;
		fibonacciAnt = 0;
		aux = 0;

		for (int j = 1; j <= numero; j++) {
			System.out.println(fibonacci);
			aux = fibonacci;
			fibonacci = fibonacci + fibonacciAnt;
			fibonacciAnt = aux;
		}

	}
}