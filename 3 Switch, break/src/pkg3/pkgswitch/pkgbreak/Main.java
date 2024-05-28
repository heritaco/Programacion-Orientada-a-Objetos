package pkg3.pkgswitch.pkgbreak;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a registrar alumnos y buscarlos\n"
                + "Shortcuts: Registrar: 1, buscar: 2, salir: 0");
        
        while (true){
            System.out.println("\nRegistrar, buscar o salir?");
            String comando = sc.nextLine();
            comando = comando.toLowerCase();
            
            switch (comando){
                
                case "1":
                case "registrar":
                    
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Género: ");
                    String genero = sc.nextLine();
                    System.out.print("Mátricula: ");
                    String mat = sc.nextLine();
                    int matricula = Integer.parseInt(mat);
                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();
                    System.out.print("Semestre: ");
                    String sem = sc.nextLine();
                    int semestre = Integer.parseInt(sem);
                    System.out.print("¿Cuenta con credencial? (true o false): ");
                    String cre = sc.nextLine();
                    boolean credencial = Boolean.parseBoolean(cre);
                    
                    Registrar alumno = new Registrar(nombre, genero, matricula, carrera, semestre, credencial);
                    alumno.registrarAlumno();
                    
                    break;
                    
                case "2":
                case "buscar":
                    System.out.print("Mátricula del alumno que queires buscar: ");
                    String buscar = sc.nextLine();
                    // int buscar = Integer.parseInt(bus);
                    
                    Buscar alumno = new Buscar(buscar);
                    
                    break;
                    
                case "0":
                case "salir":
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("??\n"
                            + "Shortcuts: Registrar: 1, buscar: 2, salir: 0");
                
            }
        }
    }
}
