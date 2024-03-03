/*
(Conversion from C° to F°) Write a program that displays the following table 
(note that Fahrenheit = Celsius * 9/5 + 32):
Celsius Fahrenheit
0       32.0
2       35.6
. . .
98      208.4
100     212.0
*/

public class Exercise05_03 {
	public static void main(String[] args) {
		int celsius;
		double fahrenheit;
		System.out.println("Celsius      Fahrenheit");
		for(celsius=0; celsius<=100; celsius++) {
			if(celsius%2==0) {
			fahrenheit = (celsius * 9.0 / 5.0) + 32;

			System.out.println(celsius+"            "+fahrenheit);
			}
		}
	}
}
