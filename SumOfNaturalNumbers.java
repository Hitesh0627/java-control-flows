import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the entered number is a natural number
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
            return; // Exit the program if the number is not natural
        }

        // Compute the sum using the while loop
        int sumUsingWhileLoop = 0;
        int i = 1;
        while (i <= n) {
            sumUsingWhileLoop += i;
            i++;
        }

        // Compute the sum using the formula
        int sumUsingFormula = (n * (n + 1)) / 2;

        // Compare the results
        System.out.println("Sum using while loop: " + sumUsingWhileLoop);
        System.out.println("Sum using formula (n*(n+1)/2): " + sumUsingFormula);

        if (sumUsingWhileLoop == sumUsingFormula) {
            System.out.println("Both methods give the same result. The computation is correct!");
        } else {
            System.out.println("The results are different. Something went wrong.");
        }
    }
}
