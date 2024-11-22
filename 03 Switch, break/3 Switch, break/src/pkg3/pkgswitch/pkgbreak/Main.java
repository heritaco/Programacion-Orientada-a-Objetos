package pkg3.pkgswitch.pkgbreak;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creamos un ArrayList llamado 'listaAlumnos' de objetos de la clase 'Alumnos'.
        // Un ArrayList una lista de tamaño dinámico.
        // Dentro de <>, se especifica el tipo de objeto que se almacenará.
        // new ArrayList<>() es un constructor que crea un ArrayList vacío.
        // (ChatGPT, 2024).
        ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
        int numalumnos = 0;
        int maxalumnos = 10;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a registrar alumnos y buscarlos\n"
                + "Shortcuts: Registrar: 1, buscar: 2, lista: 3, salir: 0");

        while (true) {
            System.out.println("\n¿Registrar, buscar, lista, salir?");
            String comando = sc.nextLine();
            comando = comando.toLowerCase(); // Convertimos el comando a minúsculas
            Alumnos alumno = null; // No nos da error en caso de que no se haya creado un alumno (ChatGPT, 2024).

            switch (comando) {
                case "1":
                case "registrar":
                    if (numalumnos >= maxalumnos) {
                        System.out.println("¡Ya no puedes registrar más alumnos!\n" +
                                "contrata la versión premium para registrar más alumnos :p");
                        break;
                    }
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Género: ");
                    String genero = sc.nextLine();
                    System.out.print("Mátricula: ");
                    String mat = sc.nextLine(); // Aunque es un número, es recomendable leerlo como string
                    int matricula = Integer.parseInt(mat); // Convertimos el string a integer
                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();
                    System.out.print("Semestre: ");
                    String sem = sc.nextLine();
                    int semestre = Integer.parseInt(sem);
                    System.out.print("¿Cuenta con credencial? (true o false): ");
                    String cre = sc.nextLine();
                    boolean credencial = Boolean.parseBoolean(cre);
                    // Creamos un objeto de la clase Alumnos
                    alumno = new Alumnos(nombre, genero, matricula, carrera, semestre, credencial);
                    // Add the alumno object to the ArrayList (ChatGPT, 2024)
                    listaAlumnos.add(alumno);
                    System.out.println("¡Alumno registrado!");
                    numalumnos++;
                    break;

                case "2":
                case "buscar":
                    System.out.print("Mátricula del alumno que queires buscar: ");
                    String mataBus = sc.nextLine();
                    int matriculaaBuscar = Integer.parseInt(mataBus);
                    // Para cada a, del tipo 'Alumnos' en 'listaAlumnos' (ChatGPT, 2024).
                    for (Alumnos a : listaAlumnos) {
                        if (a.getMatricula() == matriculaaBuscar) { // no usamos metodos de strings porque es un int
                            System.out.println("Alumno encontrado: ");
                            a.stringAlumno();
                            break;
                        } else {
                            System.out.println("Alumno no encontrado");
                            break; // Si no se imprime muchas veces
                        }
                    }
                    break;

                case "3":
                case "lista":
                    System.out.println("Lista de alumnos: ");
                    // Para cada a, del tipo 'Alumnos' en 'listaAlumnos' ... (ChatGPT, 2024).
                    for (Alumnos a : listaAlumnos) {
                        a.stringAlumno();
                    }
                    break;

                case "0":
                case "salir":
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("??\n" +
                            "¿Quisiste decir que quieres ver los atajos?\n" +
                            "Shortcuts: Registrar: 1, buscar: 2, lista: 3, salir: 0");
                    break;
            }
        }
    }
}
