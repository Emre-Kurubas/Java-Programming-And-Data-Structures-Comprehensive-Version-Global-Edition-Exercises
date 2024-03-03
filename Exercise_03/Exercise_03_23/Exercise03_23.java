/*
(Geometry: point in a rectangle?) Write a program that prompts the user to enter 
a point (x, y) and checks whether the point is within the rectangle centered at 
(1, 1) with width 10 and height 5. For example, (2, 2) is inside the rectangle and 
(6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the 
rectangle if its horizontal distance to (1, 1) is less than or equal to 10 / 2 and its 
vertical distance to (1, 1) is less than or equal to 5.0 / 2. Test your program to 
cover all cases.) 
*/

import java.util.Scanner;

public class Exercise03_23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the coordinates
		System.out.print("Enter a point with the coordinates: ");
		double x = scanner.nextDouble(), y=scanner.nextDouble();

    //Check if the given coordinates are in the rectangle
		if (Math.abs((double)x-1)<=6.0 &&Math.abs((double)y-1)<=3.5) {
			System.out.print("Point ("+x+", "+y+") is in the rectangle");
		}
		else
			System.out.print("Point ("+x+", "+y+") is not in the rectangle");

    //Close the scanner
		scanner.close();
	}
	
}
