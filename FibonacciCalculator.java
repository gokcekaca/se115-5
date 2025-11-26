import java.util.Scanner;


public class FibonacciCalculator {

    public static long fib(int n) {

        if (n < 0) {
            System.err.println("Error: Fibonacci position must be a non-negative integer (n >= 0).");
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position;

        System.out.println("--- Recursive Fibonacci Calculator ---");
        System.out.print("Enter the position (n) in the Fibonacci sequence: ");

        if (scanner.hasNextInt()) {
            position = scanner.nextInt();


            long result = fib(position);

            if (result != -1) {
                System.out.println("\nFibonacci Sequence starts at fib(0)=0.");
                System.out.println("The Fibonacci number at position " + position + " is: " + result);
            }
        } else {
            System.err.println("Error: Invalid input. Please enter a non-negative integer.");
        }

    }
}