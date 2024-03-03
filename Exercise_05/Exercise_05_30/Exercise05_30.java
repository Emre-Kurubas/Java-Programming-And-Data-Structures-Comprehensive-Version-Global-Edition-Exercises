/*
(Financial application: compound value) Suppose you save $100 each month 
in a savings account with annual interest rate 3.75%. The monthly interest rate 
is 0.0375 / 12 = 0.003125. After the first month, the value in the account 
becomes
100 * (1 + 0.003125) = 100.3125
After the second month, the value in the account becomes
(100 + 100.3125) * (1 + 0.003125) = 200.938
After the third month, the value in the account becomes
(100 + 200.938) * (1 + 0.003125) = 301.878
and so on.
Write a program that prompts the user to enter an amount (e.g., 100), the annual 
interest rate (e.g., 3.75), and the number of months (e.g., 6) and displays the 
amount in the savings account after the given month.
*/

import java.util.Scanner;

public class Exercise05_30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the saving amount, interest rate and the number of months
		System.out.print("Enter the saving amount: ");
		double saving=scanner.nextInt();
		System.out.print("Enter the annual interest rate: ");
		double interestRate=scanner.nextDouble();
		System.out.print("Enter the number of months: ");
		int month=scanner.nextInt();
    
		double accountValue=0;
		double annualInterest=0, monthlyInterest=interestRate/1200;
    //Calculate the account value per month
		for(int i=1; i<=month; i++) {
			annualInterest=(saving+annualInterest)*((1.0)+monthlyInterest);
			accountValue=annualInterest;
			System.out.printf("New saving: %.4f\n",accountValue);
		}
    //Close the scanner
    scanner.close();
	}
}
