/*
(Financial: credit card number validation) Credit card numbers follow certain 
patterns. A credit card number must have between 13 and 16 digits. It must start 
with
■■ 4 for Visa cards
■■ 5 for Master cards
■■ 37 for American Express cards
■■ 6 for Discover cards
In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card 
numbers. The algorithm is useful to determine whether a card number is entered 
correctly, or whether a credit card is scanned correctly by a scanner. Credit card 
numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check.
Write a program that prompts the user to enter a credit card number as a long
integer. Display whether the number is valid or invalid. Design your program to 
use the following methods:

public static boolean isValid(long number)

public static int sumOfDoubleEvenPlace(long number)

public static int getDigit(int number)

public static int sumOfOddPlace(long number)

 public static boolean prefixMatched(long number, int d)

public static int getSize(long d)

public static long getPrefix(long number, int k)
*/

import java.util.Scanner;

public class Exercise06_31 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Prompt the user to enter their credit card number
		System.out.print("Enter your credit card number as a long integer: ");
		long number=scanner.nextLong();
		//Print out the result by calling isValid method
		System.out.println(number+" is "+ (isValid(number) ? "valid" : "invalid"));
    //Close the scanner
		scanner.close();
	}
	/* Return true if the card number is valid */
	public static boolean isValid(long number) {
		return getSize(number) >= 13 && getSize(number) <= 16 &&
	               (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0 &&
	               (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6));
		
	}
	/* Return the number of digits in d*/
	public static int getSize(long d) {
		String number = Long.toString(d);
		return number.length();
	}
	/* Get the result from step 2*/
	public static int sumOfDoubleEvenPlace(long number) {
		String numberToString = Long.toString(number);
		int length=numberToString.length();
		char num;
		int numericValue;
		int digit=0, sum=0;
		for(int i=0; i<length; i++) {
			num=numberToString.charAt(i);
			numericValue=Character.getNumericValue(num);
			if (i%2==0) {
					digit=getDigit(numericValue*2);
			}
			else 
				continue;
			sum+=digit;
		}
		return sum;
	}
	/* Return this number if its a single digit, otherwise, return the sum of the two digits*/
	public static int getDigit(int number) {
	
		if(number<9) {
			return number;
			
		}
		else
			return number/10+number%10;
	}
	/* Return sum of odd-place digits in number*/
	public static int sumOfOddPlace(long number) {
		String numberToString = Long.toString(number);
		int length=numberToString.length();
		int numericValue;
		char num;
		int  sum=0;
		for(int i=0; i<length; i++) {
			num=numberToString.charAt(i);
			numericValue=Character.getNumericValue(num);
			if(i%2!=0) {
				sum+=numericValue;
			}
		}
		return sum;
	}
	/* Return true if the number d is a prefix for long number*/
	public static boolean prefixMatched(long number, int d) {
		if(getPrefix(number, getSize(d))==d) {
			return true;
		}
		else 
			return false;
	}
	/* Return the first k number of digits from number.
	 * If the number of digits in number less than k, return number*/
	public static long getPrefix(long number, int k) {
		String numberToString = Long.toString(number);
		char digit;
		String kSizeStr="";
		
		if(getSize(number)<k) {
			return number;
		}
		else {
			for(int i =0; i<k; i++) {
				digit=numberToString.charAt(i);
				kSizeStr+=digit;
			}
			long numero=Long.parseLong(kSizeStr);
			return numero;
			
		}
			
	}
}
