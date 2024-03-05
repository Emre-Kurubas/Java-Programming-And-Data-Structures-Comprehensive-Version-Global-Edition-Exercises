/*
(The number of even numbers and odd numbers) Write a program that reads ten inte-
gers, and then display the number of even numbers and odd numbers. Assume that 
the input ends with 0.
*/

import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];
        int number;

        // Prompt the user to enter numbers
        System.out.print("Enter numbers: ");
        
        // Collect user input until 0 is entered or 100 numbers are collected
        for (int i = 0; i < 100; i++) {
            number = scanner.nextInt();

            // Break the loop if 0 is entered
            if (number == 0) {
                break;
            } else {
                arr[i] = number;
            }
        }

        // Display the count of odd and even numbers
        System.out.println("The number of odd numbers: " + numberOfOdd(arr));
        System.out.println("The number of even numbers: " + numberOfEven(arr));

        scanner.close();
    }

    // Method to count the number of odd numbers in the array
    public static int numberOfOdd(int[] arr) {
        int numberOfOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                numberOfOdd++;
            }
        }

        return numberOfOdd;
    }

    // Method to count the number of even numbers in the array
    public static int numberOfEven(int[] arr) {
        int numberOfEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                numberOfEven++;
            }
        }

        return numberOfEven;
    }
}
