package paquete1;

public class InstitucionEducativa2 {
       private String nombre;
    private String tipoInstitucion;
    private int numeroAlumno;
    private int numeroDocente;
    private int NumeroSede;

    public void establecerNombre(String n) {
        nombre = n;
    }
    public void establecerTipoInstitucion(String tipInstitucion) {
        tipoInstitucion = tipInstitucion;
    }
    public void establecerNumeroalumno(int numAlumno) {
        numeroAlumno = numAlumno;
    }
    public void estabablecerNumeroDocentes(int numDocente) {
        numeroDocente = numDocente;
    }
    public void establecerNumeroSedes(int NumSedes) {
        NumeroSede = NumSedes;
    }
    public String obtenerNombre() {
        return nombre;
    }
    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }
    public int obtenerNumeroalumno() {
        return numeroAlumno;
    }
    public int obtenerNumeroDocentes() {
        return numeroDocente;
    }
    public int obtenerNumeroSedes() {
        return NumeroSede;
    }
}