package sirikhojornsombut.jedsada.taTestlab.Lab3;

import java.util.Scanner;

public class ArrayStats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to input: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Error: Size must be a positive integer.");
            System.exit(1);
        } else {
            int[] numbers = getInput(size);
            System.out.println("Statistic Results:");
            System.out.println("Sum: " + calculateSum(numbers));
            System.out.println("Minimum: " + findMinimum(numbers));
            System.out.println("Maximum: " + findMaximum(numbers));
            System.out.printf("Average:  %.2f%n", calculateAverage(numbers));
            System.out.printf("Median: %.2f%n", calculateMedian(numbers));
        }
    }

    public static int[] getInput(int size) {
        try (
                Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                // Check if the input is an integer and assign it to the current index
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    scanner.next(); // Consume the invalid input
                    i--; // Decrement i to re-ask for the same element
                }
            }
            return arr;
        }
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int findMinimum(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMaximum(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers);
        return (double) sum / numbers.length;
    }

    public static double calculateMedian(int[] numbers) {
        int n = numbers.length;
        int[] sortedNumbers = numbers.clone();
        java.util.Arrays.sort(sortedNumbers);
        if (n % 2 == 0) {
            return (sortedNumbers[n / 2 - 1] + sortedNumbers[n / 2]) / 2.0;
        } else {
            return sortedNumbers[n / 2];
        }
    }
}
