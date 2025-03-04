import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter employee's years of service: ");
        int yearsOfService = input.nextInt();

        double bonus = 0;

        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("The bonus for the employee is: INR " + bonus);
    }
}
