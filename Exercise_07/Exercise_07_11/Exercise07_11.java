

import java.util.Scanner;

public class Exercise07_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 numbers
        double[] array = new double[10];

        // Prompt the user to enter 10 numbers
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextDouble();
        }

        // Display the mean and standard deviation of the entered numbers
        System.out.printf("The mean is %.2f\n", mean(array));
        System.out.printf("The standard deviation is %.5f", deviation(array));

        scanner.close();
    }

    // Method to calculate the standard deviation of an array of numbers
    public static double deviation(double[] x) {
        double total = 0;

        // Calculate the sum of squared differences from the mean
        for (int i = 0; i < x.length; i++) {
            total += Math.pow(x[i] - mean(x), 2.0);
        }

        // Calculate the standard deviation using the formula
        return Math.sqrt(total / ((double) x.length - 1.0));
    }

    // Method to calculate the mean (average) of an array of numbers
    public static double mean(double[] x) {
        double total = 0;

        // Calculate the sum of the numbers in the array
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }

        // Calculate the mean by dividing the total by the number of elements
        return total / (double) x.length;
    }
}
