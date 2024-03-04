/*
(Occurrences of a specified character) Write a method that finds the number of 
occurrences of a specified character in a string using the following header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that 
prompts the user to enter a string followed by a character then displays the 
number of occurrences of the character in the string.
*/

import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a string followed by a character 
        System.out.print("Enter a sentence followed by a character to find: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to find: ");
        char characterToFind = scanner.next().charAt(0);
        //Call the count method to print the occurrences of the specified character
        int occurrences = count(input, characterToFind);

        System.out.println("The number of occurrences of \"" + characterToFind +
                "\" in \"" + input + "\" is: " + occurrences);
        //Close the scanner
        scanner.close();
    }
    //Create the method "count" to find and return the occurrence of the specified character
    public static int count(String str, char ch) {
        int occurrences = 0;
      
       // Increment the occurrences variable every time the given character is encountered.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                occurrences++;
            }
        }
        //Return the variable
        return occurrences;
    }
}
