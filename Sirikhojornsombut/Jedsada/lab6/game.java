package sirikhojornsombut.jedsada.lab6;

// Abstract class Game
public abstract class Game {
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


