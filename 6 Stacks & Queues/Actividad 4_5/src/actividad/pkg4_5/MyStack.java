package actividad.pkg4_5;

// NO FUNCIONA

/* Escribe un método que tome una cadena como entrada y la invierta
utilizando el stack */

public class MyStack { 
    private char[] stack;
    private int top;
    public int MAX; 
    public char[] stackalreves; // stackalreves es atributo de MyStack
    public char alreves; // alreves es atributo de MyStack

    // Constructor
    public MyStack(int tamaño) {
        MAX = tamaño; 
        stack = new char[MAX]; 
        top = 0; 
    }

    public void push(char data) {
        if (top == MAX) {
            System.out.println("Stack lleno");
        } else {
            stack[top] = data;
            top++; 
        }
    }

    public char pop() {
        if (top == 0) {
            System.out.println("Stack vacío");
            return (' '); 
        } else {
            top--; 
            return stack[top]; 
        }
    }

    public static void main(String[] data) {
        MyStack stack = new MyStack(5);
        for (char c : new char[]{'h', 'e', 'l', 'l', 'o'}) stack.push(c);
        MyStack stackalreves = alreves(stack);
        for (int i = 0; i < stack.MAX; i++) {
            System.out.print(stack.pop());
        }
        
        for (int i = 0; i < stack.MAX; i++) {
            System.out.print(stackalreves.pop());
        }
    }

    public static MyStack alreves(MyStack stack) {
        MyStack stackalreves = new MyStack(stack.MAX);
        for (int i = 0; i < stack.MAX; i++) {
            stackalreves.push(stack.pop());
        }
        return stackalreves;
    }
}