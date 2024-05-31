package pkg5.listas;

import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 2;
        // Assign values to other array elements...

        int firstElement = myArray[0];
        int secondElement = myArray[1];
        // Read values from other array elements...

        System.out.println("First element: " + firstElement);
        System.out.println("Second element: " + secondElement);

        // Enhanced for loop
        for (int element : myArray) {
            System.out.println(element);
        }

        Arrays.fill(myArray, 5); // Fills the entire array with the number 5
        for (int element : myArray) {
            System.out.println(element);
        }

        Arrays.sort(myArray); // Sorts the array in ascending order

        int[] copyOfMyArray = Arrays.copyOf(myArray, myArray.length); // Creates a copy of myArray

        // Search for an element in the array
        int target = 5;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == target) {
                System.out.println("Element found at index " + i);
                break;
            }
        }

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int element : myArray) {
            sum += element;
        }
        System.out.println("Sum: " + sum);

        // Calculate the average of all elements in the array
        double average = (double) sum / myArray.length;
        System.out.println("Average: " + average);

        // Find the minimum and maximum elements in the array
        int min = myArray[0];
        int max = myArray[0];
        for (int element : myArray) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        // Reverse the array
        int[] reversedArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            reversedArray[i] = myArray[myArray.length - 1 - i];
        }
        // Print the reversed array
        for (int element : reversedArray) {
            System.out.println(element);
        }

        // Create a 2D array
        int[][] my2DArray = new int[10][10]; // A 10x10 2D array
        my2DArray[0][0] = 1; // Assigns 1 to the element at row 0, column 0
        // Assign values to other elements...
        // Print the 2D array
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}