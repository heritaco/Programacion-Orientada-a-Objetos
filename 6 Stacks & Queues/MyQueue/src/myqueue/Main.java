package myqueue;

public class Main {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue(5);
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };

        System.out.println("Llenamos la cola:");
        for (char c : chars) {
            queue.insert(c);
        }

        System.out.println("\nVaciamos la cola:");
        for (char c : chars) {
            System.out.println(queue.delete());
        }

        System.out.println("\nProbamos palíndromos:");
        char[] ana = { 'a', 'n', 'a' };
        System.out.println(MyQueue.palindromo(ana)); // true

        char[] hola = { 'h', 'o', 'l', 'a' };
        System.out.println(MyQueue.palindromo(hola)); // false
    }

}