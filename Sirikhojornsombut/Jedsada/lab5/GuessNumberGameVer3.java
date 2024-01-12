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

    public static void main(String[] args) {
        GuessNumberGameVer3 game = new GuessNumberGameVer3(1, 100, 5);
        game.playGames();

        // Test guessAverage(), guessMin(), and guessMax()
        Scanner scanner = new Scanner(System.in);
        char command;
        do {
            System.out.print("Enter command ('v' for average, 'm' for minimum, 'x' for maximum, 'q' to quit): ");
            command = scanner.next().charAt(0);

            switch (Character.toLowerCase(command)) {
                case 'v':
                    System.out.println("Average of guesses: " + game.guessAverage());
                    break;
                case 'm':
                    int min = game.guessMin();
                    System.out.println(min == -1 ? "No guesses yet" : "Minimum guess: " + min);
                    break;
                case 'x':
                    int max = game.guessMax();
                    System.out.println(max == -1 ? "No guesses yet" : "Maximum guess: " + max);
                    break;
                case 'q':
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command. Please enter 'v', 'm', 'x', or 'q'.");
            }

        } while (Character.toLowerCase(command) != 'q');
    }

    // Override toString() method for testing
    @Override
    public String toString() {
        return "GuessNumberGameVer3{" +
                "minNum=" + minNum +
                ", maxNum=" + maxNum +
                ", maxTries=" + maxTries +
                ", correctNum=" + correctNum +
                ", guesses=" + Arrays.toString(guesses) +
                ", numGuesses=" + numGuesses +
                '}';
    }
}

