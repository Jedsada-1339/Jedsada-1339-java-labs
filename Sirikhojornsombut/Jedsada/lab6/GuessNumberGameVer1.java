package sirikhojornsombut.jedsada.lab6;

// GuessNumberGameVer1 class, a specific implementation of the Game abstract class
public class GuessNumberGameVer1 extends Game {
    // Instance variables specific to GuessNumberGameVer1
    int minNum;
    int maxNum;
    int maxTries;
    int correctNum;

    // Default constructor
    public GuessNumberGameVer1() {
        // Call the superclass (Game) constructor with default values and set additional attributes
        super("Guess Number Game", 1);
        this.minNum = 1;
        this.maxNum = 10;
        this.maxTries = 3;
        // Generate a random correct number within the specified range
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }

    // Parameterized constructor with a specified range
    public GuessNumberGameVer1(int minNum, int maxNum) {
        // Call the default constructor to set common attributes
        this();
        // Set the specified minimum and maximum numbers
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    // Parameterized constructor with a specified range and maximum number of tries
    public GuessNumberGameVer1(int minNum, int maxNum, int maxTries) {
        // Call the default constructor to set common attributes
        this();
        // Set the specified minimum and maximum numbers and maximum number of tries
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
    }

    // Getter and setter methods for specific attributes
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

    // Implementation of the playGame() method from the Game abstract class
    @Override
    public void playGame() {
        // Implement the game logic here
        System.out.println("Playing Guess Number Game");
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return super.toString() + ", " + gameName + "[minNum=" + minNum + ", maxNum=" + maxNum + ", correctNum=" + correctNum + ", maxTries=" + maxTries + "]";
    }
}
