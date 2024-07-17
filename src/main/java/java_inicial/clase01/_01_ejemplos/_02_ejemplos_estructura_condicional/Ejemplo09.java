package java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import com.github.sanchezih.util.io.Consola;

import java.io.IOException;

/**
 * Programa que lee un caracter por teclado y comprueba si es un digito numerico
 * (Cifra entre 0 y 9).
 * 
 * @author ihsanch
 *
 */
public class Ejemplo09 {

	public static void main(String[] args) throws IOException {

		char caracter = Consola.leerCaracter("Ingrese el caracter: ");

		if (Character.isDigit(caracter)) { // Utilizamos el metodo isDigit de la clase Character
			System.out.println("Es un numero");
		} else {
			System.out.println("No es un numero");
		}
	}
}
