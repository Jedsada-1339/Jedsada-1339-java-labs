package sirikhojornsombut.jedsada.lab5;

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 {
    protected static final int MAX_GUESSES = 20;
    protected int[] guesses;
    protected int numGuesses;

    public GuessNumberGameVer2() {
        super(); // Call the default constructor of the superclass
        guesses = new int[MAX_GUESSES];
        numGuesses = 0;
    }

    public GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum); // Call the constructor with two parameters of the superclass
        guesses = new int[MAX_GUESSES];
        numGuesses = 0;
    }

    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries); // Call the constructor with three parameters of the superclass
        guesses = new int[MAX_GUESSES];
        numGuesses = 0;
    }

    @Override
    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (numGuesses < maxTries) {
            System.out.print("Enter an integer between " + minNum + " and " + maxNum + ": ");
            int guess = scanner.nextInt();

            if (guess < minNum || guess > maxNum) {
                System.out.println("Your guess should be in the range " + minNum + " and " + maxNum + ".");
                continue;
            }

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
        }

        if (numGuesses == maxTries) {
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + correctNum);
        }

        // Close the scanner
        scanner.close();
    }

    public void showSpecific() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position to show: ");
        int position = scanner.nextInt();

        if (position >= 0 && position < numGuesses) {
            System.out.println("Guess at position " + position + ": " + guesses[position]);
        } else {
            System.out.println("Invalid position. Please enter a position between 0 and " + (numGuesses - 1) + ".");
        }
    }

    public void showGuesses() {
        System.out.println("List of guesses:");
        for (int i = 0; i < numGuesses; i++) {
            System.out.println("Guess " + i + ": " + guesses[i]);
        }
    }

    public void playGames() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 'q' to quit, 'g' to show specific guess, 'a' to show all guesses:");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'q':
                    System.out.println("Quitting the game.");
                    scanner.close();
                    return;
                case 'g':
                    showSpecific();
                    break;
                case 'a':
                    showGuesses();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 'q', 'g', or 'a'.");
            }
        }
    }
}
