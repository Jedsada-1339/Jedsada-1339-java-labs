package sirikhojornsombut.jedsada.lab6;

// RockPaperScissor class, a specific implementation of the Game abstract class
public class RockPaperScissor extends Game {
    // Instance variables to store player choices
    String player1Choice;
    String player2Choice;

    // Default constructor
    public RockPaperScissor() {
        // Call the superclass (Game) constructor with default values
        super("Rock Paper Scissor Game", 2);
        // Set default choices for players
        this.player1Choice = "rock";
        this.player2Choice = "rock";
    }

    // Parameterized constructor with specified choices for both players
    public RockPaperScissor(String player1Choice, String player2Choice) {
        // Call the default constructor to set common attributes
        this();
        // Set the specified choices for players
        this.player1Choice = player1Choice;
        this.player2Choice = player2Choice;
    }

    // Getter and setter methods for player choices
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

    // Implementation of the playGame() method from the Game abstract class
    @Override
    public void playGame() {
        // Implement the specific game logic for Rock Paper Scissor Game
        System.out.println("Playing Rock Paper Scissor Game");
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return super.toString() + ", RockPaperScissorGame player1Choice=" + player1Choice + ", player2Choice=" + player2Choice;
    }
}
