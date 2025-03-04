import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total to 0.0 (double type)
        double total = 0.0;

        // Infinite while loop
        while (true) {
            // Ask the user to enter a number
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            // If the number is 0 or negative, break out of the loop
            if (number <= 0) {
                break;
            }

            // Add the entered number to the total
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
