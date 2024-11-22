package examen.parcial.pkg1;

public class Extra {
    // la clase Extra debe tener un método que se llama crearFizzBuzz()
    public void crearFizzBuzz(int numero) {
        for (int i=1; i <= numero; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}