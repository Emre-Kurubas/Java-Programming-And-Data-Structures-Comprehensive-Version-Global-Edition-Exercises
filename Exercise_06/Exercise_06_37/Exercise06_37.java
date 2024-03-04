/*
(Format an integer) Write a method with the following header to format the inte-ger with the specified width.
public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s. The size 
of the string is the width. For example, format(34, 4) returns 0034 and for-mat(34, 5) returns 00034. If the number is longer than the width, the method 
returns the string representation for the number. For example, format(34, 1)
returns 34.
Write a test program that prompts the user to enter a number and its width, and 
displays a string returned by invoking format(number, width).
*/

import java.util.Scanner;

public class Exercise06_37 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    //Prompt the user to enter a number and the width
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		System.out.print("Enter the width: ");
		int width= scanner.nextInt();
    //Print out the result by calling the format method
		System.out.print(""+format(number, width));
    //Close the scanner
		scanner.close();
	}

  //Create a method called format 
 public static String format(int number, int width) {
        // Convert the number to a string for easier manipulation
        String numberStr = "" + number;

        // Loop to add leading zeros to meet the specified width
        for (int i = 0; i <= width - 3; i++) {
            numberStr = "0" + numberStr;
        }

        // Return the formatted number as a string
        return numberStr;
    }
}
