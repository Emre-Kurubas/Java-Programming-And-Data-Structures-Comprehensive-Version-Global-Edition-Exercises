/*
(Sum series) Write a method to compute the following series:

	m(i) = 1 / 2 + 2 / 3 + ... + i / (i + 1)

Write a test program that displays the following table:

i       m(i)
--------------
1        0.5000
2        1.1667
...
19       16.4023
20       17.3546
*/

public class Exercise06_13 {
    public static void main(String[] args) {
        // Set the initial values for the series
        double seriesStart = 1.0;
        double numberOfRows = 20.0;

        // Display the table header
        System.out.printf("%-10s%s\n", "I", "m(i)");
        System.out.println("--------------------");

        // Iterate through the series and display the results
        for (double i = seriesStart; i <= numberOfRows; i++) {
            System.out.printf("%-10.0f%7.4f\n", i, series(i));
        }
    }

    // Method to calculate the series for a given value of i
    public static double series(double i) {
        double sum = 0;

        // Iterate through the series and calculate the sum
        for (double j = 1; j <= i; j++) {
            sum += j / (j + 1.0);
        }

        // Return the calculated sum
        return sum;
    }
}

