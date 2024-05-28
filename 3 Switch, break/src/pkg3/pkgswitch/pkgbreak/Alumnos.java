package pkg3.pkgswitch.pkgbreak;

// Este archivo crea un objeto de la clase Alumnos
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

    // Creamos un metodo para hacer al alumno un string, lo guardaremos en un array
    public void stringAlumno() {
        System.out.println("Nombre: " + this.nombre + " Género: " + this.genero
                + " Matrícula: " + this.matricula + " Carrera: " + this.carrera
                + " Semestre: " + this.semestre + " Credencial: " + this.credencial);
    }

    // Creamos un metodo para obtener la matricula del alumno
    public int getMatricula() {
        return this.matricula; // Retornamos la matricula del alumno
    }
}
