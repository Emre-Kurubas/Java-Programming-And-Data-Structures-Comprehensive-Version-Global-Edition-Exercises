/*
(Display calendars) Write a program that prompts the user to enter the year and 
first day of the year and displays the calendar table for the year on the console. For 
example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, 
your program should display the calendar for each month in the year.
*/
import java.util.Scanner;

public class Exercise05_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, etc.): ");
        int weekday = scanner.nextInt();

        String header;
        System.out.println();

        for (int month = 1; month <= 12; month++) {
            header = "";
            // Assign the month name to the header based on the month number
            switch (month) {
                case 1: header += "January "; break;
                case 2: header += "February "; break;
                case 3: header += "March "; break;
                case 4: header += "April "; break;
                case 5: header += "May "; break;
                case 6: header += "June "; break;
                case 7: header += "July "; break;
                case 8: header += "August "; break;
                case 9: header += "September "; break;
                case 10: header += "October "; break;
                case 11: header += "November "; break;
                case 12: header += "December "; break;
            }
            header += year + "";

            // Center align the header
            for (int space = 0; space < 24 - (header.length() / 2); space++) {
                System.out.print(" ");
            }

            System.out.println(header + "\n------------------------------------------------\n "
                    + "Sun    Mon    Tue    Wed    Thu    Fri    Sat");

            weekday %= 7;
            int lastDay = 0;

            // Determine the last day of the current month
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                lastDay += 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                lastDay += 30;
            } else {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    lastDay += 29;
                } else {
                    lastDay += 28;
                }
            }

            // Print leading spaces based on the weekday of the first day
            for (int b = 0; b <= weekday * 7; b++) {
                System.out.print(" ");
            }

            // Print the days of the month
            for (int day = 1; day <= lastDay; day++) {
                if (day < 10) {
                    System.out.print(" ");
                }
                // Check if it's the end of the week
                if (weekday % 7 == 6)
                    System.out.print(day + "\n ");
                else {
                    System.out.print(day + "     ");
                    // Check if it's the last day of the month
                    if (day == lastDay)
                        System.out.println();
                }
                weekday++;
            }
            System.out.println();
        }
      //Close the scanner
        scanner.close();
    }
}
