package sirikhojornsombut.jedsada.lab6;

// Abstract class Game
public abstract class Game {
    // Instance variables to store game name and number of players
    protected String gameName;
    protected int numOfPlayers;

    // Constructors

    // Default constructor
    public Game() {
        this.gameName = "unknown game";
        this.numOfPlayers = 0;
    }

    // Parameterized constructor
    public Game(String gameName, int numOfPlayers) {
        this.gameName = gameName;
        this.numOfPlayers = numOfPlayers;
    }

    // Getter and setter methods

    // Get the game name
    public String getGameName() {
        return gameName;
    }

    // Set the game name
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    // Get the number of players
    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    // Set the number of players
    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    // Abstract method to be implemented by subclasses
    public abstract void playGame();

    // toString() method to provide a string representation of the object

    @Override
    public String toString() {
        return "[gameName=" + gameName + ", numOfPlayers=" + numOfPlayers + "]";
    }
}
