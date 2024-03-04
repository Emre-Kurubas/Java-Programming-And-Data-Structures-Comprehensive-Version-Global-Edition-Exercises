/*
(Convert milliseconds to hours, minutes, and seconds) Write a method that con-verts milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds. For example, con-vertMillis(5500) returns a string 0:0:5, convertMillis(100000)
returns a string 0:1:40, and convertMillis(555550000) returns a string 
154:19:10. Write a test program that prompts the user to enter a long integer 
for milliseconds and displays a string in the format of hours:minutes:seconds.
*/

import java.util.Scanner;

public class Exercise06_25 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

    //Prompt the user to enter a long integer
		System.out.print("Enter a long integer for milliseconds: ");
		long millis = scanner.nextLong();

    //Call the convertMillis method to print the result
		System.out.print(""+convertMillis(millis));

    //Close the scanner
		scanner.close();
	}

  //Create a method called convertMillis to convert the given milliseconds
	public static String convertMillis(long millis) {
		
		//Calculate the hours minutes and seconds
		int hour = (int)millis/3600000;
		millis%=3600000;
		int minute = (int)millis/60000;
		millis%=60000;
		int second = (int)millis/1000;

    //Return the result in the correct format
		return (""+hour+":"+minute+":"+second);
		
	}
}
