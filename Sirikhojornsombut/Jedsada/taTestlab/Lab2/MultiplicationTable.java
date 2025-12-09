package sirikhojornsombut.jedsada.taTestlab.Lab2;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    private static final int DEFAULT_SIZE = 5;
    private static final int MAX_SIZE = 12;

    public static void main(String[] args) {
        int n;

        // Check if argument is provided
        if (args.length == 0) {
            System.out.println("No size argument provided, using default size " + DEFAULT_SIZE + ".");
            n = DEFAULT_SIZE;
        } else {
            try {
                n = Integer.parseInt(args[0]);

                // Validate the size
                if (n <= 0) {
                    System.out.println("Size must be a positive integer. Use default size " + DEFAULT_SIZE);
                    n = DEFAULT_SIZE;
                } else if (n > MAX_SIZE) {
                    System.out.println("Size is too large, using maximum size " + MAX_SIZE);
                    n = MAX_SIZE;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Use default size " + DEFAULT_SIZE);
                n = DEFAULT_SIZE;
            }
        }

        // List to store prime numbers
        List<Integer> primeNumbers = new ArrayList<>();

        // Print the multiplication table
        System.out.println("\nMultiplication Table (" + n + "x" + n + "):");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int product = i * j;
                System.out.printf("%4d", product);

                // Check if the product is prime and add to list
                if (isPrime(product) && !primeNumbers.contains(product)) {
                    primeNumbers.add(product);
                }
            }
            System.out.println();
        }

        // Sort and print prime numbers
        primeNumbers.sort(null);
        System.out.println("\nPrime numbers in the table:");
        for (int i = 0; i < primeNumbers.size(); i++) {
            System.out.print(primeNumbers.get(i));
            if (i < primeNumbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * Checks whether a given number is prime or not
     *
     * @param number the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        // Check odd divisors up to square root of number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
