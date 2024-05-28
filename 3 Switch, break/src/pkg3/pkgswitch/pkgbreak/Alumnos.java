package pkg3.pkgswitch.pkgbreak;

public class Alumnos {
    private String nombre;
    private String genero;
    private int matricula;
    private String carrera;
    private int semestre;
    private boolean credencial;

    public Alumnos(String nombre, String genero, int matricula,
                   String carrera, int semestre, boolean credencial) {
        this.nombre = nombre;
        this.genero = genero;
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestre = semestre;
        this.credencial = credencial;
    }
}
