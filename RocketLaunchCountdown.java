import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // While loop to countdown from user input value to 1
        while (counter >= 1) {
            System.out.println("T-" + counter + " seconds");
            counter--; // Decrement the counter
        }

        // Print launch message when countdown reaches 1
        System.out.println("Liftoff! 🚀");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
