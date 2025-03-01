import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

        // Close the scanner
        scanner.close();
    }
}
