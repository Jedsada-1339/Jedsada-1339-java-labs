package sirikhojornsombut.jedsada.lab6;

// Define an abstract class CardGame that extends Game
public abstract class CardGame extends Game {
    // Declare an instance variable to store the number of cards per player
    int numOfCardPerPlayer;

    // Default constructor initializes numOfCardPerPlayer to 0
    public CardGame() {
        this.numOfCardPerPlayer = 0;
    }

    // Parameterized constructor allows setting the initial numOfCardPerPlayer
    public CardGame(int numOfCardPerPlayer) {
        this.numOfCardPerPlayer = numOfCardPerPlayer;
    }

    // Getter method to retrieve the number of cards per player
    public int getNumOfCardPerPlayer() {
        return numOfCardPerPlayer;
    }

    // Setter method to set the number of cards per player
    public void setNumOfCardPerPlayer(int numOfCardPerPlayer) {
        this.numOfCardPerPlayer = numOfCardPerPlayer;
    }

    // Override the toString method to include information about numOfCardPerPlayer
    @Override
    public String toString() {
        return super.toString() + "{" + "numOfCardPerPlayer=" + "'" + numOfCardPerPlayer + "'" + "}";
    }

    // Declare an abstract method playGame, which will be implemented by subclasses
    public abstract void playGame();
}
