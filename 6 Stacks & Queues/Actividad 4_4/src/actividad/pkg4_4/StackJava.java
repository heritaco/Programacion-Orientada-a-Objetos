package actividad.pkg4_4;

/* Implementa un stack básico, usando un arreglo debes ser capaz de
introducir elementos en el inicio del stack y sacar (pop) elementos del
inicio del mismo */

import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        // Crear una pila
        Stack<String> stack = new Stack<>();

        // Añadir elementos en la parte superior de la pila
        stack.push("Es");
        stack.push("una");
        stack.push("pila");

        System.out.println("Mi pila: " + stack);

        // Eliminar elementos de la parte superior de la pila
        String ultimo = stack.pop();
        System.out.println("Elemento eliminado: " + ultimo);
        System.out.println("Pila después de eliminar: " + stack);
    }
}
