package examen.parcial.pkg3;

import java.util.Scanner;
import java.util.ArrayList;

import java.io.*;

public class Alumno {

    private int id;
    private String nombre;
    private int edad;
    private String sexo;
    private int semestre;
    private String carrera;
    private ArrayList<Float> promediosAnteriores;

    public Alumno(int id, String nombre, int edad, String sexo, int semestre, String carrera,
            ArrayList<Float> promediosAnteriores) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.semestre = semestre;
        this.carrera = carrera;
        this.promediosAnteriores = promediosAnteriores;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public ArrayList<Float> getPromediosAnteriores() {
        return promediosAnteriores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromediosAnteriores(ArrayList<Float> promediosAnteriores) {
        this.promediosAnteriores = promediosAnteriores;
    }

    public void agregarPromedio(float promedio) {
        promediosAnteriores.add(promedio);
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Sexo: " + sexo + "\n" +
                "Semestre: " + semestre + "\n" +
                "Carrera: " + carrera + "\n" +
                "Promedios Anteriores: " + promediosAnteriores;
    }

    public String escribir() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append("\n")
                .append(nombre).append("\n")
                .append(edad).append("\n")
                .append(sexo).append("\n")
                .append(semestre).append("\n")
                .append(carrera).append("\n");
        for (Float promedio : promediosAnteriores) {
            sb.append(promedio).append("\n");
        }
        return sb.toString();
    }

    public static Alumno agarrarArchivo(String archivo) {
        String[] lines = archivo.split("\n");
        int id = Integer.parseInt(lines[0]);
        String nombre = lines[1];
        int edad = Integer.parseInt(lines[2]);
        String sexo = lines[3];
        int semestre = Integer.parseInt(lines[4]);
        String carrera = lines[5];
        ArrayList<Float> promediosAnteriores = new ArrayList<>();
        for (int i = 6; i < lines.length; i++) {
            promediosAnteriores.add(Float.parseFloat(lines[i]));
        }
        return new Alumno(id, nombre, edad, sexo, semestre, carrera, promediosAnteriores);
    }
}
