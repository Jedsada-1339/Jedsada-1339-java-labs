package sirikhojornsombut.jedsada.lab4;

import java.util.Scanner;

public class GuessNumberGameV3 {
    static int answer, min, max, maxTries;
    static Scanner input = new Scanner(System.in);
    static int[] guesses;
    static int validGuessCount;

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
        guesses = new int[maxTries];
        validGuessCount = 0;
    }

    private static void genAnswer() {
        answer = (min + (int) (Math.random() * ((max - min) + 1)));
    }

    private static void playGame() {
        String playAgain;
        int check = 0;
        int Total_game_played = 0;
        int Total_game_win = 0;
        int numberOfTriescal = 0;

        do {
            System.out.println("Welcome to a number guessing game!");

            int numberOfTries = 0;

            while (numberOfTries < maxTries) {
                System.out.print("Enter an integer between " + min + " and " + max + ":");
                int guess = input.nextInt();

                guesses[numberOfTries] = guess;
                validGuessCount++;

                if (guess == answer) {
                    System.out.println("Congratulations!");
                    numberOfTries++;
                    numberOfTriescal++;
                    Total_game_win++;
                    check++;
                    break;
                } else if (guess < min || guess > max) {
                    System.out.println("Enter an integer between " + min + " and " + max + ":");
                    continue;
                } else {
                    if (guess < answer) {
                        System.out.println("Try a higher number!");
                    } else {
                        System.out.println("Try a lower number!");
                    }
                }
                numberOfTries++;
                numberOfTriescal++;
            }

            if (check == 0) {
                System.out.println("You ran out of guesses"+"The answer is " + answer);
                Total_game_played++;
            } else {
                if (numberOfTries == 1) {
                    System.out.println("You have tried " + numberOfTries + " time.");
                } else {
                    System.out.println("You have tried " + numberOfTries + " times.");
                }
                Total_game_played++;
            }

            displayReviewOptions();

            System.out.print("Want to play again? (Y or y):");
            playAgain = input.next().toLowerCase();
            check = 0;
            genAnswer();

        } while (playAgain.equals("y"));

        float Win_rate = Total_game_win/Total_game_played;
        System.out.println("----Game Statistics----");
        System.out.println("Total game played: "+Total_game_played);
        System.out.println("Total win: "+Total_game_win);
        System.out.println("Win rate: "+((Win_rate)*100)+" %");
        System.out.println("Average guess per game: "+ (numberOfTriescal)%Total_game_played);
        input.close();
    }

    private static void displayReviewOptions() {
        System.out.println("Enter 'a' to list all guesses, 'g' for specific guess, or any other key to quit: ");
        char option = input.next().charAt(0);

        switch (option) {
            case 'a':
                displayAllGuesses();
                break;
            case 'g':
                viewSpecificGuess();
                break;
            default:
                break;
        }
    }

    private static void displayAllGuesses() {
        System.out.println("All Guesses:");
        for (int i = 0; i < validGuessCount; i++) {
            System.out.print(guesses[i]+" ");
        }
        System.out.println("");
        displayReviewOptions();
    }

    private static void viewSpecificGuess() {
        System.out.print("Enter the guess number to view: ");
        int guessNumber = input.nextInt();

        if (guessNumber >= 1 && guessNumber <= validGuessCount) {
            System.out.println("Guess " + guessNumber + ": " + guesses[guessNumber - 1]);
        } else {
            System.out.println("Invalid guess number.");
        }
        displayReviewOptions();
    }
}
