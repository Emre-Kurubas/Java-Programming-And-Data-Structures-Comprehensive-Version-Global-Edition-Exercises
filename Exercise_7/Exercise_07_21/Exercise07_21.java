/*
(Normalizing integers) Write a program that prompts the user to enter 10 integers, 
and normalizes the integers to be in the range of 0 to 1 by dividing every integer 
with the largest integer. Display the 10 normalized real-valued numbers.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Exercise07_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 integers
        int[] intList = new int[10];

        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            intList[i] = scanner.nextInt();
        }

        // Display the normalized array
        System.out.print(Arrays.toString(normalizer(intList)));

        scanner.close();
    }

    // Method to normalize an array of integers
    public static double[] normalizer(int[] list) {
        // Find the largest element in the array
        double largest = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > largest)
                largest = list[i];
        }

        // Create a new array to store normalized values
        double[] normalizedList = new double[list.length];

        // Normalize each element in the array by dividing it by the largest element
        for (int i = 0; i < list.length; i++) {
            normalizedList[i] = (double) list[i] / largest;
        }

        return normalizedList;
    }
}
