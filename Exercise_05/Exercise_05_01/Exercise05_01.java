/*
(Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number.
*/
import java.util.Scanner;

public class Exercise05_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Declare and initialize necessary variables
		int num=1, positive=0, negative=0, totalpos=0, totalneg=0;
		int total=0;
		float average =0;

    //Prompt the user to enter an integer and keep prompting until 0 is entered
		System.out.print("Enter an integer, the input ends if it is 0: ");
		num=scanner.nextInt();
		if(num==0)
			System.out.print("No numbers are entered except 0");
		else {
			while (num!=0) {
				
				if(num>0) {
					positive++;
					totalpos+=num;
				}
				else if (num<0) {
					negative++;
					totalneg+=num;
				}
				num=scanner.nextInt();
			}
			//Compute the average and display the result
			total = totalpos + totalneg;
			average = (float) total/(positive+negative);
			System.out.println(" "+positive +" " + negative +" " + total +" " + average);
		
		}
    //Close the scanner
		scanner.close();
	}
}
