package paquete1;

public class CantidadHoras {
    
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    public void establecerHoras(int hora) {
        horas = hora;
    }
    public void calcularMinutos() {
        minutos = horas * 60;
    }
    public void calcularSegundos() {
        segundos = horas * 3600;
    }
    public void calcularDias() {
        dias = horas / 24;
    }
    public int obtenerHoras() {
        return horas;
    }
    public int obtenerMinutos() {
        return minutos;
    }
    public int obtenerSegundos() {
        return segundos;
    }    
    public double obtenerDias(){
        return dias;
    }

}