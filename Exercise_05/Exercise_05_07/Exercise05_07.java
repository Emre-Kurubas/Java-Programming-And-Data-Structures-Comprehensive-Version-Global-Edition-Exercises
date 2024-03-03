/*
(Financial application: compute future tuition) Suppose that the tuition for a 
university is $10,000 this year and increases 6% every year. In one year, the 
tuition will be $10,600. Write a program that computes the tuition in ten years 
and the total cost of four years’ worth of tuition after the tenth year.
*/


public class Exercise05_07 {
	public static void main(String[] args) {
		double tuition=10000, percent=5, total=0, totalten=0;
		for(int i=1; i<=10; i++) {
			tuition+=(tuition*percent)/100;
			
		}totalten=tuition;
		for(int j=1; j<=4; j++) {
			tuition+=(tuition*percent)/100;
			total+=tuition;
		}
		System.out.printf("Tuition cost after 10 years is: $%.2f%n" + 
	            "Four years of tuition after 10 years is: $%.2f%n", 
	            totalten, total);
	}
}
