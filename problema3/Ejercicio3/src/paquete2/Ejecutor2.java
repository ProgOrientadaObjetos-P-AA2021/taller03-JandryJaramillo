package paquete2;

import paquete1.InstitucionEducativa2;

public class Ejecutor2 {
    public static void main(String[] args) {

        InstitucionEducativa2 IE = new InstitucionEducativa2();

        IE.establecerNombre("Eugenio Espejo");
        IE.establecerTipoInstitucion("Privada");
        IE.establecerNumeroalumno(700);
        IE.estabablecerNumeroDocentes(50);
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