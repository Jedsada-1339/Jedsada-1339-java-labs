package sirikhojornsombut.jedsada.lab6;

// PokerGame class, extending CardGame and implementing HasRule
public class PokerGame extends CardGame implements HasRule {

    // Default constructor
    public PokerGame() {
        // Call the constructor of the superclass (CardGame) with a parameter
        super(5);
        // Set specific values for Poker Game
        this.gameName = "Poker Game";
        this.numOfPlayers = 5;
    }

    // Parameterized constructor with a specified number of cards per player
    public PokerGame(int numOfCardPerPlayer) {
        // Call the default constructor to set common attributes
        this();
        // Set the specified number of cards per player
        this.numOfCardPerPlayer = numOfCardPerPlayer;
    }

    // Implementation of the gameRule() method from the HasRule interface
    @Override
    public void gameRule() {
        System.out.println("Poker Game Rules: ...");
    }

    // Implementation of the playGame() method from the superclass (CardGame)
    @Override
    public void playGame() {
        System.out.println("Playing Poker Game");
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return super.toString();  // Call the toString() method of the superclass (CardGame)
    }
}
