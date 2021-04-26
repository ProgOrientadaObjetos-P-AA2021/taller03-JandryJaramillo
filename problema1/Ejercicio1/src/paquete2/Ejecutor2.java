package paquete2;

import paquete1.Terreno2;

public class Ejecutor2 {
    public static void main(String[] args) {
        Terreno2 terreno = new Terreno2();

        double largo = 50.30;
        double ancho = 60.20;
        double valormetrocuadrado = 50;

        terreno.establecerlargo(largo);
        terreno.establecerancho(ancho);
        terreno.establecervalormetrocuadrado(valormetrocuadrado);
        terreno.establecerarea();
        terreno.establecercosto();
        System.out.printf("Largo del terreno: %.2f\n "
                + "Ancho del terreno: %.2f\nValor Metros cuadrados: %.2f\n"
                + "Area del terreno: %.2f\n"
                + "Costo del terreno: %.2f\n", terreno.obtenerlargo(),
                terreno.obtenerancho(), terreno.obtenervalormetroscuadrados(),
                terreno.obtenerarea(),
                terreno.obtenercosto());
    }
}