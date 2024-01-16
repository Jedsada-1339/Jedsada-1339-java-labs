package sirikhojornsombut.jedsada.lab6;

import java.util.Arrays;

// MonopolyGame class, a specific implementation of the Game abstract class
class MonopolyGame extends Game {
    // Instance variable to store game pieces
    String[] gamePieces;

    // Default constructor
    public MonopolyGame() {
        // Call the superclass (Game) constructor with default values
        super("Monopoly Game", 4);
        // Initialize the game pieces array with default values
        this.gamePieces = new String[]{"car", "top hat", "thimble", "boot"};
    }

    // Parameterized constructor with a specified array of game pieces
    public MonopolyGame(String[] gamePieces) {
        // Call the default constructor to set common attributes and initialize default game pieces
        this();
        // Set the specified game pieces array
        this.gamePieces = gamePieces;
        // Update the number of players based on the length of the game pieces array
        this.numOfPlayers = gamePieces.length;
    }

    // Getter and setter methods for the gamePieces attribute
    public String[] getGamePieces() {
        return gamePieces;
    }

    public void setGamePieces(String[] gamePieces) {
        this.gamePieces = gamePieces;
        // Update the number of players based on the length of the new game pieces array
        this.numOfPlayers = gamePieces.length;
    }

    // Implementation of the playGame() method from the Game abstract class
    @Override
    public void playGame() {
        // Implement the specific game logic for Monopoly Game
        System.out.println("Playing Monopoly Game");
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return super.toString() + ", MonopolyGame gamePieces=" + Arrays.toString(gamePieces);
    }
}
