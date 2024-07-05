/**
 * Programa que comprueba si un año es bisiesto. Un año es bisiesto si es
 * divisible por 4 y no lo es por 100 o si es divisible por 400.
 */

 public class Ejercicio04 {

	public static void main(String[] args) {
		int anio = Consola.leerEntero("Introduce el año que deseas comprobar si es bisiesto");
        if (anio % 400 == 0) {
			System.out.println("El año es bisiesto");
		} else if (anio % 4 == 0 && anio % 100 != 0) {
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
		}
    }
 }