/*
(Check IMEI number) Write a program that prompts a user to enter the 
International Mobile Equipment Identity (IMEI) number in the format 
DD-DDDDDD-DDDDDD-D, where D is a digit. Your program should check 
whether the input is valid. 
*/
import java.util.Scanner;

public class Exercise04_21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter an IMEI number
		System.out.print("Enter an IMEI number: ");
		String imei = scanner.nextLine();

    //Check if the number entered is a valid IMEI number
		boolean isValid = (imei.length()== 18) && (Character.isDigit(imei.charAt(0))) 
		&& (Character.isDigit(imei.charAt(1))) && (imei.charAt(2)== '-') && (Character.isDigit(imei.charAt(3)))
		&& (Character.isDigit(imei.charAt(4))) && (Character.isDigit(imei.charAt(5))) && (Character.isDigit(imei.charAt(6)))
		&& (Character.isDigit(imei.charAt(7))) && (Character.isDigit(imei.charAt(8))) &&(imei.charAt(9)== '-')
		&& (Character.isDigit(imei.charAt(10))) && (Character.isDigit(imei.charAt(11))) && (Character.isDigit(imei.charAt(12)))
		&& (Character.isDigit(imei.charAt(13))) && (Character.isDigit(imei.charAt(14))) && (Character.isDigit(imei.charAt(15)))
		&& (imei.charAt(16)=='-') && Character.isDigit(imei.charAt(17));

    //Print the result
		System.out.println(imei + " is " + ((isValid) ? "a valid " : "an invalid ")
				+ "IMEI number");

    //Close the scanner
		scanner.close();
	}
}	
