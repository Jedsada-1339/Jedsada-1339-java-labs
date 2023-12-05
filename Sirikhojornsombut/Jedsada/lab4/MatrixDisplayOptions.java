package sirikhojornsombut.jedsada.lab4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MatrixDisplayOptions {
    private static int[][] matrix;
    private static int numRows;
    private static int numCols;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayOptionsMenu();
            int choice = getUserChoice();
            processUserChoice(choice);
        }
    }

    private static void displayOptionsMenu() {
        System.out.println("Matrix Display Options Menu:");
        System.out.println("1. User Input Matrix");
        System.out.println("2. Random Matrix (0-9)");
        System.out.println("3. All Zeros Matrix");
        System.out.println("4. All Ones Matrix");
        System.out.println("5. Diagonal Matrix");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        int choice;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
            scanner.next(); // Clear the scanner's buffer
            choice = -1;
        }
        return choice;
    }

    private static void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                userInputMatrix();
                displayMatrix();
                break;
            case 2:
                randomMatrix();
                displayMatrix();
                break;
            case 3:
                allZerosMatrix();
                displayMatrix();
                break;
            case 4:
                allOnesMatrix();
                displayMatrix();
                break;
            case 5:
                diagonalMatrix();
                displayMatrix();
                break;
            case 0:
                System.out.println("Exiting program. Goodbye!");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void userInputMatrix() {
        do {
            System.out.print("Enter the number of rows (greater than 0): ");
            numRows = scanner.nextInt();
        } while (numRows <= 0);

        do {
            System.out.print("Enter the number of columns (greater than 0): ");
            numCols = scanner.nextInt();
        } while (numCols <= 0);

        matrix = new int[numRows][numCols];

        System.out.println("Enter matrix elements row-wise:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "," + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void randomMatrix() {
        userInputMatrix(); // Reuse userInputMatrix for common initialization
        Random random = new Random();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = random.nextInt(10); // Random number between 0 and 9
            }
        }
    }

    private static void allZerosMatrix() {
        userInputMatrix(); // Reuse userInputMatrix for common initialization
        // Matrix is already initialized, elements are 0 by default
    }

    private static void allOnesMatrix() {
        userInputMatrix(); // Reuse userInputMatrix for common initialization
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = 1;
            }
        }
    }

    private static void diagonalMatrix() {
        do {
            System.out.print("Enter the size of the square matrix (greater than 0): ");
            numRows = scanner.nextInt();
            numCols = numRows; // Ensure a square matrix
        } while (numRows <= 0);

        matrix = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            matrix[i][i] = 1; // Diagonal elements are set to 1
        }
    }

    private static void displayMatrix() {
        System.out.println("Matrix:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

