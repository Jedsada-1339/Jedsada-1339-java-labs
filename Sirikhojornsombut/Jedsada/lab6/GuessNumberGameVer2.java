package sirikhojornsombut.jedsada.lab6;

// GuessNumberGameVer2 class, extending GuessNumberGameVer1 and implementing HasRule
public class GuessNumberGameVer2 extends GuessNumberGameVer1 implements HasRule {

    // Default constructor
    public GuessNumberGameVer2() {
        // Set the specific game name for GuessNumberGameVer2
        this.gameName = "GuessNumberGameVer2";
    }

    // Parameterized constructor with a specified range
    public GuessNumberGameVer2(int minNum, int maxNum) {
        // Call the default constructor to set common attributes
        this();
        // Set the specified minimum and maximum numbers
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    // Parameterized constructor with a specified range and maximum number of tries
    public GuessNumberGameVer2(int minNum, int maxNum, int maxTries) {
        // Call the parameterized constructor with range to set common attributes
        this(minNum, maxNum);
        // Set the specified maximum number of tries
        this.maxTries = maxTries;
    }

    // Override the playGame() method from the superclass (GuessNumberGameVer1)
    @Override
    public void playGame() {
        // Implement the specific game logic for GuessNumberGameVer2
        System.out.println("Playing Guess Number Game Ver 2");
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return super.toString();  // Call the toString() method of the superclass (GuessNumberGameVer1)
    }

    // Implementation of the gameRule() method from the HasRule interface
    @Override
    public void gameRule() {
        System.out.println("Guess Number Game Rule: ...");
    }
}
