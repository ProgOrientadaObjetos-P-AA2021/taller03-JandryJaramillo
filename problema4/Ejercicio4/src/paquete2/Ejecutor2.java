package paquete2;

import paquete1.EquipoCelular2;

public class Ejecutor2 {
     
    public static void main(String[] args) {
        EquipoCelular2 cel = new EquipoCelular2();

        cel.establecersistemaoperativo("Android");
        cel.estabelcertamañodepantalla(14);
        cel.estabelcercosto(1000);
        cel.estabelcerInformacionimei(1084712635);
        cel.estabelcerDireccionmac("68:74:1a:ec:5c:d7");
        System.out.printf("Sistema operativo: %s\n"
                + "Tamaño de Pantalla: %.2f\n"
                + "Costo del Celular: %.2f\n"
                + "Informacion de Imei: %d\n"
                + "Direccion mac: %s\n",
                cel.obtenersistemaoperativo(), cel.obtenertamañodepantalla(),
                cel.obtenercosto(), cel.obtenerInformacionimei(),
                cel.obtenerDireccionmac());
    }
}
