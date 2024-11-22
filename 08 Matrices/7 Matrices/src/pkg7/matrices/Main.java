package pkg7.matrices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int opcion = menu(sc);
            switch (opcion) {
                case 1:
                    int[] filasColumnas = Matrices.crearMatriz();
                    int[][] matriz = Matrices.llenarMatriz(filasColumnas[0], filasColumnas[1]);
                    Matrices.visualizarMatriz(matriz);
                    break;
                case 2:
                    int[] filasColumnas2 = Matrices.crearMatriz();
                    int[][] matriz2 = Matrices.llenarMatriz(filasColumnas2[0], filasColumnas2[1]);
                    Matrices.visualizarMatriz(matriz2);
                    System.out.println("\nLa suma de la diagonal es: " + Matrices.sumaDiagonal(matriz2));
                    break;
                case 3:
                    int[] filasColumnas3 = Matrices.crearMatriz();
                    int[][] matriz3 = Matrices.llenarMatriz(filasColumnas3[0], filasColumnas3[1]);
                    Matrices.visualizarMatriz(matriz3);
                    System.out.println("\nEl valor máximo de la matriz es: " + Matrices.maximoMatriz(matriz3));
                    break;
                case 4:
                    System.out.println("\nVamos a sumar dos matrices, el tamaño va a ser el mismo ");
                    int[] filasColumnas4 = Matrices.crearMatriz();
                    System.out.println("Primera matriz:\n");
                    int[][] matriz4 = Matrices.llenarMatriz(filasColumnas4[0], filasColumnas4[1]);
                    System.out.println("\nSegunda matriz:\n");
                    int[][] matriz5 = Matrices.llenarMatriz(filasColumnas4[0], filasColumnas4[1]);
                    int[][] matrizSuma = Matrices.sumaMatrices(matriz4, matriz5);
                    Matrices.visualizarMatriz(matrizSuma);
                    break;
                case 5:
                    int[] filasColumnas6 = Matrices.crearMatriz();
                    matriz = Matrices.llenarMatriz(filasColumnas6[0], filasColumnas6[1]);
                    int[][] matrizEscalar = Matrices.multiplicarMatrizPorEscalar(matriz);
                    Matrices.visualizarMatriz(matrizEscalar);
                    break;
                case 6:
                    System.out.println("\nPrimea matriz:");
                    int[] filasColumnas7 = Matrices.crearMatriz();
                    System.out.println("Segunda matriz:");
                    int[] filasColumnas8 = Matrices.crearMatriz();
                    System.out.println("Primera matriz:\n");
                    int[][] matriz7 = Matrices.llenarMatriz(filasColumnas7[0], filasColumnas7[1]);
                    System.out.println("\nSegunda matriz:\n");
                    int[][] matriz8 = Matrices.llenarMatriz(filasColumnas8[0], filasColumnas8[1]);
                    int[][] matrizMultiplicada = Matrices.multiplicarMatrices(matriz7, matriz8);
                    Matrices.visualizarMatriz(matrizMultiplicada);
                    break;
                case 7:
                    filasColumnas = Matrices.crearMatriz();
                    matriz = Matrices.llenarMatriz(filasColumnas[0], filasColumnas[1]);
                    int[][] matrizTranspuesta = Matrices.transponerMatriz(matriz);
                    Matrices.visualizarMatriz(matrizTranspuesta);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("??");
            }
        }

    }

    public static int menu(Scanner sc) {
        System.out.println("\n1. Llenar y mostrar una matriz");
        System.out.println("2. Sumar la diagonal de una matriz");
        System.out.println("3. Encontrar el valor máximo en una matriz");
        System.out.println("4. Sumar dos matrices");
        System.out.println("5. Multiplicar una matriz por un escalar");
        System.out.println("6. Multiplicar dos matrices");
        System.out.println("7. Transponer una matriz");
        System.out.println("0. Salir");
        System.out.print("\n¿Que escoges? ");
        return Integer.parseInt(sc.nextLine());
    }
}
