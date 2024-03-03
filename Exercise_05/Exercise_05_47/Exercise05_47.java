/*
(Business: check ISBN-13) ISBN-13 is a new standard for identifying books. It 
uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13
. The last digit d13
 is a checksum, 
which is calculated from the other digits using the following formula:
10-(d1 +3d2 +d3 +3d4 +d5 +3d6 +d7 +3d8 +d9 +3d10 +d11 +3d12)%10
  If the checksum is 10, replace it with 0. Your program should read the input as a 
string. Display “invalid input” if the input is invalid.
*/

import java.util.Scanner;

public class Exercise05_47 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
    //Prompt the user to enter the first 12 digits of an ISBN-13
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn = scanner.nextLine();
		int length=isbn.length(); //Store the entered strings length
		char num;
		int total=0, number;
    // If the length is not 12 the number entered is invalid
		if (length!=12) {
			System.out.print(isbn+" is an invalid input");
		}
		//Calculate the number according to the formula given
		else {
			for(int i=0; i<length; i++) {
				num = isbn.charAt(i);
				number=Character.getNumericValue(num);
				if(i%2==0) {
					total+=(number*3);
				}
				else
					total+=number;
				}
		}
		int digit13=10-(total%10);
		if (digit13>=10)
			digit13%=10;
    //Print the result
		System.out.print("The ISBN-13 number is "+isbn+""+digit13);

    //Close the scanner 
		scanner.close();
	}
}
