package myqueue;

public class MyQueue { // Clase MyQueue
    public int MAX; // MAX representa el tamaño del arreglo
    public char[] queue; // queue es el arreglo de caracteres
    public int tail; // tail es el índice de la siguiente posición libre

    // Constructor
    public MyQueue(int tamaño) {
        MAX = tamaño; // MAX representa el tamaño del arreglo
        queue = new char[MAX]; // stack[] es el arreglo del tipo char
        tail = 0; // top es el índice de la posición disponible
    }

    // Actividad 3
    public void insert(char data) {
        if (tail == MAX) {
            System.out.println("Cola llena");
        } else {
            queue[tail] = data; // agrega un elemento
            tail++; // incrementa el valor de top
        }
    }

    // Actividad 2
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

    // Actividad 6
    public static boolean palindromo(char[] palabra) {
        // Creamos dos colas del mismo tamaño que la cadena de entrada
        MyQueue queue1 = new MyQueue(palabra.length);
        MyQueue queue2 = new MyQueue(palabra.length);

        // Insertamos cada carácter en orden original
        for (char c : palabra) {
            queue1.insert(c);
        }

        // Insertamos cada carácter en orden inverso
        for (int i = palabra.length - 1; i >= 0; i--) {
            queue2.insert(palabra[i]);
        }

        // Mientras ambas colas tengan elementos
        while (queue1.tail != 0 && queue2.tail != 0) {
            // Si el próximo elemento no es el mismo, no es palíndromo
            if (queue1.delete() != queue2.delete()) {
                return false;
            }
        }

        // Si hemos comprobado todos los elementos es palíndromo
        return true;
    }
}