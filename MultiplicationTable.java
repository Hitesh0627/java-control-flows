import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        
        // Check if the input is a valid integer
        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            // Use a for loop to print the multiplication table from 6 to 9
            System.out.println("Multiplication table of " + number + " from 6 to 9:");
            for(int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
