package paquete2;

import paquete1.CantidadHoras2;

public class Ejecutor2 {
    public static void main(String[] args) {
        CantidadHoras2 eqHoras = new CantidadHoras2();

        int horas = 72;
        eqHoras.establecerHoras(horas);
        eqHoras.calcularMinutos();
        eqHoras.calcularSegundos();
        eqHoras.calcularDias();
        System.out.printf("Horas establecidas: %d\n"
                + "Minutos: %d\n " + "Segundos: %d\n " + "Dias: %.2f\n ",
                eqHoras.obtenerHoras(),eqHoras.obtenerMinutos(),
                eqHoras.obtenerSegundos(),eqHoras.obtenerDias());
    }
}