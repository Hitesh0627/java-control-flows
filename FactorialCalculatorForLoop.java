import java.util.Scanner;

public class FactorialCalculatorForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the integer
        System.out.print("Enter a positive integer: ");
        
        // Check if the input is a valid integer
        if(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            
            // Check if the entered integer is a positive number
            if(num >= 0) {
                // Initialize factorial variable
                long factorial = 1;
                
                // Use for loop to compute the factorial
                for(int i = 1; i <= num; i++) {
                    factorial *= i;
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
