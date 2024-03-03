/*
(Algebra: solve quadratic equations) Write a program that prompts the user to enter 
values for a, b, and c and displays the result based on the discriminant. If the 
discriminant is positive, display two roots. If the discriminant is 0, display 
one root. Otherwise, display “The equation has no real roots.
*/


import java.util.Scanner;

public class Exercise03_01 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter a b and c
		System.out.print("Enter a, b, c: ");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
    //Use the formula to find the roots/root
		double r= (b*b)-4*a*c;
		double r1, r2;

    
		if(r>0){
      //If r is positive calculate the two roots then display the result
			r1= (-b + Math.sqrt(r))/(2*a);
			r2= (-b - Math.sqrt(r))/(2*a);
			System.out.print("The equation has two roots "+ r1 +" and "+ r2 );
		}
		else if (r==0) {
      //If r is 0 calculate the only root and display the result
			r1= (-b - Math.sqrt(r))/(2*a);
			System.out.print("The equation has one root "+ r1);
		}
		else 
			System.out.print("The equation has no real roots");

    //Close the scanner
		scanner.close();
	}
	
}
