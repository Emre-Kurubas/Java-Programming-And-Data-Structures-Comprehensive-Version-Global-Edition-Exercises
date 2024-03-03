/*
(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
*/

import java.util.Scanner;

public class Exercise05_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Variables to store student information
        int score;
        int highest = 0;
        int secondHighest = 0;
        String name = "";
        String student1 = "";
        String student2 = "";

        // Iterate through each student
        for (int i = 1; i <= numberOfStudents; i++) {
            scanner.nextLine();  // Consume newline
            System.out.print("Enter student's name: ");
            name = scanner.nextLine();
            System.out.print("Enter student's score: ");
            score = scanner.nextInt();

            // Check if it is the first student
            if (i == 1) {
                highest = score;
                student1 = name;
            }
            // Check if it is the second student
            else if (i == 2) {
                // Compare scores and update variables accordingly
                if (score > highest) {
                    secondHighest = highest;
                    highest = score;
                    student2 = student1;
                    student1 = name;
                } else {
                    secondHighest = score;
                    student2 = name;
                }
            }
            // For subsequent students
            else {
                // Compare scores and update variables accordingly
                if (score > highest) {
                    secondHighest = highest;
                    highest = score;
                    student2 = student1;
                    student1 = name;
                } else if (score > secondHighest) {
                    secondHighest = score;
                    student2 = name;
                }
            }
        }

        // Display results
        System.out.println("Highest scoring student: " + student1 + " " + highest);
        System.out.println("Second highest scoring student: " + student2 + " " + secondHighest);

        // Close the scanner
        scanner.close();
    }
}
