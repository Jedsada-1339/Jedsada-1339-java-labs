package sirikhojornsombut.jedsada.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberGameVer3 extends GuessNumberGameVer2 {

    public GuessNumberGameVer3() {
        super();
    }

    public GuessNumberGameVer3(int minNum, int maxNum) {
        super(minNum, maxNum);
    }

    public GuessNumberGameVer3(int minNum, int maxNum, int maxTries) {
        super(minNum, maxNum, maxTries);
    }

    public double guessAverage() {
        if (numGuesses == 0) {
            return 0.0;  // Avoid division by zero
        }
        int sum = 0;
        for (int i = 0; i < numGuesses; i++) {
            sum += guesses[i];
        }
        return (double) sum / numGuesses;
    }

    public int guessMin() {
        if (numGuesses == 0) {
            return -1;  // Indicate that there are no guesses
        }
        int min = guesses[0];
        for (int i = 1; i < numGuesses; i++) {
            if (guesses[i] < min) {
                min = guesses[i];
            }
        }
        return min;
    }

    public int guessMax() {
        if (numGuesses == 0) {
            return -1;  // Indicate that there are no guesses
        }
        int max = guesses[0];
        for (int i = 1; i < numGuesses; i++) {
            if (guesses[i] > max) {
                max = guesses[i];
            }
        }
        return max;
    }

    public void playGames() {
        playGame();
        // Test guessAverage(), guessMin(), and guessMax()
        Scanner scanner = new Scanner(System.in);
        char command;
        do {
            System.out.println("Do you want to play again type 'y' to continue or 'q' to quit");
            System.out.println("type 'g' to see specific guess,type 'a' to see all guees");
            System.out.println("type 'v' for average, type 'm' for minimum, type 'x' for maximum");
            command = scanner.next().charAt(0);

            switch (Character.toLowerCase(command)) {
                case 'y':
                    playGame();
                    break;
                case 'g':
                    showSpecific();
                    break;
                case 'a':
                    showGuesses();
                    break;
                case 'v':
                    System.out.println("Average of guesses: " + guessAverage());
                    break;
                case 'm':
                    int min = guessMin();
                    System.out.println(min == -1 ? "No guesses yet" : "Minimum guess: " + min);
                    break;
                case 'x':
                    int max = guessMax();
                    System.out.println(max == -1 ? "No guesses yet" : "Maximum guess: " + max);
                    break;
                case 'q':
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command.");
            }

        } while (Character.toLowerCase(command) != 'q');
    }

    // Override toString() method for testing
    @Override
    public String toString() {
        return "GuessNumberGameVer3 " +
                "minNum=" + minNum +
                ", maxNum=" + maxNum +
                ", maxTries=" + maxTries;
    }
}

