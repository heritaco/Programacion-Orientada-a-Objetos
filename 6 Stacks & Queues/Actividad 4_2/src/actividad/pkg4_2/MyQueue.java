package actividad.pkg4_2;

/* MAX representa el tamaño del arreglo, queue[] es el arreglo de caracteres y tail el índice de la
siguiente posición libre. El método debe extraer la letra al inicio de la cola y mover el resto de los
elementos una posición hacia al frente de la misma. Al final el método actualiza el índice y devuelve
la letra extraída. Si queue está vacío, el método debe devolver el símbolo de "#" para indicar que no
hay elemento disponible */

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
}