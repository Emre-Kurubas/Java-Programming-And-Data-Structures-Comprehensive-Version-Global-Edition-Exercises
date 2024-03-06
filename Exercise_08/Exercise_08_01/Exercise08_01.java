/*
(Sum elements row by row) Write a method that returns the sum of all the ele-
ments in a specified row in a matrix using the following header:
public static double sumRow(double[][] m, int rowIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each row. 
*/

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a 3x4 matrix to store user input
        double[][] matrix = new double[3][4];
        
        // Prompt the user to enter a 3x4 matrix row by row
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        
        // Loop through each row
        for(int i = 0; i < 3; i++) {
            // Loop through each column in the current row
            for(int j = 0; j < 4; j++) {
                // Read a double value from the user and store it in the matrix
                matrix[i][j] = scanner.nextDouble();
            }
            // Move to the next line after reading each row
            System.out.println();
        }
        
        // Calculate and display the sum of each row
        for(int i = 0; i < 3; i++) {
            System.out.println("Sum of all the elements at row " + i + " is " + sumRow(matrix, i));
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
    
    // Method to calculate the sum of elements in a given row of the matrix
    public static double sumRow(double[][] matrix, int row) {
        double sum = 0;
        // Loop through each column in the specified row
        for(int j = 0; j < matrix[row].length; j++) {
            // Add the value of each element to the sum
            sum += matrix[row][j];
        }
        // Return the total sum of elements in the row
        return sum;
    }
}
