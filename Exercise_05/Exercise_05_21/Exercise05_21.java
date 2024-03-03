/*
(Financial application: compare loans with various interest rates) Write a program
that lets the user enter the loan amount and loan period in number of years 
and displays the monthly and total payments for each interest rate starting from 
5% to 10%, with an increment of 1/4.
*/

import java.util.Scanner;

public class Exercise05_21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the loan amount and the number of years
		System.out.print("Loan amount: ");
		int loanAmount = scanner.nextInt();
		System.out.print("Number of Years: ");
		int numberOfYears = scanner.nextInt();
    
		double interestRate=5, monthlyPayment, totalPayment;
		double monthlyInterestRate;

    //Display the header of the table we will create
		System.out.println("Interest Rate      Monthly Payment      Total Payment");

    //Display the monthly and total payments for each interest rate according to the question
		for(int i = 1; i<=21; i++) {
			monthlyInterestRate=interestRate/1200;
			monthlyPayment=loanAmount * monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate, numberOfYears*12));
			totalPayment=monthlyPayment*numberOfYears*12;
			System.out.println(interestRate+"%               "+monthlyPayment+"   "+totalPayment);
			interestRate+=0.25;
			
		}

    //Close the scanner
		scanner.close();
	}
}
