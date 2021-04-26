package paquete2;

import paquete1.InstitucionEducativa;

public class Ejecutor {
    public static void main(String[] args) {

        InstitucionEducativa IE = new InstitucionEducativa();

        IE.establecerNombre("APC");
        IE.establecerTipoInstitucion("Privada");
        IE.establecerNumeroalumno(1200);
        IE.estabablecerNumeroDocentes(150);
        IE.establecerNumeroSedes(1);

        System.out.printf(" - Nombre de la Institucion: %s\n "
                + "- Tipo de Educacion: %s\n"
                + " - Numero Alumnos: %d\n"
                + " - Numero de Docentes: %d\n"
                + " - Numeros de sedes: %d\n",
                IE.obtenerNombre(),
                IE.obtenerTipoInstitucion(),
                IE.obtenerNumeroalumno(),
                IE.obtenerNumeroDocentes(),
                IE.obtenerNumeroSedes());
    }
}