package java_inicial.clase07._02_ejercitacion;

public class Main {
    public static void main(String[] args) {

        Historial historial = new Historial();

        historial.agregarDatos();

        System.out.println("Servicios simples: " + historial.cantServiciosSimples());
        System.out.println("Cantidad de facturacion: " + String.format("%.2f", historial.montoTotalFacturado()));
    }
}
