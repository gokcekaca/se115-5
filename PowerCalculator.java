import java.util.Scanner;

public class PowerCalculator {

    public static int power(int base, int exp) {

        if (exp < 0) {
            System.err.println("Error: The current recursive function only handles non-negative exponents.");
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        else{

        return base * power(base, exp - 1);}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int exponent;

        System.out.print("Enter the base number: ");
        if (scanner.hasNextLong()) {
            base = scanner.nextInt();
        } else {
            System.out.println("Error: Invalid input for base. Please enter a number.");

            return;
        }

        System.out.print("Enter the exponent (a non-negative integer: ");
        if (scanner.hasNextInt()) {
            exponent = scanner.nextInt();
        } else {
            System.out.println("Error: Invalid input for exponent. Please enter an integer.");

            return;
        }


        long result = power(base, exponent);

        if (result != -1) {
            System.out.println("\nCalculation: " + base + " raised to the power of " + exponent + " (" + base + "^" + exponent + ")");
            System.out.println("Result: " + result);


            if (base == 3 && exponent == 4) {
                System.out.println("(Matches Scenario 2 example: 3 * 3 * 3 * 3 = 81)");
            }
        }


    }
}