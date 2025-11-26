 import java.util.Scanner;

public class SumDigitsCalculator {

    public static int sumDigits(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        if (n < 10) {
            return n;
        }
        int lastDigit = n % 10;

        int remainingNumber = n / 10;

        return lastDigit + sumDigits(remainingNumber);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("--- Recursive Digit Sum Calculator ---");
        System.out.print("Enter an integer to calculate the sum of its digits: ");

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();


            int result = sumDigits(number);

            System.out.println("\nThe number entered is: " + number);
            System.out.println("The recursive sum of its digits is: " + result);


            if (Math.abs(number) == 305) {
                System.out.println("(Matches Scenario 1 example: 3 + 0 + 5 = 8)");
            }

        } else {
            System.err.println("Error: Invalid input. Please enter a valid integer.");
        }


    }
}

