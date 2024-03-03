/*
(Display leap years) Write a program that displays all the leap years, ten per line, 
from 2014 to 2114, separated by exactly one space. Also display the number of 
leap years in this period
*/
public class Exercise05_27 {
	public static void main (String[] args) {
		int leap, num=0;
		for(leap=2016; leap<=2114; leap+=4) {
			System.out.print(leap+" ");
			num++;
		}
		System.out.print("\n"+num+"");
	}
}
