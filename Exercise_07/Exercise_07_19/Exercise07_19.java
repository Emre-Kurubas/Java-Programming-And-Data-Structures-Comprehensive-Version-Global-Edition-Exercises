/*
 (Sorted?) Write the following method that returns true if the list is already  
 sorted in increasing order.                                                    
                                                                                
 public static boolean isSorted(int[] list)                                     
                                                                               
 Write a test program that prompts the user to enter a list and displays        
 whether the list is sorted or not. Here is a sample run. Note that the first   
 number in the input indicates the number of the elements in the list. This     
 number is not part of the list.  
*/

import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store up to 100 integers
        int[] list = new int[100];

        System.out.print("Enter list of integers: ");
        list[0] = scanner.nextInt();
        int i = 1;

        // Check if there is a next line (if it's empty, do nothing)
        if (scanner.hasNextLine()) {
            // Do nothing for now
        } else {
            // Collect integers until the next line is encountered or the array is full
            while (scanner.hasNextInt()) {
                list[i] = scanner.nextInt();
                i++;

                // If a next line is encountered, exit the loop
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                    break;
                }
            }
        }

        // Calculate the size of the array by counting non-zero elements
        int size = 100;
        for (int j = 0; j < 100; j++) {
            if (list[j] == 0) {
                size--;
            }
        }

        // Create a new array with the correct size and copy non-zero elements
        int[] realList = new int[size];
        for (int j = 0, k = 0; j < 100; j++) {
            if (list[j] != 0) {
                realList[k++] = list[j];
            }
        }

        // Check if the array is sorted and display the result
        System.out.println(
                "The list is " + (isSorted(realList) ? "already " : "not ") + "sorted");

        scanner.close();
    }

    // Method to check if an array is sorted in non-decreasing order
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
