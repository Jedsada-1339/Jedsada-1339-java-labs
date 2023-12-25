package sirikhojornsombut.jedsada.lab5;

import java.util.Scanner;

public class GuessNumberGameVer1 {
    protected int minNum;
    protected int maxNum;
    protected int correctNum;
    protected int maxTries;
    protected static int numOfGames = 0;

    public static void main(String[] args) {
        testConstructors();
    }

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
                if (guess < correctNum) {
                    System.out.println("Try a higher number!");
                } else {
                    System.out.println("Try a lower number!");
                }
            }

            numberOfTries++;
        }

        if (numberOfTries == maxTries) {
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + correctNum);
        }

        //scanner.close();
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
        return "GuessNumberGameVer1 minNum= " + minNum + " maxNum= " + maxNum +  " maxTries=" + maxTries ;
    }

    public static void testPart1() {
        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        gng1.playGame();
        System.out.println("There are " + GuessNumberGameVer1.getNumOfGames() + " games");
        gng1.setMinNum(2);
        gng1.setMaxNum(5);
        gng1.setMaxTries(2);
        System.out.println(
                "Min = " + gng1.getMinNum() + " Max = " + gng1.getMaxNum() + " Max tries = " + gng1.getMaxTries());
        gng1.playGame();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1();
        System.out.println("Min = " + gng2.getMinNum() + " Max = " + gng2.getMaxNum() + " Max tries = " + gng2.getMaxTries());
        System.out.println("There are " + GuessNumberGameVer1.getNumOfGames() + " games");
    }

    public static void testConstructors() {
        GuessNumberGameVer1 gng1 = new GuessNumberGameVer1();
        GuessNumberGameVer1 gng2 = new GuessNumberGameVer1(5, 10);
        GuessNumberGameVer1 gng3 = new GuessNumberGameVer1(10, 20, 5);
        System.out.println(gng1);
        gng1.playGame();
        System.out.println(gng2);
        gng2.playGame();
        System.out.println(gng3);
        gng3.playGame();
        System.out.println("There are " + GuessNumberGameVer1.getNumOfGames() + " games");
    }
}
