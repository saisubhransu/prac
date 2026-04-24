import java.util.Scanner;

public class calcy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (choice == 1) {
            System.out.println("Result = " + (a + b));
        } else if (choice == 2) {
            System.out.println("Result = " + (a - b));
        } else if (choice == 3) {
            System.out.println("Result = " + (a * b));
        } else if (choice == 4) {
            if (b != 0)
                System.out.println("Result = " + (a / b));
            else
                System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
