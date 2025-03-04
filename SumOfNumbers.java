import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the total to 0.0 (double type)
        double total = 0.0;

        // Variable to store the user entered number
        double number;

        // Use while loop to keep asking for numbers until 0 is entered
        do {
            // Ask the user to enter a number
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();

            // If the number is not zero, add it to the total
            if (number != 0) {
                total += number;
            }
        } while (number != 0);  // Loop continues until the user enters 0

        // Display the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
