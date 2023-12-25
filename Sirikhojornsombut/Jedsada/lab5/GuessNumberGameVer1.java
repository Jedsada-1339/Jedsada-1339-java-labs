package sirikhojornsombut.jedsada.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGames = 0;

    // Constructors for Part 1
    public GuessNumberGameVer1() {
        this.minNum = 1;
        this.maxNum = 10;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGames++;
    }

    // Part 2 Constructors
    public GuessNumberGameVer1(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = 3;
        numOfGames++;
    }

    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        this.maxTries = maxTries;
        numOfGames++;
    }

    // Play game method
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 0;

        System.out.println("Guess a number between " + minNum + " and " + maxNum + ".");

        while (numberOfTries < maxTries) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == correctNum) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else {
                System.out.println("Incorrect guess. Try again!");
            }

            numberOfTries++;
        }

        if (numberOfTries == maxTries) {
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + correctNum);
        }

        scanner.close();
    }

    // Getters and setters for Part 1
    public int getMinNum() {
        return minNum;
    }

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public int getMaxTries() {
        return maxTries;
    }

    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;
    }

    // Getters for numOfGames
    public static int getNumOfGames() {
        return numOfGames;
    }

    // Override toString method for Part 2
    @Override
    public String toString() {
        return "GuessNumberGameVer1 [minNum=" + minNum + ", maxNum=" + maxNum + ", correctNum=" + correctNum
                + ", maxTries=" + maxTries + "]";
    }
}
