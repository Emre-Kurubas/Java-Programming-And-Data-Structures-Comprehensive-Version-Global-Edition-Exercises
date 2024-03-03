/*
(Display pyramid) Write a program that prompts the user to enter an integer from 
1 to 15 and displays a pyramid.
*/

import java.util.Scanner;

public class Exercise05_17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the number of lines
		System.out.print("Enter the number of lines: ");
		int line=scanner.nextInt();
		int n;

    //Print the numbers to create a pyramid
		for(int j=line; j>=1; j--) {
			for(int i=j; i>=2-j; i--) {
				
				if(i<=0) {
					n=2-i;
					System.out.print(n+" ");
				}
				else 
					System.out.print( i+" ");
				
			}
			System.out.print("\n");
		}

    //Close the scanner
		scanner.close();
	}
}
