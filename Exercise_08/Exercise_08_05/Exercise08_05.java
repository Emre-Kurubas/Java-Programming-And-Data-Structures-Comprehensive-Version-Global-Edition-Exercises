/*
* (Algebra: add two matrices) Write a method to add two matrices. The header of  *
* the method is as follows:                                                      *
*                                                                                *
* public static double[][] addMatrix(double[][] a, double[][] b)                 *
*                                                                                *
* In order to be added, the two matrices must have the same dimensions and the   *
* same or compatible types of elements. Let c be the resulting matrix. Each      *
* element cij is aij + bij.                                                      *
* Write a test program that prompts the user to enter two 3 * 3 matrices and     *
* displays their sum.          
*/
import java.util.Scanner;

public class Exercise08_05 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create two 3x3 matrices to store user input
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        
        // Prompt the user to enter values for matrix1
        System.out.print("Enter matrix1: ");
        // Loop through each row and column of matrix1 to get user input
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }
        
        // Prompt the user to enter values for matrix2
        System.out.print("Enter matrix2: ");
        // Loop through each row and column of matrix2 to get user input
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }
        
        // Call the addMatrix method to add matrix1 and matrix2
        double[][] addedMatrix = addMatrix(matrix1, matrix2);
        
        // Display the matrices and their sum
        System.out.println("The matrices are added as follows: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 1; j++) {
                // Print the elements of matrix1, matrix2, and their sum
                if(i == 2) {
                    System.out.print("" + matrix1[i][j] + " " + matrix1[i][j + 1] + " " + matrix1[i][j + 2] + "  +  "
                            + matrix2[i][j] + " " + matrix2[i][j + 1] + " " + matrix2[i][j + 2] + "  =  "
                            + addedMatrix[i][j] + " " + addedMatrix[i][j + 1] + " " + addedMatrix[i][j + 2]);
                } else
                    System.out.print("" + matrix1[i][j] + " " + matrix1[i][j + 1] + " " + matrix1[i][j + 2] + "     "
                            + matrix2[i][j] + " " + matrix2[i][j + 1] + " " + matrix2[i][j + 2] + "     "
                            + addedMatrix[i][j] + " " + addedMatrix[i][j + 1] + " " + addedMatrix[i][j + 2]);
            }
            System.out.print("\n");
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
    
    // Method to add two matrices
    public static double[][] addMatrix(double[][] matrix1, double[][] matrix2){
        // Create a new matrix to store the sum
        double[][] addedMatrix = new double[3][3];
        
        // Loop through each element of matrix1 and matrix2 and add them
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                addedMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Return the sum matrix
        return addedMatrix;
    }
}
