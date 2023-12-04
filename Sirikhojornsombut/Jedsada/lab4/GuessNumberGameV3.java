package sirikhojornsombut.jedsada.lab4;

import java.util.Scanner;

public class GuessNumberGameV3 {
    static int answer, min, max, maxAttempts;
    static Scanner input = new Scanner(System.in);
    static int[] guesses;
    static int validGuessCount;
    static int totalGamesPlayed = 0;
    static int totalGamesWon = 0;
    static int totalGuesses = 0;
    static int highScore = Integer.MAX_VALUE; // Initialize with a large value

    public static void main(String[] args) {
        configure();

        do {
            genAnswer();
            playGame();
            updateStatistics();

            System.out.print("Want to play again? (Y or y): ");
        } while (input.next().equalsIgnoreCase("y"));

        displayStatistics();
        input.close();
    }

    private static void configure() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Enter the min value: ");
        min = input.nextInt();
        System.out.print("Enter the max value: ");
        max = input.nextInt();

        // Check if min is less than max
        while (min >= max) {
            System.out.println("Invalid input. Min must be less than max.");
            System.out.print("Enter the min value: ");
            min = input.nextInt();
            System.out.print("Enter the max value: ");
            max = input.nextInt();
        }

        System.out.print("Enter the maximum number of tries: ");
        maxAttempts = input.nextInt();

        // Check if maxAttempts is greater than 0
        while (maxAttempts <= 0) {
            System.out.println("Invalid input. Number of tries must be greater than 0.");
            System.out.print("Enter the maximum number of tries: ");
            maxAttempts = input.nextInt();
        }

        guesses = new int[maxAttempts];
        validGuessCount = 0;
    }

    private static void genAnswer() {
        answer = (min + (int) (Math.random() * ((max - min) + 1)));
    }

    private static void playGame() {
        int numberOfTries = 0;

        System.out.println("Try to guess the number between " + min + " and " + max + ".");

        while (numberOfTries < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            guesses[numberOfTries] = guess;
            validGuessCount++;

            // Check if the guess is within the valid range
            while (guess < min || guess > max) {
                System.out.print("Your guess should be in the range " + min + " and " + max + ": ");
                guess = input.nextInt();
            }

            totalGuesses++;

            if (guess == answer) {
                System.out.println("Congratulations! You guessed the correct number.");
                totalGamesWon++;
                break;
            } else {
                if (guess < answer) {
                    System.out.println("Try a higher number!");
                } else {
                    System.out.println("Try a lower number!");
                }
            }

            numberOfTries++;
        }

        if (numberOfTries == maxAttempts) {
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + answer);
        }
    }

    private static void updateStatistics() {
        totalGamesPlayed++;

        if (validGuessCount < highScore) {
            highScore = validGuessCount;
        }
    }

    private static void displayStatistics() {
        System.out.println("---- Game Statistics ----");
        System.out.println("Total games played: " + totalGamesPlayed);
        System.out.println("Total games won: " + totalGamesWon);
        System.out.println("Win rate: " + ((float) totalGamesWon / totalGamesPlayed) * 100 + "%");
        System.out.println("Average guesses per game: " + (float) totalGuesses / totalGamesPlayed);
        System.out.println("High score: " + (highScore == Integer.MAX_VALUE ? "N/A" : highScore));
    }
}
