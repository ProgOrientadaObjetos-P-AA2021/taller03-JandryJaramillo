package paquete2;

import paquete1.EquipoCelular;

public class Ejecutor {
    
    public static void main(String[] args) {
        EquipoCelular cel = new EquipoCelular();

        cel.establecersistemaoperativo("Android");
        cel.estabelcertamañodepantalla(11.5);
        cel.estabelcercosto(750);
        cel.estabelcerInformacionimei(1095149562);
        cel.estabelcerDireccionmac("84:64:1a:ec:5b:c9");
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
