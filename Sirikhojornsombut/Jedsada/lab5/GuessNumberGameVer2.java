package sirikhojornsombut.jedsada.lab5;

import java.util.Scanner;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 {
    protected static final int MAX_GUESSES = 20;
    protected int[] guesses;
    protected int numGuesses;

    public GuessNumberGameVer2() {
        super();
        guesses = new int[MAX_GUESSES];
        numGuesses = 0;
    }

    public GuessNumberGameVer2(int minNum, int maxNum) {
        super(minNum, maxNum);
        guesses = new int[MAX_GUESSES];
        numGuesses = 0;
    }

    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
        guesses = new int[MAX_GUESSES];
        numGuesses = 0;
    }

    @Override
    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (numGuesses < MAX_GUESSES) {
            System.out.print("Enter an integer between " + getMinNum() + " and " + getMaxNum() + ":");
            int guess = scanner.nextInt();

            if (guess < getMinNum() || guess > getMaxNum()) {
                System.out.println("Your guess should be in " + getMinNum() + " and " + getMaxNum() + ".");
                continue;
            }

            guesses[numGuesses] = guess;
            numGuesses++;

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

        if (numGuesses == MAX_GUESSES) {
            System.out.println("Maximum number of guesses reached. The correct answer was " + correctNum);
        }

        //scanner.close();
    }

    public void showSpecific(int position) {
        if (position >= 0 && position < numGuesses) {
            System.out.println("Guess at position " + position + ": " + guesses[position-1]);
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void showGuesses() {
        System.out.println("List of guesses:");
        for (int i = 0; i < numGuesses; i++) {
            System.out.println("Guess at position " + i + ": " + guesses[i]);
        }
    }

    public void playGames() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            playGame();
            System.out.println("Enter 'p' to play, 's' to show specific guess, 'a' to show all guesses, or 'q' to quit:");
            char choice = scanner.next().charAt(0);

            switch (Character.toLowerCase(choice)) {
                case 'p':
                    playGame();
                    break;
                case 's':
                    System.out.print("Enter the position to show: ");
                    int position = scanner.nextInt();
                    showSpecific(position);
                    break;
                case 'a':
                    showGuesses();
                    break;
                case 'q':
                    System.out.println("Quitting the game. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
