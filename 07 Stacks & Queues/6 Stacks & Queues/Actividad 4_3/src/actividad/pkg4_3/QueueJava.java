package actividad.pkg4_3;

/* Implementa un queue básico, usando un arreglo debes ser capaz de
añadir elementos al final de una cola y eliminar elementos de la parte
delantera */

import java.util.Queue;
import java.util.LinkedList; // LinkedList es una implementación que utiliza una lista  para almacenar los elementos de la cola (ChatGPT, 2024).

public class QueueJava {
    public static void main(String[] args) {
        // Crear una cola, LinkedList hace que sea fácil implementar una cola en Java
        Queue<String> queue = new LinkedList<>(); // (ChatGPT, 2024)

        // Añadir elementos al final de la cola
        queue.add("Es");
        queue.add("una");
        queue.add("cola");

        System.out.println("Mi cola: " + queue);

        // Eliminar elementos de la parte delantera
        String primero = queue.remove();
        System.out.println("Elemento eliminado: " + primero);
        System.out.println("Cola después de eliminar: " + queue);
    }
}