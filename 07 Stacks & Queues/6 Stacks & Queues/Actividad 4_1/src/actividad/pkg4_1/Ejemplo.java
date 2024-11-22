package actividad.pkg4_1;

public class Ejemplo {
    public static void main(String[] args) {

        MyStack stack = new MyStack(5);
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};

        System.out.println("Llenamos el stack:");
        for (char c : chars) {
            stack.push(c);
        }

        System.out.println("\nVaciamos el stack:");
        for (char c : chars) {
            System.out.println(stack.pop());
        }
    }
}