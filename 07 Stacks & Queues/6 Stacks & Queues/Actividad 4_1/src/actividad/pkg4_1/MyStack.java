package actividad.pkg4_1;

/* Este método regresa el valor que se extrae de la pila y actualiza top. stack[], top y MAX son 
atributos de la clase MyStack. Max representa el tamaño del arreglo, stack[] es el arreglo del tipo 
char y top es el índice de la posición disponible */

public class MyStack { // Clase MyStack
    private char[] stack; // stack es atributo de MyStack
    private int top; // top es atributo de MyStack
    private int MAX; // max es atributo de MyStack

    // Constructor
    public MyStack(int tamaño) {
        MAX = tamaño; // MAX representa el tamaño del arreglo
        stack = new char[MAX]; // stack[] es el arreglo del tipo char
        top = 0; // top es el índice de la posición disponible
    }

    public void push(char data) {
        if (top == MAX) {
            System.out.println("Stack lleno");
        } else {
            stack[top] = data; // agrega un elemento
            top++; // incrementa el valor de top
        }
    }

    public char pop() {
        if (top == 0) {
            System.out.println("Stack vacío");
            return (' '); // regresa nada cuando es vacio
        } else {
            top--; // decrementa el valor de top
            return stack[top]; // return el elemento que se extrajo
        }
    }
}