/*
(Science: day of the week) Zeller’s congruence is an algorithm developed by 
Christian Zeller to calculate the day of the week.
Write a program that prompts the user to enter a year,month, 
and day of the month, and displays the name of the day of the week.
*/

import java.util.Scanner;

public class Exercise03_21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the necessary information
		System.out.print("Enter year: (e.g., 2012): ");
		int year = scanner.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month = scanner.nextInt();
		System.out.print("Enter the day of the month : 1-31: ");
		int day = scanner.nextInt();
    //Use Christian Zeller's algorithm to calculate the day of the week
		if (month==1 || month==2) {
			month+=12;
			year--;
		}
		int dayOfTheWeek = (day + ((26*(month+1))/10) + year%100 + (year%100)/4 + year/400 + year/20)%7;

    //Display the result depending on the dayOfTheWeek variable
		switch (dayOfTheWeek) {
			case (0) : System.out.print("Day of the week is Saturday");
			break;
			case (1) : System.out.print("Day of the week is Sunday");
			break;
			case (2) : System.out.print("Day of the week is Monday");
			break;
			case (3) : System.out.print("Day of the week is Tuesday");
			break;
			case (4) : System.out.print("Day of the week is Wednesday");
			break;
			case (5) : System.out.print("Day of the week is Thursday");
			break;
			case (6) : System.out.print("Day of the week is Friday");
			break;
		}

    //Close the scanner
		scanner.close();
	}
}
