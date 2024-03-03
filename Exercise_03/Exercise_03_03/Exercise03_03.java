/*
(Algebra: solve 2*2 linear equations) A linear equation can be solved using 
Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts 
the user to enter a, b, c, d, e, and f and displays the result. If ad-bc is 0, report 
that “The equation has no solution."
*/

import java.util.Scanner;

public class Exercise03_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Prompt the user to enter the necessary input
		System.out.print("Enter a, b, c, d, e, f: ");
		
		double a= scanner.nextDouble(), b= scanner.nextDouble(), c= scanner.nextDouble(), d= scanner.nextDouble(), e= scanner.nextDouble(), f= scanner.nextDouble();
		double x;
		double y; 

    //Apply Cramer's Rules to determine the results and display them.
		if(((a*d)-(b*c))!=0) {
			 x = ((e*d)-(b*f))/((a*d)-(b*c));
			 y = ((a*f)-(e*c))/((a*d)-(b*c));
			System.out.print("x is "+ x + " and y is "+ y );
		}
		else 
			System.out.print("The system has no solution");
	}
  //Close the scanner
  scanner.close();
}
