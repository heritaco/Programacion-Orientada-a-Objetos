package pkg5.listas;

import java.util.Arrays;

public class ListasMetodos {
    public static void main(String[] args) {
        int[] myArray = initializeArray();
        printArray(myArray);

        fillArray(myArray, 5);
        printArray(myArray);

        sortArray(myArray);

        int[] copyOfMyArray = copyArray(myArray);

        searchElement(myArray, 5);

        calculateSum(myArray);

        calculateAverage(myArray);

        findMinMax(myArray);

        int[] reversedArray = reverseArray(myArray);
        printArray(reversedArray);

        int[][] my2DArray = initialize2DArray();
        print2DArray(my2DArray);
    }

    private static int[] initializeArray() {
        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 2;
        // Assign values to other array elements...
        return myArray;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    private static void fillArray(int[] array, int value) {
        Arrays.fill(array, value);
    }

    private static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    private static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    private static void searchElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element found at index " + i);
                break;
            }
        }
    }

    private static void calculateSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        System.out.println("Sum: " + sum);
    }

    private static void calculateAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        double average = (double) sum / array.length;
        System.out.println("Average: " + average);
    }

    private static void findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    private static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    private static int[][] initialize2DArray() {
        int[][] my2DArray = new int[10][10]; // A 10x10 2D array
        my2DArray[0][0] = 1; // Assigns 1 to the element at row 0, column 0
        // Assign values to other elements...
        return my2DArray;
    }

    private static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}