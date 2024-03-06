/*********************************************************************************
* (Markov matrix) An n * n matrix is called a positive Markov matrix if each     *
* element is positive and the sum of the elements in each column is 1. Write the *
* following method to check whether a matrix is a Markov matrix.                 *
*                                                                                *
* public static boolean isMarkovMatrix(double[][] m)                             *
*                                                                                *
* Write a test program that prompts the user to enter a 3 * 3 matrix of double   *
* values and tests whether it is a Markov matrix.                                *
*********************************************************************************/
import java.util.Scanner;

public class Exercise08_25 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a 3x3 matrix to store user input
        double[][] matrix = new double[3][3];
        
        // Prompt the user to enter a 3x3 matrix row by row
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        // Loop to read each row of the matrix
        for (int i = 0; i < 3; i++) {
            // Loop to read each element in the current row
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
            // Move to the next line after reading each row
            System.out.println();
        }
        
        // Check if the matrix is a Markov matrix and display the result
        System.out.print("It " + (isMarkovMatrix(matrix) ? "is" : "is not") + " a Markov matrix");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to check if a matrix is a Markov matrix
    public static boolean isMarkovMatrix(double[][] matrix) {
        // Initialize a boolean variable to store the result
        boolean isMarkov = true;
        
        // Check if all elements of the matrix are non-negative
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    isMarkov = false;
                    // If any element is negative, the matrix cannot be a Markov matrix
                    // No need to continue checking, so return false immediately
                    return isMarkov;
                }
            }
        }
        
        // Calculate the sum of each column and check if they all equal 1
        double sumOfColumn = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumOfColumn += matrix[j][i];
            }
            // If the sum of any column is not equal to 1, the matrix is not a Markov matrix
            if (sumOfColumn != 1) {
                isMarkov = false;
                // No need to continue checking, so return false immediately
                return isMarkov;
            }
            // Reset the sum for the next column
            sumOfColumn = 0;
        }
        
        // If the matrix passes both checks, it is a Markov matrix
        return isMarkov;
    }
}
