package mystack;

public class MyStack { // Clase MyStack
    public char[] stack; // stack es atributo de MyStack
    public int top; // top es atributo de MyStack
    public int MAX; // max es atributo de MyStack

    // Constructor
    public MyStack(int tamaño) {
        MAX = tamaño; // MAX representa el tamaño del arreglo
        stack = new char[MAX]; // stack[] es el arreglo del tipo char
        top = 0; // top es el índice de la posición disponible
    }

    // Actividad 4
    public void push(char data) {
        if (top == MAX) {
            System.out.println("Stack lleno");
        } else {
            stack[top] = data; // agrega un elemento
            top++; // incrementa el valor de top
        }
    }

    // Actividad 1
    public char pop() {
        if (top == 0) {
            System.out.println("Stack vacío");
            return (' '); // regresa nada cuando es vacio
        } else {
            top--; // decrementa el valor de top
            return stack[top]; // return el elemento que se extrajo
        }
    }

    // Actividad 5
    public static MyStack alReves(MyStack stack) {
        // Creamos un stack con el mismo tamaño que el original
        MyStack stackalreves = new MyStack(stack.top);

        // Guardamos el valor inicial de 'top' en la variable 'toopp' porque 'top'
        // cambia al recorrer la pila
        int toopp = stack.top;

        for (int i = 0; i < toopp; i++) {
            // Extraemos (pop) cada elemento de la pila original y lo insertamos (push) en
            // la nueva pila (es un stack)
            stackalreves.push(stack.pop());
        }
        return stackalreves;
    }
}
