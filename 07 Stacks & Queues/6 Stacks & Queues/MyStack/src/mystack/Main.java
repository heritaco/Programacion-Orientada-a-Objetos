package mystack;

public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack(5);
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };

        System.out.println("Llenamos el stack:");
        for (char c : chars) {
            stack.push(c);
        }

        System.out.println("\nVamos eliminando:");
        while (stack.top != 0) {
            System.out.println(stack.pop());
        }

        System.out.println("\nLlenamos el stack de nuevo:");
        for (char c : chars) {
            stack.push(c);
        }

        MyStack stackAlReves = MyStack.alReves(stack);

        System.out.println("\nVamos eliminando stackAlReves:");
        while (stackAlReves.top != 0) {
            System.out.println(stackAlReves.pop());
        }

    }
}