/*
Vowel or consonant?) Write a program that prompts the user to enter a letter and 
check whether the letter is a vowel or consonant. For a nonletter input, display 
invalid input
*/

import java.util.Scanner;

public class Exercise04_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

    //Prompt the user to enter a letter
		System.out.print("Enter a letter: ");
		String letter = scanner.nextLine();
		char ch = letter.charAt(0);

    //Check if the input is valid then check if the input is a consonant or a vowel
		if(Character.isLetter(ch)) {
			if (ch>='a' && ch<='z') {
				System.out.print(ch+" is a vowel");
			}
			else 
				System.out.print(ch+" is a consonant");
		}
		else 
			System.out.print(ch+" is an invalid input");

    //Close the scanner
		scanner.close();
	}
}
