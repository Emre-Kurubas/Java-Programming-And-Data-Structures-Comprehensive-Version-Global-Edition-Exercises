/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/
import java.util.Scanner;

public class Exercise02_05 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
    // Prompt the user to enter the subtotal and a gratuity rate
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subTotal = scanner.nextDouble();
		double gratuityRate= scanner.nextDouble();
    
    //Calculate gratuity and total
		double gratuity= (subTotal*gratuityRate)/100;
		double total= subTotal+gratuity;

    //Display the results
		System.out.print("The gratuity is $"+gratuity+" and total is $"+total);
}
}
