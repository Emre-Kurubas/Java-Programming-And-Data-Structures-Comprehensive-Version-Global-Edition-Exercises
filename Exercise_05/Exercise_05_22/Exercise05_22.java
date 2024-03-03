/*
(Financial application: loan amortization schedule) The monthly payment for a given 
loan pays the principal and the interest. The monthly interest is computed by multiply-
ing the monthly interest rate and the balance (the remaining principal). The principal 
paid for the month is therefore the monthly payment minus the monthly interest. Write 
a program that lets the user enter the loan amount, number of years, and interest rate 
then displays the amortization schedule for the loan. 
*/

import java.util.Scanner;

public class Exercise05_22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Prompt the user to enter loan amount, number of years and annual interest rate
		System.out.print("Loan Amount: ");
		int loanAmount = scanner.nextInt();
		System.out.print("Number of Years: ");
		int years= scanner.nextInt();
		System.out.print("Annual Interest Rate: ");
		int interestRate= scanner.nextInt();

    //Calculate the monthly interest rate
		double monthlyRate=(double)interestRate/1200;
		double monthlyPayment;
    //Calculate the monthly payment then display both the total payment and monthly payment
		monthlyPayment=(loanAmount*monthlyRate)/(1-1/Math.pow(1+monthlyRate, years*12));
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);

		System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);
		
		double balance=loanAmount, principal, interest;
    //Display the header of our table
		 System.out.printf("%-12s%-12s%-12s%-12s\n", "Payment#", "Interest", "Principal", "Balance");

          //Calculate and display the variables with correct spacing according to the header
	        for (int i = 1; i <= years * 12; i++) {
	            interest = monthlyRate * balance;
	            principal = monthlyPayment - interest;
	            balance -= principal;

	            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f\n", i, interest, principal, balance);
	        }

          //Close the scanner
	        scanner.close();
		
	}
}
