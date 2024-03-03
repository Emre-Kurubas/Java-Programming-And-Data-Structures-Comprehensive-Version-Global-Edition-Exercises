/*
(Find the number of years) Write a program that prompts the user to enter the 
minutes (e.g., 1 billion), and displays the maximum number of years and remaining days for the minutes.
*/

import java.util.Scanner;

public class Exercise02_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the number of minutes.
		System.out.print("Enter the number of minutes: ");
		int min = scanner.nextInt();

    //Calculate the maximum number of years and remaining days for the minutes.
		int year = min/525600;
		int day= (min%525600)/1440;

    //Display the result.
		System.out.print(min+" is approximately "+ year +" years and "+ day +" days");

    //Close the scanner when we are done.
		scanner.close();
	}
}
