package pkg8.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        // Se pueden modificar estos valores
        int numNumerosAleatorios = 3;
        int tope = 10;
        int min = 0;

        int numNumerosAleatoriosCien = 7;

        int numNumerosAleatoriosPares = 10;
        int topepar = 10;
        int minpar = 0;

        int numDados = 20;

        int[] ListaRandom = generarNumerosAleatorio(numNumerosAleatorios, min, tope);

        System.out.print("Los números aleatorios son: ");
        for (int num : ListaRandom) {
            System.out.print(num + ", ");
        }

        // actividad 1
        int suma = sumarNumerosAleatorios(ListaRandom);
        System.out.println("\nLa suma de los números aleatorios es: " + suma);

        // actividad 2
        int[] ListaRandomCien = generarNumerosAleatorio(numNumerosAleatoriosCien, -100, 100);
        System.out.print("\nLos números aleatorios de -100 a 100 son: ");
        for (int num : ListaRandomCien) {
            System.out.print(num + ",");
        }

        // actividad 3
        int[] ListaRandomPares = generarNumerosAleatoriosPares(numNumerosAleatoriosPares, minpar, topepar);
        System.out.print("\n\nLos números aleatorios pares son: ");
        for (int num : ListaRandomPares) {
            System.out.print(num + ",");
        }

        int[] ListaDados = generarNumerosAleatorio(numDados, 1, 6);
        System.out.print("\n\nLos números aleatorios de los dados son: ");
        for (int num : ListaDados) {
            System.out.print(num + ",");
        }

        // actividad 4
        int[] counts = dados(ListaDados);
        System.out.println("\nLas veces que aparecieron los números de los dados fueron: ");
        for (int i = 1; i < 7; i++) {
            System.out.println(i + ": " + counts[i]);
        }

    }

    public static int[] generarNumerosAleatorio(int numNumerosAleatorios, int min, int tope) {
        // declaramos un objeto de la clase Random
        Random random = new Random();
        // declaramos un arreglo de enteros de tamaño numNumerosAleatorios
        int[] randomnums = new int[numNumerosAleatorios];
        // para cada número en la lista de números aleatorios
        for (int i = 0; i < numNumerosAleatorios; i++) {
            // 100 - (-100) + 1 = 201 + ( -100) = 101
            // 1 - -1 + 1 = 3 + -1 = 2
            randomnums[i] = random.nextInt((tope - min) + 1) + min;
        }

        return randomnums;
    }

    public static int sumarNumerosAleatorios(int[] randomnums) {
        // declaramos la variable sum en 0
        int sum = 0;
        // para cada número en la lista de números aleatorios
        for (int num : randomnums) {
            // sumamos el número a la suma
            sum += num;
        }
        return sum;
    }

    public static int[] generarNumerosAleatoriosPares(int numNumerosAleatorios, int min, int tope) {
        // dividimos los limites entre 2 y lo generamos
        int[] randomnums = generarNumerosAleatorio(numNumerosAleatorios, min / 2, tope / 2);

        int[] randompares = new int[numNumerosAleatorios];

        int i = 0;
        // para cada número en la lista de números aleatorios
        for (int num : randomnums) {
            // agarraos el numero i de la lista de números aleatorios
            randompares[i++] = num * 2; // multiplicamos por 2 para que sea par
        }
        return randompares;
    }

    public static int[] dados(int[] ListaDados) {

        int[] counts = new int[7]; // 0 no se usa
        // para cada número en la lista de dados, incrementar el contador
        for (int num : ListaDados) {
            counts[num]++;
        }
        // regresar el arreglo de contadores
        return counts;
    }

}