package paquete2;

import paquete1.CantidadHoras;

public class Ejecutor {
    public static void main(String[] args) {
        CantidadHoras eqHoras = new CantidadHoras();

        int horas = 96;
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