import java.util.Scanner;

public class RocketLaunchForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // For loop to countdown from user input value to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println("T-" + i + " seconds");
        }

        // Print launch message when countdown reaches 1
        System.out.println("Liftoff! 🚀");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
