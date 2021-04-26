package paquete1;

public class Terreno {    
    private double costo;
    private double ancho;
    private double area;
    private double largo;
    private double valormetrocuadrado;

    public void establecerancho(double Ancho) {
        ancho = Ancho;
    }
    public void establecerlargo(double Largo) {
        largo = Largo;
    }
    public void establecervalormetrocuadrado(double MetroCuadrado) {
        valormetrocuadrado = MetroCuadrado;
    }
    public void calculararea() {
        area = largo * ancho;
    }
    public void calcularcosto() {
        costo = area * valormetrocuadrado;
    }
    public double obtenercosto() {
        return costo;
    }
    public double obtenerancho() {
        return ancho;
    }
    public double obtenerlargo() {
        return largo;
    }
    public double obtenerarea() {
        return area;
    }
    public double obtenervalormetroscuadrados() {
        return valormetrocuadrado;
    }
    public double obtenercalcularcosto() {
        return costo;
    }
}