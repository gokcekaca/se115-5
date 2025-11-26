import java.util.Scanner;

public class UserInputFactorial {

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial cannot be calculated for negative numbers.");
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a non-negative integer (n) to calculate its factorial: ");

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

            int result = factorial(number);

            if (result != -1) {
                System.out.println("\nThe factorial of " + number + " (" + number + "!) is:");
                System.out.println("Result: " + result);
            }
        } else {
            System.err.println("Error: Invalid input. Please enter an integer.");
        }

    }
}