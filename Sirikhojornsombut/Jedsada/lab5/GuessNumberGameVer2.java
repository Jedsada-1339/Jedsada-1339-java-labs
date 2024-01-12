package sirikhojornsombut.jedsada.lab5;

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 {
    protected static final int MAX_GUESSES = 20;
    protected int[] guesses;
    protected int numGuesses;

    public GuessNumberGameVer2() {
        super();
        this.guesses = new int[MAX_GUESSES];
        this.numGuesses = 0;
    }

    public GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum);
        this.guesses = new int[MAX_GUESSES];
        this.numGuesses = 0;
    }

    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        this.guesses = new int[MAX_GUESSES];
        this.numGuesses = 0;
    }

    @Override
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;

        while (numberOfTries < maxTries) {
            System.out.print("Enter an integer between " + minNum + " and " + maxNum + ":");
            int guess = scanner.nextInt();

            if (isValidGuess(guess)) {
                guesses[numGuesses++] = guess;

                if (guess == correctNum) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else {
                    if (guess < correctNum) {
                        System.out.println("Try a higher number!");
                    } else {
                        System.out.println("Try a lower number!");
                    }
                }
                numberOfTries++;
            } else {
                System.out.println("Invalid guess. Please enter a number within the valid range.");
            }
        }

        if (numberOfTries == maxTries) {
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + correctNum);
        }

        //scanner.close();
    }

    public void showSpecific() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position to show the guess: ");
        int position = scanner.nextInt();

        if (position >= 0 && position < numGuesses) {
            System.out.println("Guess at position " + position + ": " + guesses[position]);
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void showGuesses() {
        System.out.println("List of guesses:");
        for (int i = 0; i < numGuesses; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();
    }

    public void playGames() {
        System.out.println("Welcome to a number guessing game!");
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            playGame();
            System.out.println("Do you want to play again type 'y' to continue or 'q' to quit");
            System.out.println("type 'g' to see specific guess,type 'a' to see all guees");
            choice = scanner.next().charAt(0);

            switch (Character.toLowerCase(choice)) {
                case 'y':
                    playGame();
                    break;
                case 'g':
                    showSpecific();
                    break;
                case 'a':
                    showGuesses();
                    break;
                case 'q':
                    System.out.println("Exiting the game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (Character.toLowerCase(choice) != 'q');
    }

    public boolean isValidGuess(int guess) {
        return guess >= minNum && guess <= maxNum;
    }
}
