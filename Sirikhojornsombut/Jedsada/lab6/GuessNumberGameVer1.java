package sirikhojornsombut.jedsada.lab6;

public class GuessNumberGameVer1 extends Game {
    int minNum;
    int maxNum;
    int maxTries;
    int correctNum;

    public GuessNumberGameVer1() {
        super("Guess Number Game", 1);
        this.minNum = 1;
        this.maxNum = 10;
        this.maxTries = 3;
        this.correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }

    public GuessNumberGameVer1(int minNum, int maxNum) {
        this();
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    public GuessNumberGameVer1(int minNum, int maxNum,int maxTries) {
        this();
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
    }

    // Getter and setter methods
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
    // playGame() method
    @Override
    public void playGame() {
        // Implement the game logic here
        System.out.println("Playing Guess Number Game");
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + ", " + gameName + "[minNum=" + minNum + ", maxNum=" + maxNum + ", correctNum=" + correctNum + ", maxTries=" + maxTries + "]";
    }
}
