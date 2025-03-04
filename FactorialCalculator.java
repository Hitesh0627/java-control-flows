import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the integer
        System.out.print("Enter a positive integer: ");
        
        // Check if the input is a valid integer
        if(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            
            // Check if the entered integer is positive
            if(num >= 0) {
                // Initialize factorial variable
                long factorial = 1;
                
                // Use while loop to compute the factorial
                int i = 1;
                while(i <= num) {
                    factorial *= i;
                    i++;
                }
                
                // Output the result
                System.out.println("The factorial of " + num + " is: " + factorial);
            } else {
                System.out.println("Please enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
