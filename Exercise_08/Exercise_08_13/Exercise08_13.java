/*********************************************************************************
* (Locate the largest element) Write the following method that returns the       *
* location of the largest element in a two-dimensional array.                    *
*                                                                                *
* public static int[] locateLargest(double[][] a)                                *
*                                                                                *
* The return value is a one-dimensional array that contains two elements. These  *
* two elements indicate the row and column indices of the largest element in the *
* two-dimensional array. Write a test program that prompts the user to enter a   *
* two-dimensional array and displays the location of the largest element in the  *
* array.                                                                         *
*********************************************************************************/
import java.util.Scanner;

public class Exercise08_13 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables to store the number of rows and columns
        int row = 0, column = 0;
        
        // Prompt the user to enter the number of rows and columns for the array
        System.out.print("Enter the rows and columns of the array: ");
        // Loop to read the number of rows and columns
        for (int i = 0; i < 2; i++) {
            if (i == 0)
                row = scanner.nextInt();
            else
                column = scanner.nextInt();
        }
        
        // Create a 2D array with the specified number of rows and columns
        double[][] matrix = new double[row][column];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the array: ");
        // Loop to read the elements of the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
            // Move to the next line after reading each row
            System.out.println();
        }
        
        // Call the locateLargest method to find the location of the largest element
        int[] largest = locateLargest(matrix);
        
        // Display the location of the largest element
        System.out.print("The location of the largest element is at (" + largest[0] + ", " + largest[1] + ")");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to locate the largest element in a 2D array and return its location
    public static int[] locateLargest(double[][] matrix) {
        // Initialize variables to store the largest element and its location
        double largest = matrix[0][0];
        int[] location = {0, 0};

        // Loop through each element of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Check if the current element is larger than the current largest element
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                    // Update the location of the largest element
                    location[0] = i;
                    location[1] = j;
                } else if (matrix[i][j] == largest) {
                    // If there are multiple occurrences of the largest element,
                    // update the location only if the current location is "smaller"
                    if (i < location[0] || (i == location[0] && j < location[1])) {
                        location[0] = i;
                        location[1] = j;
                    }
                }
            }
        }

        // Return the location of the largest element
        return location;
    }
}
