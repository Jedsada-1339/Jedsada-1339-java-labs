package sirikhojornsombut.jedsada.lab6;

// MonopolyGameVer2 class, extending MonopolyGame and implementing HasRule, UseBoard, UseDice
public class MonopolyGameVer2 extends MonopolyGame implements HasRule, UseBoard, UseDice {

    // Default constructor
    public MonopolyGameVer2() {
        // Call the default constructor of the superclass (MonopolyGame)
        super();
    }

    // Parameterized constructor with a specified array of game pieces
    public MonopolyGameVer2(String[] gamePieces) {
        // Call the default constructor to set common attributes
        this();
        // Set the specified game pieces array and update the number of players
        this.gamePieces = gamePieces;
        this.numOfPlayers = gamePieces.length;
    }

    // Override the playGame() method from the superclass (MonopolyGame)
    @Override
    public void playGame() {
        // Implement the specific game logic for Monopoly Game Ver 2
        System.out.println("Playing Monopoly Game Ver 2");
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return super.toString();  // Call the toString() method of the superclass (MonopolyGame)
    }

    // Implementation of the setUpBoard() method from the UseBoard interface
    @Override
    public void setUpBoard() {
        System.out.println("Set up Monopoly board");
    }

    // Implementation of the gameRule() method from the HasRule interface
    @Override
    public void gameRule() {
        System.out.println("Monopoly Rule: ...");
    }

    // Implementation of the rollDice() method from the UseDice interface
    @Override
    public void rollDice() {
        System.out.println("Roll 2 dice for Monopoly Game");
    }
}
