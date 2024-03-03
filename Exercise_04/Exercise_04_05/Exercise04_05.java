/*
(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
which all sides are of the same length and all angles have the same degree (i.e., the
polygon is both equilateral and equiangular). Write a program that prompts the user to enter the
number of sides and their length of a regular polygon and displays its area.
*/

import java.util.Scanner;

public class Exercise04_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the number of sides and their length
		System.out.print("Enter the number of sides: ");
		int numOfSides = scanner.nextInt();
		System.out.print("Enter the length of the side: ");
		double side = scanner.nextDouble();

    //Calculate the area using the formula for a regular polygon then display the results
		double area = (numOfSides * Math.pow(side, 2))/(4*Math.tan(Math.PI/numOfSides));
		System.out.print("The area of the polygon is "+ area);

    //Close the scanner
		scanner.close();
	}
}
