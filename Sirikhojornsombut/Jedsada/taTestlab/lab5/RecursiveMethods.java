package sirikhojornsombut.jedsada.taTestlab.lab5;

public class RecursiveMethods {

    public static void main(String[] args) {
        int[] sampleArray = {3, 5, 2, 8, 6, 2, 9};

        System.out.println("Sample Array: ");
        for (int num : sampleArray) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Test arraySum
        System.out.println("=== Testing calculateSum ===");
        int sum = calculateSum(sampleArray, sampleArray.length);
        System.out.println("Sum: " + sum);
        System.out.println("Expected: 35\n");

        // Test findMaximum
        System.out.println("=== Testing findMaximum ===");
        int max = findMaximum(sampleArray, sampleArray.length);
        System.out.println("Maximum: " + max);
        System.out.println("Expected: 9\n");

        // Test countOccurrences
        System.out.println("=== Testing countOccurrences ===");
        int target = 2;
        int count = countOccurrences(sampleArray, target, 0);
        System.out.println("Occurrences of " + target + ": " + count);
        System.out.println("Expected: 2\n");

        // Test printArrayReverse
        System.out.println("=== Testing printArrayReverse ===");
        System.out.print("Array in reverse: ");
        printArrayReverse(sampleArray, 0);
        System.out.println("\nExpected: 9 2 6 8 2 5 3");
    }

    public static int calculateSum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + calculateSum(arr, n - 1);
    }

    public static int findMaximum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMaximum(arr, n - 1));
    }

    public static int countOccurrences(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return 0;
        }
        int count = (arr[index] == target) ? 1 : 0;
        return count + countOccurrences(arr, target, index + 1);
    }

    public static void printArrayReverse(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        printArrayReverse(arr, index + 1);
        System.out.print(arr[index] + " ");
    }

}
