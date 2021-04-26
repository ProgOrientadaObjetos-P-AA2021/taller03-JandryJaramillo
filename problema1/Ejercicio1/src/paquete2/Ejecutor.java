package paquete2;

import paquete1.Terreno;

public class Ejecutor {
    public static void main(String[] args) {
        Terreno terreno = new Terreno();

        double largo = 30.15;
        double ancho = 15.12;
        double valormetrocuadrado = 35;

        terreno.establecerlargo(largo);
        terreno.establecerancho(ancho);
        terreno.establecervalormetrocuadrado(valormetrocuadrado);
        terreno.calculararea();
        terreno.calcularcosto();
        System.out.printf("Largo del terreno: %.2f\n "
                + "Ancho del terreno: %.2f\nValor Metros cuadrados: %.2f\n"
                + "Area del terreno: %.2f\n"
                + "Costo del terreno: %.2f\n", terreno.obtenerlargo(),
                terreno.obtenerancho(), terreno.obtenervalormetroscuadrados(),
                terreno.obtenerarea(),
                terreno.obtenercalcularcosto());
    }
}
