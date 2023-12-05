package sirikhojornsombut.jedsada.lab4;

import java.util.Scanner;

public class MatrixDisplay {

    private static int[][] matrix;
    private static int numRows;
    private static int numCols;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inputMatrix();
        displayMatrix();
    }

    private static void inputMatrix() {
        do {
            System.out.print("Enter the number of rows (greater than 0): ");
            numRows = scanner.nextInt();
        } while (numRows <= 0);

        do {
            System.out.print("Enter the number of columns (greater than 0): ");
            numCols = scanner.nextInt();
        } while (numCols <= 0);

        // Initialize matrix based on dimensions
        matrix = new int[numRows][numCols];

        // Input matrix elements
        System.out.println("Enter matrix elements row-wise:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "," + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method for displaying the matrix
    private static void displayMatrix() {
        System.out.println("Matrix:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
