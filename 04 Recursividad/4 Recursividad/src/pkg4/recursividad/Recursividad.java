package pkg4.recursividad;

import java.util.Scanner;

public class Recursividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        String numberscan = sc.nextLine();
        int number = Integer.parseInt(numberscan);

        Factorial factorial = new Factorial();
        System.out.println("El factorial de " + number + " es: " + factorial.calculate(number));

        Fibonacci fibonacci = new Fibonacci();
        System.out.println("El fibonacci de " + number + " es: " + fibonacci.calculate(number));
    }
}