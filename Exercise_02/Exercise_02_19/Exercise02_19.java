/*
(Geometry: area of a triangle) Write a program that prompts the user to enter 
three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays 
its area.
*/

import java.util.Scanner;

public class Exercise02_19 {
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);

    //Prompt the user to enter the coordinates
		System.out.print("Enter the coordinates of three points seperated by spaces like x1 y1 x2 y2 x3 y3: ");
		double x1= scanner.nextDouble(), y1=scanner.nextDouble(), x2=scanner.nextDouble(), y2=scanner.nextDouble(), x3=scanner.nextDouble(), y3=scanner.nextDouble();

    //Compute the differences
		double diffx1=(x1-x2), diffy1=(y1-y2);
		double diffx2=(x2-x3), diffy2=(y2-y3);
		double diffx3=(x3-x1), diffy3=(y3-y1);

    //Implement the distance between two points formula to each side
		double side1= Math.sqrt(Math.pow(diffx1, 2)+Math.pow(diffy1, 2));
		double side2= Math.sqrt((Math.pow(diffx2, 2)+ (Math.pow(diffy2, 2))));
		double side3= Math.sqrt(Math.pow(diffx3, 2)+ Math.pow(diffy3, 2));

    //Compute the area of the triangle
		double s = (side1+side2+side3)/2;
		double area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

    //Display the result
		System.out.print("The area of the triangle is "+area);

    //Close the scanner when we are done
    scanner.close();
	}
}
