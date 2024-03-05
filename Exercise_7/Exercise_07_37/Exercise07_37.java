/*
(Game: bean machine) The bean machine, also known as a quincunx or the Gal-ton box,
is a device for statistics experiments named after English scientist Sir 
Francis Galton. It consists of an upright board with evenly spaced nails (or pegs) 
in a triangular form, Balls are dropped from the opening of the board. Every time a ball hits a nail, it 
has a 50% chance of falling to the left or to the right. The piles of balls are accu-mulated
in the slots at the bottom of the board.
    Write a program that simulates the bean machine. Your program should prompt the 
user to enter the number of the balls and the number of the slots in the machine. 
Simulate the falling of each ball by printing its path. For example, the path for 
the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is 
RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here 
is a sample run of the program:
   (Hint: Create an array named slots. Each element in slots stores the number of 
balls in a slot. Each ball falls into a slot via a path. The number of Rs in a path is the 
position of the slot where the ball falls. For example, for the path LRLRLRR, the ball 
falls into slots[4], and for the path RRLLLLL, the ball falls into slots[2].)
*/

import java.util.Scanner;

public class Exercise07_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int numOfBalls = scanner.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numOfSlots = scanner.nextInt();

        // Create an array to represent the slots in the bean machine
        int[] slots = new int[numOfSlots];
        // Create an array to store the paths of each ball
        String[] paths = new String[numOfBalls];

        // Generate and record paths for each ball
        for (int i = 0; i < numOfBalls; i++) {
            paths[i] = path();
            System.out.println("" + paths[i]);
            // Increment the corresponding slot based on the path of the ball
            slots[balls(paths[i])]++;
        }

        // Display the distribution of balls in the bean machine
        System.out.print("" + printBalls(slots, numOfBalls));

        scanner.close();
    }

    // Method to get a random path ('L' or 'R') for a ball
    public static String getRandomPath() {
        if ((int) (Math.random() * 2) == 0)
            return "L";
        else
            return "R";
    }

    // Method to generate a random path of length 7 for a ball
    public static String path() {
        String path = "";
        for (int i = 0; i < 7; i++) {
            path += "" + getRandomPath();
        }
        return path;
    }

    // Method to count the number of 'R' in the path, representing the slot where the ball ends up
    public static int balls(String path) {
        int numberOfRs = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'R') {
                numberOfRs++;
            }
        }
        return numberOfRs;
    }

    // Method to print the distribution of balls in the bean machine
    public static String printBalls(int[] slots, int numOfBalls) {
        StringBuilder result = new StringBuilder();

        int maxBallsInColumn = 0;

        // Find the maximum number of balls in a column
        for (int slot : slots) {
            maxBallsInColumn = Math.max(maxBallsInColumn, slot);
        }

        // Print the distribution row by row
        for (int row = maxBallsInColumn; row > 0; row--) {
            for (int slot : slots) {
                result.append((row <= slot) ? "O" : " ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
