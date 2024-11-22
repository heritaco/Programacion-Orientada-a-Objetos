package actividad.pkg4_5;

/* Escribe un método que tome una cadena como entrada y la invierta
utilizando el stack */

import java.util.Stack;

public class Actividad4_5 {
    public static void main(String[] args) {
        // Crear una pila
        Stack<String> stack = new Stack<>();
        Stack<String> stackalreves = new Stack<>();

        // Añadir elementos en la parte superior de la pila
        stack.push("Es");
        stack.push("una");
        stack.push("pila");

        System.out.println("Mi pila: " + stack);

        // Invertir la pila
        while (!stack.isEmpty()) {
            stackalreves.push(stack.pop());
        }

        System.out.println("Pila invertida: " + stackalreves);

    }
}
