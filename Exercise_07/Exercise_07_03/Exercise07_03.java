/*
(Count occurrence of numbers) Write a program that reads the integers between 1 
and 50 and counts the occurrences of each. Assume the input ends with 0.
*/

import java.util.Scanner;

public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        int[] userInputArray = new int[1000];

        // Get integers from 1 to 50 and end the input when 0 is entered
        int number = scanner.nextInt();
        userInputArray[0] = number;
        int i = 1;

        // Collect input until 0 is entered
        do {
            number = scanner.nextInt();
            userInputArray[i] = number;
            i++;
        } while (number != 0);

        // Calculate the actual size of the array (excluding trailing zeros)
        for (int j = 0; j < userInputArray.length; j++) {
            if (userInputArray[j] != 0) {
                size++;
            }
        }

        // Create a new array with the correct size and copy elements
        int[] arr = new int[size];
        for (int j = 0; j < size; j++) {
            arr[j] = userInputArray[j];
        }

        // Arrange the array in ascending order
        arrange(arr);

        // Print the occurrences of each number
        System.out.print(occurrances(arr));

        scanner.close();
    }

    // Method to count occurrences of each number in the array
    public static String occurrances(int[] arr) {
        int occurrence;
        String occurrenceOf = "";

        for (int j = 0; j < arr.length; j++) {
            // Check if the number has already been included in the result
            if (!occurrenceOf.contains(arr[j] + "")) {
                occurrence = 0;

                // Count occurrences of the current number in the array
                for (int k = 0; k < arr.length; k++) {
                    if (arr[j] == arr[k]) {
                        occurrence++;
                    }
                }

                // Build the result string
                occurrenceOf += "" + arr[j] + " occurs " + occurrence + " times.\n";
            }
        }

        return occurrenceOf;
    }

    // Method to arrange the array in ascending order using Bubble Sort
    public static int[] arrange(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
