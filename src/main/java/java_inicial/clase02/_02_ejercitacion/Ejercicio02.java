package com.github.sanchezih.java_inicial.clase02._02_ejercitacion;

import ar.edu.ort.p1.util.Consola;

/**
 * Ejercicio02 
 * Comprobar si dos numeros son amigos. Dos numeros enteros
 * positivos A y B son numeros amigos si la suma de los divisores propios de A
 * es igual a B y la suma de los divisores propios de B es igual a A.
 * 
 * Los divisores propios de un número incluyen la unidad pero no el propio
 * numero.
 * 
 * Un ejemplo de numeros amigos son los numeros 220 y 284.
 * 
 * Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
 * 
 * La suma de los divisores propios de 220 da como resultado 284
 * 
 * Los divisores propios de 284 son 1, 2, 4, 71 y 142.
 * 
 * La suma de los divisores propios de 284 da como resultado 220.
 * 
 * Por lo tanto 220 y 284 son amigos.
 * 
 * Otras parejas de numeros amigos son: 1184, 1210 2620, 2924 5020, 5564 6232,
 * 6368 10744, 10856 12285, 14595 17296, 18416
 * 
 * @author NancyCima
 *
 */
public class Ejercicio02 {
	public static void main(String[] args) {

		int a = Consola.leerEntero("Introduce el primer número:");
		int b = Consola.leerEntero("Introduce un segundo número para comprobar si ambos números son amigos:");
		int sumaA = 0;
		int sumaB = 0;
		
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sumaA += i;
			}
		}
		
		for (int i = 1; i < b; i++) {
			if (a % i == 0) {
				sumaB += i;
			}
		}
		
		if (sumaA == b && sumaB == a) {
			System.out.println("Los numeros" + a + "y" + b + "son amigos");
		} else {
			System.out.println("Los numeros"+ a + "y" + b + "no son amigos");
		}

	}

}
