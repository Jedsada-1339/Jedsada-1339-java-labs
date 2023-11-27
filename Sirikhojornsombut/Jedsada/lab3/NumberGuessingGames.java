package sirikhojornsombut.jedsada.lab3;

import java.util.Scanner;

public class NumberGuessingGames {
    static int answer, min, max, numberOfTries, maxTries;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        configure();
        genAnswer();
        playGame();
    }

    private static void configure() {
        System.out.print("Enter the min value:");
        min = input.nextInt();
        System.out.print("Enter the max value:");
        max = input.nextInt();
        System.out.print("Enter the maximum number of tries:");
        maxTries = input.nextInt();
    }

    private static void genAnswer() {
        answer = (min + (int) (Math.random() * ((max - min) + 1)));
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            

            System.out.println("Welcome to a number guessing game!");

            int numberOfTries = 0;
            int check = 0;

            while (numberOfTries < maxTries) {
                System.out.print("Enter an integer between " + min + " and " + max + ":");
                int guess = scanner.nextInt();

                if (guess == answer) {
                    System.out.println("Congratulations!.");
                    numberOfTries++;
                    check++;
                    break;
                } else if (guess < min || guess > max) {
                    System.out.println("Enter an integer between " + min + " and " + max + ":");
                } else {
                    if (guess < answer) {
                        System.out.println("Try a higher number!");
                    } else {
                        System.out.println("Try a lower number!");
                    }
                }

                numberOfTries++;
            }

            if (check == 0) {
                System.out.println("You have tried " + numberOfTries + " times. " + "You ran out of guesses");
                System.out.println("The answer is " + answer);
            } else {
                if (numberOfTries == 1) {
                    System.out.println("You have tried " + numberOfTries + " time.");
                } else {
                    System.out.println("You have tried " + numberOfTries + " times.");
                }
            }

            System.out.print("want to play again? (Y or y):");
            playAgain = scanner.next().toLowerCase();

        } while (playAgain.equals("y"));

        System.out.println("Thank you for playing our games. Bye!");
        scanner.close();
    }
}
