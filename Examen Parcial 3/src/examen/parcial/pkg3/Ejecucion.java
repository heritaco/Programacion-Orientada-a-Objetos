package examen.parcial.pkg3;

import java.util.Scanner;
import java.util.ArrayList;

import java.io.*;

public class Ejecucion {

    private static ArrayList<Alumno> alumnos = new ArrayList<>();
    public int opcion;

    public void iniciarPrograma() {

        Scanner sc = new Scanner(System.in);

        cargarDatos();

        while (true) {

            System.out.println("1. Agregar nuevo alumno.");
            System.out.println("2. Buscar alumno con ID.");
            System.out.println("3. Mostrar todos los alumnos actuales.");
            System.out.println("0. Salir.");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir nueva línea

            switch (opcion) {

                case 1:
                    agregarAlumno();
                    break;

                case 2:
                    buscarAlumno();
                    break;

                case 3:
                    mostrarTodosAlumnos();
                    break;

                case 0:
                    guardarDatos();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Intente de nuevo.");
            }
        }
    }

    private static void agregarAlumno() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        String idsc = sc.nextLine();
        int id = Integer.parseInt(idsc);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        String edadsc = sc.nextLine();
        int edad = Integer.parseInt(edadsc);

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        System.out.print("Semestre: ");
        String semestresc = sc.nextLine();
        int semestre = Integer.parseInt(semestresc);

        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        ArrayList<Float> promediosAnteriores = new ArrayList<>();

        for (int i = 0; i < semestre - 1; i++) {
            System.out.print("Promedio del semestre " + (i + 1) + ": ");
            String promediosc = sc.nextLine();
            float promedio = Float.parseFloat(promediosc);
            ;
            promediosAnteriores.add(promedio);
        }

        Alumno alumno = new Alumno(id, nombre, edad, sexo, semestre, carrera, promediosAnteriores);
        alumnos.add(alumno);
        crearArchivo(alumno);
        System.out.println("Alumno agregado.");
    }

    private static void buscarAlumno() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el ID del alumno: ");
        String idsc = sc.nextLine();
        int id = Integer.parseInt(idsc);

        Alumno alumno = leerArchivo(String.valueOf(id));

        if (alumno != null) {
            System.out.println(alumno);
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    private static void mostrarTodosAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }

    private static void cargarDatos() {
        File dir = new File(".");
        File[] files = dir.listFiles((d, name) -> name.endsWith(".txt"));

        if (files != null) {
            for (File file : files) {
                Alumno alumno = leerArchivo(file.getName().replace(".txt", ""));
                if (alumno != null) {
                    alumnos.add(alumno);
                }
            }
        }
    }

    private static void guardarDatos() {
        for (Alumno alumno : alumnos) {
            crearArchivo(alumno);
        }
    }

    public static Alumno leerArchivo(String id) {
        File file = new File(id + ".txt");
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufReader = new BufferedReader(fileReader);
                StringBuilder sb = new StringBuilder();
                String str = bufReader.readLine();
                while ((str) != null) {
                    sb.append(str).append("\n");
                    str = bufReader.readLine();
                }
                bufReader.close();
                return Alumno.agarrarArchivo(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void crearArchivo(Alumno alumno) {
        File file = new File(alumno.getId() + ".txt");
        try {
            file.createNewFile();
            FileWriter miFileWriter = new FileWriter(file);
            PrintWriter miPrintWriter = new PrintWriter(miFileWriter);
            miPrintWriter.print(alumno.escribir());
            miFileWriter.close();
            miPrintWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}