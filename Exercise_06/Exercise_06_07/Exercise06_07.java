/*
(Financial application: compute the future investment value) Write a method that 
computes future investment value at a given interest rate for a specified number 
of years. The future investment is determined using the formula in Programming 
Exercise 2.21.
Use the following method header:
public static double futureInvestmentValue(
double investmentAmount, double monthlyInterestRate,int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns 
12833.59.
Write a test program that prompts the user to enter the investment amount (e.g., 
1,000) and the interest rate (e.g., 9%) and prints a table that displays future value 
for the years from 1 to 30,
*/

import java.util.Scanner;

public class Exercise06_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the amount invested and annual interest rate
		System.out.print("The amount invested: ");
		double amount = scanner.nextDouble();
		System.out.print("Annual interest rate: ");
		double interestRate = scanner.nextDouble();
		double monthlyInterestRate= interestRate/1200;//Calculate monthly interest rate

    //Print the header of our table with necessary spacing
		System.out.printf("%-12s%s\n","Years", "Future Value" );

    //Print the future investment value
		for(int i=1; i<=30; i++) {
			System.out.printf("%-12d%.2f\n", i,futureInvestmentValue(amount, monthlyInterestRate, i));
			
		}
    //Close the scanner
		scanner.close();
		
	}

  //Create a futureInvestmentValue method
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		//Calculate the future investment value
		investmentAmount =(investmentAmount*(Math.pow(1.0+monthlyInterestRate, years*12)));
    //Return the result
		return investmentAmount;
	}
}
