package Sirikhojornsombut.Jedsada.lab3;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingMethodGame {

    private static int answer; 

    public static void main(String[] args) {
        genAnswer(); 
        playGame();
    }

    private static void genAnswer() {

        Random random = new Random();
        answer = random.nextInt(20) + 1;
    }

    private static void playGame() {

        Scanner scanner = new Scanner(System.in);

        int numberOfTries = 0;
        final int maxTries = 5;

        while (numberOfTries < maxTries) {

            System.out.print("Enter an integer between 1 and 20:  ");
            int guess = scanner.nextInt();


            if (guess == answer) {
                System.out.println("Congratulations! You guessed the correct number.");
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
