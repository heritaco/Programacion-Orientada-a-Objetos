// Fibonacci.java
package pkg4.recursividad;

public class Fibonacci {
    public int calculate(int n) {
        if (n <= 1) {
            // Si el número es 0 o 1, regresar el número
            return n;
        } else {
            // Sumar el número anterior con el número anterior al anterior
            return calculate(n - 1) + calculate(n - 2);
        }
    }
}