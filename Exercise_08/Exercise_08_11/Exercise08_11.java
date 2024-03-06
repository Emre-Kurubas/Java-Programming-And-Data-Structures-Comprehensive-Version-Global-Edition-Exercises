/*
(Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some 
face up and some face down. You can represent the state of the coins using a 
3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
0 0 0    1 0 1    1 1 0    1 0 1    1 0 0
0 1 0    0 0 1    1 0 0    1 1 0    1 1 1
0 0 0    1 0 0    0 0 1    1 0 0    1 1 0
Each state can also be represented using a binary number. For example,
the pre-ceding matrices correspond to the numbers
000010000 101001100 110100001 101110100 100111110
There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3, . . . , 
and 511 to represent all states of the matrix. Write a program that prompts the 
user to enter a number between 0 and 511 and displays the corresponding matrix 
with the characters H and T. 
*/
import java.util.Scanner;

public class Exercise08_11 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 0 and 511
        System.out.print("Enter a number between 0 and 511: ");
        int numberOfPossibility = scanner.nextInt();

        // Convert the entered number to a binary string
        String binary = Integer.toBinaryString(numberOfPossibility);

        // Pad the binary string with leading zeros if necessary to ensure it has 9 digits
        while (binary.length() < 9) {
            binary = "0" + binary;
        }

        // Call the coinFlip method to generate the coin flip sequence
        System.out.print(coinFlip(binary));

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to generate a coin flip sequence based on the binary representation of a number
    public static String coinFlip(String binary) {
        String coin = "";
        char[] binaryChar = binary.toCharArray();
        
        // Iterate through each character in the binary string
        for (int i = 0; i < binary.length(); i++) {
            // If the character is '0', represent it as 'H' (heads), otherwise represent it as 'T' (tails)
            if (binaryChar[i] == '0') {
                coin += "H ";
            } else {
                coin += "T ";
            }
            
            // Add a newline character after every 3 coin flips to represent each row
            if (i == 2 || i == 5) {
                coin += "\n";
            }
        }
        
        // Return the generated coin flip sequence
        return coin;
    }
}
