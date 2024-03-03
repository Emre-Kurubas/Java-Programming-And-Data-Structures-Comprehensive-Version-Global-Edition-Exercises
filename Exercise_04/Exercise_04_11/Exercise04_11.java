/*
(Binary to decimal) Write a program that prompts the user to enter binary digits 
and displays its corresponding decimal value. 
*/

import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a 4-digit binary number
        System.out.print("Enter binary digits (0000) to (1111): ");
        int binary = scanner.nextInt();
        //Use the switch statement to convert the binary number into decimal number then print the result
        switch (binary) {
            case 0b0001: System.out.println("The decimal value is 1"); break;
            case 0b0010: System.out.println("The decimal value is 2"); break;
            case 0b0100: System.out.println("The decimal value is 4"); break;
            case 0b1000: System.out.println("The decimal value is 8"); break;
            case 0b0011: System.out.println("The decimal value is 3"); break;
            case 0b0101: System.out.println("The decimal value is 5"); break;
            case 0b0110: System.out.println("The decimal value is 6"); break;
            case 0b0111: System.out.println("The decimal value is 7"); break;
            case 0b1001: System.out.println("The decimal value is 9"); break;
            case 0b1010: System.out.println("The decimal value is 10"); break;
            case 0b1011: System.out.println("The decimal value is 11"); break;
            case 0b1100: System.out.println("The decimal value is 12"); break;
            case 0b1101: System.out.println("The decimal value is 13"); break;
            case 0b1110: System.out.println("The decimal value is 14"); break;
            case 0b1111: System.out.println("The decimal value is 15"); break;
            default: System.out.println("Invalid binary input");
        }

        //Close the scanner
        scanner.close();
    }
}
