package Sirikhojornsombut.Jedsada.lab3;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        playGame(); 
    }

    private static void playGame() {
        System.out.println("Welcome to a number guessing game!");
        Random random = new Random();
        int answer = random.nextInt(20) + 1;

        Scanner scanner = new Scanner(System.in);

        /*
         * จำนวนที่สามารถลองเดาตัวเลขได้
         */
        int numberOfTries = 0;
        final int maxTries = 5;


        /*
         * ตัว loop ถาม User
         */
        while (numberOfTries < maxTries) {
            System.out.print("Enter an integer between 1 and 20:  ");
            int guess = scanner.nextInt();

            /*
             * เงื่อนไขเช็คคำตอบ
             */
            if (guess == answer) {
                System.out.println("Congratulations!.");
                break;
            } else if (guess < 1 || guess > 20) {
                System.out.println("Enter an integer between 1 and 20: ");
            } else {
                if (guess < answer) {
                    System.out.println("Try a higher number!");
                } else {
                    System.out.println("Try a lower number!");
                }
            }

            numberOfTries++;
        }
        

        System.out.println("You have tried " + numberOfTries + " times.");

        scanner.close();
    }
}
