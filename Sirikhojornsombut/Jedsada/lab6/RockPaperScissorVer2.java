package sirikhojornsombut.jedsada.lab6;

// RockPaperScissorVer2 class, extending RockPaperScissor and implementing HasRule
public class RockPaperScissorVer2 extends RockPaperScissor implements HasRule {

    // Default constructor
    public RockPaperScissorVer2() {
        // Call the default constructor of the superclass (RockPaperScissor)
        super();
    }

    // Parameterized constructor with specified choices for both players
    public RockPaperScissorVer2(String player1Choice, String player2Choice) {
        // Call the default constructor to set common attributes
        this();
        // Set the specified choices for players
        this.player1Choice = player1Choice;
        this.player2Choice = player2Choice;
    }

    // Override the playGame() method from the superclass (RockPaperScissor)
    @Override
    public void playGame() {
        // Implement the specific game logic for Rock Paper Scissor Game Ver 2
        System.out.println("Playing Rock Paper Scissor Game Ver 2");
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return "Game [gameName=" + gameName + ", numOfPlayers=" + numOfPlayers + "]";
    }

    // Implementation of the gameRule() method from the HasRule interface
    @Override
    public void gameRule() {
        System.out.println("RockPaperScissor Rule: ...");
    }
}
