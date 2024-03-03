/*
Count vowels and consonants) Assume that the letters A, E, I, O, and U are vow-
els. Write a program that prompts the user to enter a string, and displays the 
number of vowels and consonants in the strin
*/

import java.util.Scanner;

public class Exercise05_49 {
	public static void main (String[] args) {
		Scanner stdin = new Scanner(System.in);
		int vowels=0, consonants=0;
		//Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String str = stdin.nextLine();
		int length=str.length();
    //Check how many vowels and consonants are in the string
		for(int i=0; i<length; i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' 
			|| str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowels++;
			}
			else if(str.charAt(i)!=' ') {
				consonants++;
			}
		}
    //Print the results then close the scanner
		System.out.println("The number of vowels is "+vowels);
		System.out.print("The number of consonants is "+consonants);
		stdin.close();
	}
}
