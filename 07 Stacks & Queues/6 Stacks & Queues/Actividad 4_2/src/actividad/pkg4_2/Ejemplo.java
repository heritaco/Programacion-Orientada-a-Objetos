package actividad.pkg4_2;

public class Ejemplo {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue(5);
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};

        System.out.println("Llenamos la cola:");
        for (char c : chars) {
            queue.insert(c);
        }

        System.out.println("\nVaciamos la cola:");
        for (char c : chars) {
            System.out.println(queue.delete());
        }
    } 
}
