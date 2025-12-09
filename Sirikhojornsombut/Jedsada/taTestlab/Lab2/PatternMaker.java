package sirikhojornsombut.jedsada.taTestlab.Lab2;

import java.util.Scanner;

public class PatternMaker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter an odd integer between 1 and 19 (-1 to quit): ");
            n = scanner.nextInt();

            // Check if user wants to quit
            if (n == -1) {
                System.out.println("Thank you for using Pattern Maker. Bye!");
                scanner.close();
                return;
            }

            // Validate input
            if (n % 2 == 0) {
                System.out.println("The number must be an odd integer.");
            } else if (n < 1 || n > 19) {
                System.out.println("The number must be between 1 and 19.");
            } else {
                // Valid input - print the diamond pattern
                printDiamond(n);
            }

        } while (true);
    }

    /**
     * Prints a triangle pattern with the given size
     *
     * @param n the size of the triangle base (odd number)
     */
    public static void printDiamond(int n) {
        // Print triangle rows with only odd numbers of asterisks (1, 3, 5, 7, ...)
        for (int i = 1; i <= n; i += 2) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks with spaces between them
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
