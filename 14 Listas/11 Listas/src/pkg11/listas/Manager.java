package pkg11.listas;

import java.io.*;
import java.util.List;

public class Manager {

    public void ejecutar() {
        Fibonacci fibonacci = new Fibonacci();
        Splitter splitter = new Splitter();
        Manager manager = new Manager();

        List<Integer> fibonacciList = fibonacci.fibonacci();
        List<Integer> pares = splitter.pares(fibonacci);
        List<Integer> impares = splitter.impares(fibonacci);

        System.out.println("Fibonacci: " + fibonacciList);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);

        manager.crearArchivo("Fibonacci", fibonacciList);
        manager.crearArchivo("Pares", pares);
        manager.crearArchivo("Impares", impares);
    }

    public void crearArchivo(String nombreLista, List<Integer> lista) {
        File file = new File(nombreLista + ".txt");
        try {
            file.createNewFile();
            FileWriter miFileWriter = new FileWriter(file);
            PrintWriter miPrintWriter = new PrintWriter(miFileWriter);
            String mensaje = nombreLista + ": " + lista + "\n";
            miPrintWriter.print(mensaje);
            miFileWriter.close();
            miPrintWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            // } finally {
            // // close resources
            // try {
            // miFileWriter.close();
            // miPrintWriter.close();
            // } catch (IOException e) {
            // e.printStackTrace();
            // }
        }

    }

}
