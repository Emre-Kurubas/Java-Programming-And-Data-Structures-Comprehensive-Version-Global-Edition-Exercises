/*
(Financial application: calculate future investment value) Write a program that 
reads in investment amount, annual interest rate, and number of years and displays the future investment value.
*/

import java.util.Scanner;

public class Exercise02_21 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the investment amount
        System.out.print("Enter investment amount: ");
        double amountOfInvestment = scanner.nextDouble();

        // Prompt the user to enter the annual interest rate in percentage
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterest = scanner.nextDouble();
        //Convert the annual interest rate to a decimal
        annualInterest /= 1200;

        // Prompt the user to enter the number of years
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Calculate the future investment value using the formula
        double futureInvestmentValue = amountOfInvestment * Math.pow((1 + annualInterest), years * 12);

        // Display the future investment value to the user
        System.out.print("Future value is $" + futureInvestmentValue);

        // Close the Scanner to release system resources
        scanner.close();
    }
}

