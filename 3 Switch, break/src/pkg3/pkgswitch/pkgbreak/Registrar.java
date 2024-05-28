package pkg3.pkgswitch.pkgbreak;

public class Registrar {
    public String nombre;
    public String genero;
    public String matricula;
    public String carrera;
    public String semestre;
    public boolean credencial;
    public Alumnos alumnos[]; //Guardamos a los alumnos de la clase Alumnos
    public String buscar;
    
    public Registrar(String nombre, String genero, String matricula,
            String carrera, String semestre, boolean credencial){
        this.nombre = nombre;
        this.genero = genero;
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestre = semestre;
        this.credencial = credencial;
    }
    
    public void registrarAlumno(){

        String alumno = "Nombre:" + this.nombre + "Género: " + this.genero + 
                "Matrícula: " + this.matricula + "Carrera: " + this.carrera + 
                "Semestre: " + this.semestre + "Credencial: " + this.credencial;
        
        for(int i=0; i <=10; i++){
            if(alumnos[i]==null){
                alumnos[i]=alumno;
                System.out.println("Alumno agregado correctamente");
                break; // Si no se guarda las 10 veces el alumno
            }
            else{
                System.out.println("Ya no hay espacio :p contrate la version premium para tener acceso ilimitado");
            }
        }
    }
    
    public void buscarAlumno(){
        System.out.println("Buscando...");
        boolean encontrado = false;
        for(int i=0; i<=10; i++){
            Boolean result = alumnos[i].contains(buscar);
        }
        
    }
}


