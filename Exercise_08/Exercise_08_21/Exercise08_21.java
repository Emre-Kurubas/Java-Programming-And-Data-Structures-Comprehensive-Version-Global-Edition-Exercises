/*
(Central city) Given a set of cities, the central city is the city that has the shortest 
total distance to all other cities. Write a program that prompts the user to enter 
the number of cities and the locations of the cities (coordinates), and finds the 
central city and its total distance to all other cities
*/
import java.util.Scanner;

public class Exercise08_21 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of cities
        System.out.print("Enter the number of cities: ");
        int numOfCities = scanner.nextInt();
        
        // Create a 2D array to store the coordinates of the cities
        double[][] cities = new double[numOfCities][2];
        
        // Prompt the user to enter the coordinates of the cities
        System.out.print("Enter the coordinates of the cities: ");
        // Loop to read the coordinates of each city
        for (int i = 0; i < numOfCities; i++) {
            for (int j = 0; j < 2; j++) {
                cities[i][j] = scanner.nextDouble();
            }
        }
        
        // Call the centralCity method to find the central city and total distance
        double[] central = centralCity(cities);
        double x = central[0], y = central[1];
        
        // Display the central city and total distance
        System.out.println("The central city is at (" + x + ", " + y + ")");
        System.out.printf("The total distance to all other cities is %.2f", central[2]);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to find the central city and total distance to all other cities
    public static double[] centralCity(double[][] cities) {
        // Initialize variables to store the shortest total distance and the central city
        double shortestTotalDistance = Double.MAX_VALUE;
        double[] centralCity = new double[3]; // [x, y, totalDistance]

        // Iterate through each city
        for (int i = 0; i < cities.length; i++) {
            double totalDistance = 0;

            // Calculate the total distance from the current city to all other cities
            for (int j = 0; j < cities.length; j++) {
                if (i != j) {
                    // Calculate the Euclidean distance between two cities
                    totalDistance += Math.sqrt(Math.pow(cities[i][0] - cities[j][0], 2)
                            + Math.pow(cities[i][1] - cities[j][1], 2));
                }
            }

            // Update the central city if the total distance is shorter
            if (totalDistance < shortestTotalDistance) {
                shortestTotalDistance = totalDistance;
                centralCity[0] = cities[i][0];
                centralCity[1] = cities[i][1];
                centralCity[2] = totalDistance;
            }
        }

        // Return the central city and total distance
        return centralCity;
    }
}
