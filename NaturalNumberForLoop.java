import java.util.Scanner;

public class NaturalNumberForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the value of n
        System.out.print("Enter a natural number: ");
        
        // Check if the input is a valid natural number (positive integer)
        if(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            // Ensure the number is a positive natural number
            if(n > 0) {
                // Calculate sum using the formula n * (n + 1) / 2
                int sumFormula = n * (n + 1) / 2;
                
                // Calculate sum using the for loop
                int sumLoop = 0;
                for(int i = 1; i <= n; i++) {
                    sumLoop += i;
                }
                
                // Output both results and compare
                System.out.println("Sum using formula: " + sumFormula);
                System.out.println("Sum using for loop: " + sumLoop);
                
                // Compare the results
                if(sumFormula == sumLoop) {
                    System.out.println("Both methods give the same result.");
                } else {
                    System.out.println("There is a discrepancy between the methods.");
                }
            } else {
                System.out.println("Please enter a positive natural number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a natural number.");
        }

        // Close the scanner
        scanner.close();
    }
}
