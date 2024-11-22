package pkg7.matrices;

import java.util.Scanner;

public class Matrices {
    // Llenar la matriz
    public static int[][] llenarMatriz(int filas, int columnas) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor de la posición [" + i + "][" + j + "]: ");
                String valorscan = sc.nextLine(); // se lee el valor
                matriz[i][j] = Integer.parseInt(valorscan); // se llena la matriz
            }
        }
        return matriz;
    }

    public static int[] crearMatriz() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el numero de columnas: ");
        String columnasscan = sc.nextLine();
        int columnas = Integer.parseInt(columnasscan);

        System.out.print("\nIngrese el numero de filas: ");
        String filasscan = sc.nextLine();
        int filas = Integer.parseInt(filasscan);
        System.out.print("\n");
        // se retorna un arreglo con las filas y columnas
        return new int[] { filas, columnas };
    }

    // Visualizar la matriz
    public static void visualizarMatriz(int[][] matriz) {

        int columnas = matriz[0].length;
        int filas = matriz.length;

        System.out.println("\nLa matriz es: ");
        // solo se visualiza la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*
     * Suma diagonal: escribe un método que tome una matriz cuadrada como entrada y
     * devuelva la suma de los elementos de la diagonal principal
     */
    public static int sumaDiagonal(int[][] matriz) {
        int filas = matriz.length;
        // se usa el minimo entre las filas y las columnas para recorrer la diagonal
        // principal
        int min = Math.min(filas, matriz[0].length);

        int suma = 0;
        for (int i = 0; i < min; i++) {
            // sumar los elementos de la diagonal principal
            suma += matriz[i][i];
        }
        return suma;
    }

    /*
     * Encuentra el máximo: escribe un método que reciba una matriz de entrada y que
     * devuelva el valor
     * más grande de la matriz
     */
    public static int maximoMatriz(int[][] matriz) {

        int columnas = matriz[0].length;
        int filas = matriz.length;

        int max = matriz[0][0];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // si el elemento es mayor que el maximo actual, se actualiza
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }

    /*
     * Suma dos matrices: escribe un método que reciba dos matrices de entrada y
     * devuelva la matriz
     * sumada.
     */
    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {

        int columnas = matriz1[0].length;
        int filas = matriz1.length;

        System.out.println("\nSuma de matrices: ");

        int[][] matrizSuma = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // sumar cada elemento de la matriz
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizSuma;
    }

    /*
     * Multiplicar una matriz por un escalar: Escribe un método que reciba
     * cualquier matriz y un escalar
     * como entradas y devuelve el producto de la matriz por el escalar
     */
    public static int[][] multiplicarMatrizPorEscalar(int[][] matriz) {

        int columnas = matriz[0].length;
        int filas = matriz.length;

        System.out.println("\nVamos a multiplicar la suma de la matriz por un escalar: ");
        System.out.print("Ingrese el escalar: ");

        Scanner sc = new Scanner(System.in);
        String escalarscan = sc.nextLine();
        int escalar = Integer.parseInt(escalarscan);

        int[][] matrizMultiplicada = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // multiplicar cada elemento de la matriz por el escalar
                matrizMultiplicada[i][j] = matriz[i][j] * escalar;
            }
        }
        return matrizMultiplicada;
    }

    /*
     * Escribe un método que multiplique dos matrices y muestre el resultado. Las
     * matrices no necesitan
     * ser cuadradas, pero deben ser compatibles para multiplicarse
     */
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {

        int fil1 = matriz1.length;
        int col1 = matriz1[0].length;
        int fil2 = matriz2.length;
        int col2 = matriz2[0].length;

        // fil1, col1 x fil2, col2 if col1 = fil2 they can be multiplied
        if (col1 != fil2) {
            System.out.println("Las matrices no son compatibles para multiplicarse.");
            return null;
        } else {
            System.out.println("\nMultiplicación de matrices: ");
            // the size of the resulting matrix is fil1, col2
            int[][] matrizMultiplicada = new int[fil1][col2];

            for (int i = 0; i < fil1; i++) { // Itera sobre las filas de la primera matriz
                for (int j = 0; j < col2; j++) { // Itera sobre las columnas de la segunda matriz
                    for (int k = 0; k < col1; k++) { // Itera sobre las columnas de la primera matriz
                        matrizMultiplicada[i][j] += matriz1[i][k] * matriz2[k][j]; // Multiplica y suma
                    }
                }
            }

            return matrizMultiplicada;
        }
    }

    /*
     * Transponer una matriz, escriba un método que tome una matriz como entrada y
     * devuelva la
     * transpuesta de dicha matriz
     */
    public static int[][] transponerMatriz(int[][] matriz) {

        int columnas = matriz[0].length;
        int filas = matriz.length;

        System.out.println("\nTransposición de la matriz: ");

        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }
}
