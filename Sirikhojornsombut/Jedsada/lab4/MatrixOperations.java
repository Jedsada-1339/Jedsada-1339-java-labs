package sirikhojornsombut.jedsada.lab4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    private static int[][] matrix;
    private static int numRows;
    private static int numCols;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMatrixCreationMenu();
            int creationChoice = getUserChoice();

            if (creationChoice == 0) {
                System.out.println("Exiting program. Goodbye!");
                scanner.close();
                System.exit(0);
            }

            createMatrix(creationChoice);
            displayMatrix();

            while (true) {
                displayMatrixOperationsMenu();
                int operationChoice = getUserChoice();
                processMatrixOperation(operationChoice);

                System.out.print("Do you want to perform another operation? (1 for Yes, 0 for No): ");
                int continueChoice = getUserChoice();
                if (continueChoice == 0) {
                    break;
                }
            }
        }
    }

    private static void displayMatrixCreationMenu() {
        System.out.println("Matrix Creation Menu:");
        System.out.println("1. User Input Matrix");
        System.out.println("2. Random Matrix (0-9)");
        System.out.println("3. All Zeros Matrix");
        System.out.println("4. All Ones Matrix");
        System.out.println("5. Diagonal Matrix");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayMatrixOperationsMenu() {
        System.out.println("Matrix Operations Menu:");
        System.out.println("1. Transpose Matrix");
        System.out.println("2. Rows and Columns Sum");
        System.out.println("3. Find Minimum and Maximum value");
        System.out.println("4. Display Diagonal value");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void createMatrix(int choice) {
        switch (choice) {
            case 1:
                userInputMatrix();
                break;
            case 2:
                randomMatrix();
                break;
            case 3:
                allZerosMatrix();
                break;
            case 4:
                allOnesMatrix();
                break;
            case 5:
                diagonalMatrix();
                break;
            default:
                System.out.println("Invalid choice for matrix creation.");
        }
    }

    private static void processMatrixOperation(int choice) {
        switch (choice) {
            case 1:
                displayMatrixTranspose();
                break;
            case 2:
                calculateAndDisplaySum();
                break;
            case 3:
                findAndDisplayMinMax();
                break;
            case 4:
                displayDiagonalElements();
                break;
            case 0:
                return; // Return to Matrix Creation Menu
            default:
                System.out.println("Invalid choice for matrix operation. Please try again.");
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

    private static void displayMatrixTranspose() {
        System.out.println("Transpose of the Matrix:");
        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void calculateAndDisplaySum() {
        int[] rowSum = new int[numRows];
        int[] colSum = new int[numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }

        System.out.println("Sum of Rows:");
        for (int i = 0; i < numRows; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSum[i]);
        }

        System.out.println("Sum of Columns:");
        for (int j = 0; j < numCols; j++) {
            System.out.print("Col " + (j + 1) + ": " + colSum[j] + "\t");
        }
        System.out.println();
    }

    private static void findAndDisplayMinMax() {
        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }

    private static void displayDiagonalElements() {
        System.out.println("Diagonal Elements:");
        for (int i = 0; i < numRows; i++) {
            System.out.print(matrix[i][i] + "\t");
        }
        System.out.println();
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
}
