/*
(Geometry: distance of two points) Write a program that prompts the user to 
enter two points (x1, y1) and (x2, y2) and displays their distance. 
*/
import java.util.Scanner;

public class Exercise02_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter x1 and y1
		System.out.print("Enter x1 and y1: ");
		double x1=scanner.nextDouble();
		double y1=scanner.nextDouble();

    
    //Prompt the user to enter x2 and y2
		System.out.print("Enter x2 and y2: ");
		double x2=scanner.nextDouble();
		double y2=scanner.nextDouble();


    //Compute the difference between x1-x2 and y1-y2
		double diffx=x1-x2;
		double diffy=y1-y2;
    //Implement the distance formula
		double distance= (double)Math.sqrt((Math.pow((diffx),(2)))+(Math.pow((diffy), (2))));

    //Print out the results
		System.out.print("The distance between the two points is "+distance);
    
    //Close the scanner
    scanner.close();
	}
}
