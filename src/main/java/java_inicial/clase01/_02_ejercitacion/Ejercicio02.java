package java_inicial.clase01._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio02 
 * 
 * Programa que pide por teclado la fecha de nacimiento de una
 * persona (dia, mes, anio) y calcula su numero de la suerte. El numero de la
 * suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y a
 * continuacion sumando las cifras obtenidas en la suma. Por ejemplo: Si la
 * fecha de nacimiento es 12/07/1980 Calculamos el numero de la suerte asi:
 * 12+7+1980 = 1999 1+9+9+9 = 28 Numero de la suerte: 28
 * 
 * @author NancyCima
 *
 */

public class Ejercicio02 {

	public static void main(String[] args) {
		int dia = Consola.leerEntero("Ingresa el número del día en que naciste");
		int mes = Consola.leerEntero("Ingresa el número del mes en que naciste");
		int anio = Consola.leerEntero("Ingresa el número del año en que naciste");

		int suma = dia + mes + anio;
		int numeroSuerte = (suma / 1000) + ((suma / 100) % 10) + ((suma / 10) % 10) + (suma % 10);

		System.out.println("Tu numero de la suerte es -> " + (numeroSuerte));
	}
}
