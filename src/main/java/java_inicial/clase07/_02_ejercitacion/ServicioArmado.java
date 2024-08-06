package java_inicial.clase07._02_ejercitacion;

public class ServicioArmado extends Servicio {

    // ----------- Atributos ----------- //
    private static final double VALOR_HORA = 250;

    // ----------- Constructor ----------- //
    public ServicioArmado(double horas) {
        super(horas);
    }

    // ----------- Metodos ----------- //
    @Override
    public double getValorHora() {
        return VALOR_HORA;
    }
}
