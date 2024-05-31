package actividad.pkg4_6;

/* Implementa el verificador de palíndromo con un método que reciba la 
cadena de entrada y verifique si es palíndromo usando stack */

import java.util.Stack;

public class Palindromo {
    public static void main(String[] args) {
        // Crear una pila
        Stack<Character> stack = new Stack<>();
        Stack<Character> stackalreves = new Stack<>();

        // Añadir elementos en la parte superior de la pila
        stack.push('a');
        stack.push('n');
        stack.push('a');

        System.out.println("Mi pila: " + stack);

        // Crear una copia de la pila para compararlo con la pila invertida, pq luego
        // desaparece
        Stack<Character> stackCopy = (Stack<Character>) stack.clone();

        // Invertir la pila
        while (!stack.isEmpty()) {
            stackalreves.push(stack.pop());
        }

        System.out.println("Pila invertida: " + stackalreves);

        // Comprobar si es palíndromo
        if (stackCopy.equals(stackalreves)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }

    }

    public class MyQueue { // Clase MyQueue
        private int MAX; // MAX representa el tamaño del arreglo
        private char[] queue; // queue es el arreglo de caracteres
        private int tail; // tail es el índice de la siguiente posición libre

        // Constructor
        public MyQueue(int tamaño) {
            MAX = tamaño; // MAX representa el tamaño del arreglo
            queue = new char[MAX]; // stack[] es el arreglo del tipo char
            tail = 0; // top es el índice de la posición disponible
        }

        public void insert(char data) {
            if (tail == MAX) {
                System.out.println("Cola llena");
            } else {
                queue[tail] = data; // agrega un elemento
                tail++; // incrementa el valor de top
            }
        }

        public char delete() {
            if (tail == 0) {
                System.out.println("Cola vacía");
                return '#';
            } else {
                char primero = queue[0]; // agarra el primer elemento

                // Mueve los elementos una posición hacia adelante
                for (int i = 0; i < tail - 1; i++) {
                    queue[i] = queue[i + 1];
                }

                tail--;
                return primero; // return la letra extraída
            }
        }
    }
}