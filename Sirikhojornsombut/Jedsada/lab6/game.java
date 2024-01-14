package sirikhojornsombut.jedsada.lab6;

import java.util.Arrays;
// Abstract class Game
abstract class Game {
    protected String gameName;
    protected int numOfPlayers;

    // Constructors
    public Game() {
        this.gameName = "unknown game";
        this.numOfPlayers = 0;
    }

    public Game(String gameName, int numOfPlayers) {
        this.gameName = gameName;
        this.numOfPlayers = numOfPlayers;
    }

    // Getter and setter methods
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    // Abstract method
    public abstract void playGame();

    // toString() method
    @Override
    public String toString() {
        return "Game [gameName=" + gameName + ", numOfPlayers=" + numOfPlayers + "]";
    }
}

// GuessNumberGameVer1 class
class GuessNumberGameVer1 extends Game {
    private int minNum;
    private int maxNum;
    private int maxTries;
    private int correctNum;

    // Constructors
    public GuessNumberGameVer1() {
        super("Guess Number Game", 1);
        this.correctNum = 3;
        this.minNum = 1;
        this.maxNum = 10;
        this.maxTries = 3;
    }

    public GuessNumberGameVer1(int minNum, int maxNum) {
        this();
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    public GuessNumberGameVer1(int minNum, int maxNum,int correctNum ,int maxTries) {
        this(minNum, maxNum);
        this.maxTries = maxTries;
        this.correctNum = correctNum;
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

    public void setCorrectNum(int correctNum) {
        this.correctNum = correctNum;
    }

    public int getCorrectNum() {
        return correctNum;
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
        return super.toString() + ", GuessNumberGameVer1 [minNum=" + minNum + ", maxNum=" + maxNum + ", correctNum=" + correctNum + ", maxTries=" + maxTries + "]";
    }
}

// RockPaperScissorGame class
class RockPaperScissorGame extends Game {
    private String player1Choice;
    private String player2Choice;

    // Constructors
    public RockPaperScissorGame() {
        super("Rock Paper Scissor Game", 2);
        this.player1Choice = "rock";
        this.player2Choice = "rock";
    }

    public RockPaperScissorGame(String player1Choice, String player2Choice) {
        this();
        this.player1Choice = player1Choice;
        this.player2Choice = player2Choice;
    }

    // Getter and setter methods
    public String getPlayer1Choice() {
        return player1Choice;
    }

    public void setPlayer1Choice(String player1Choice) {
        this.player1Choice = player1Choice;
    }

    public String getPlayer2Choice() {
        return player2Choice;
    }

    public void setPlayer2Choice(String player2Choice) {
        this.player2Choice = player2Choice;
    }

    // playGame() method
    @Override
    public void playGame() {
        // Implement the game logic here
        System.out.println("Playing Rock Paper Scissor Game");
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + ", RockPaperScissorGame [player1Choice=" + player1Choice + ", player2Choice=" + player2Choice + "]";
    }
}

// MonopolyGame class
class MonopolyGame extends Game {
    private String[] gamePieces;

    // Constructors
    public MonopolyGame() {
        super("Monopoly Game", 4);
        this.gamePieces = new String[]{"car", "top hat", "thimble", "boot"};
    }

    public MonopolyGame(String[] gamePieces) {
        this();
        this.gamePieces = gamePieces;
        this.numOfPlayers = gamePieces.length;
    }

    // Getter and setter methods
    public String[] getGamePieces() {
        return gamePieces;
    }

    public void setGamePieces(String[] gamePieces) {
        this.gamePieces = gamePieces;
    }

    // playGame() method
    @Override
    public void playGame() {
        // Implement the game logic here
        System.out.println("Playing Monopoly Game");
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + ", MonopolyGame [gamePieces=" + Arrays.toString(gamePieces) + "]";
    }
}

