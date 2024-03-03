/*
(Occurrence of max numbers) Write a program that reads integers, finds the larg-est of them, and counts its occurrences. Assume the input ends with number 0. 
Suppose you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and 
the occurrence count for 5 is 4. If no input is entered, display "No numbers are 
entered except 0".
 (Hint: Maintain two variables, max and count. max stores the current max 
number and count stores its occurrences. Initially, assign the first number to 
max and 1 to count. Compare each subsequent number with max. If the num-ber is greater than max, assign it to max and reset count to 1. If the number is 
equal to max, increment count by 1.)
*/

import java.util.Scanner;

public class Exercise05_41 {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store user input, the largest number, and its occurrence count
        int num;
        int largest = 0, occurrence = 0;

        // Prompt the user to enter numbers until 0 is entered
        System.out.print("Enter numbers: ");
        num = scanner.nextInt();

        // Check if the first number is 0
        if (num == 0)
            System.out.print("No numbers are entered except 0");
        
        // Loop to handle user input until 0 is entered
        while (num != 0) {
            // Check if the current number is greater than the current largest number
            if (num > largest) {
                largest = num;
                occurrence = 1; // Reset occurrence count to 1 for the new largest number
            } else if (num == largest) {
                occurrence++; // Increment occurrence count if the number is equal to the current largest
            }

            // Prompt the user for the next number
            System.out.print("Enter numbers: ");
            num = scanner.nextInt();
        }

        // Close the Scanner object to prevent resource leaks
        scanner.close();

        // Display the results - largest number and its occurrence count
        System.out.print("The largest number is " + largest + "\nThe occurrence count of the largest number is " + occurrence);
    }
}
