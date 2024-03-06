/*
(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is >= best - 10;
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades.
*/

import java.util.Scanner;

public class Exercise07_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    //Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		int numOfStudents=scanner.nextInt();

    //Create an int array called scores and char array named grades
		int[] scores=new int[numOfStudents];
		char [] grades=new char[numOfStudents];

    //Prompt the user to enter the scores of the students and store these scores in the scores array
		System.out.print("Enter "+numOfStudents+" scores: ");
		for(int i=0; i<numOfStudents; i++) {
			scores[i]=scanner.nextInt();
		}

    //Initialize the best score to 0 
		int best=0;

    //Find the best score and initialize the best variable to that score
			for(int j=0; j<numOfStudents; j++) {
				if(scores[j]>=best) {
					best=scores[j];
				}
		}

    //Initialize the grades of the students according to the formula given in the question 
		for(int i=0; i<numOfStudents; i++) {
			if(scores[i]>=best-10) {
				grades[i]='A';
			}
			else if(scores[i]>=best-20) {
				grades[i]='B';
			}
			else if(scores[i]>=best-30) {
				grades[i]='C';
			}
			else if(scores[i]>=best-40) {
				grades[i]='D';
			}
			else 
				grades[i]='F';
		}
		
		for(int j=0; j<numOfStudents; j++) {
			System.out.println("Student "+j+" score is "+scores[j]+" and grade is "+grades[j]);
		}

    //Close the scanner
		scanner.close();
		
	}
}
