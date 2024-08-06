package java_inicial.clase07._02_ejercitacion;

import com.github.sanchezih.util.math.Matematica;

public abstract class Servicio implements Facturable {

    // ----------- Atributos ----------- //
    protected double horas;

    // ----------- Constructores  ----------- //
    public Servicio(double horas) {
        this.horas = horas;
    }

    // ----------- Getters y Setters ----------- //
    public double getHoras() {
        return horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }

    // ----------- Metodos ----------- //
    public abstract double getValorHora();

    public double calcularPrecio() {
        return this.horas * getValorHora();
    }

    public double calcularFacturacion() {
        return Matematica.sumarPorcentaje(calcularPrecio(), (IVA / 2));
    }
}
