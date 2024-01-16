package sirikhojornsombut.jedsada.lab6;

// Import statements can go here if needed

// Define the class for Dungeons And Dragons Game, which extends CardGame and implements HasRule, UseBoard, UseDice
public class DungeonsAndDragonsGame extends CardGame implements HasRule, UseBoard, UseDice {

    // Constructor for DungeonsAndDragonsGame with default values
    public DungeonsAndDragonsGame() {
        super(6);  // Call the constructor of the superclass (CardGame) with a parameter
        this.gameName = "Dungeons And Dragons Game";  
        this.numOfPlayers = 3;  
    }

    // Constructor for DungeonsAndDragonsGame with a specified number of cards per player
    public DungeonsAndDragonsGame(int numOfCardPerPlayer) {
        this();  // Call the default constructor to initialize common values
        this.numOfCardPerPlayer = numOfCardPerPlayer;  // Set the number of cards per player
    }

    // Override the rollDice method from the UseDice interface
    @Override
    public void rollDice() {
        System.out.println("Rolling 2 dices for Dungeons And Dragons Game");
    }

    // Override the setUpBoard method from the UseBoard interface
    @Override
    public void setUpBoard() {
        System.out.println("Setting up board for Dungeons And Dragons Game");
    }

    // Override the gameRule method from the HasRule interface
    @Override
    public void gameRule() {
        System.out.println("Dungeons And Dragons Game Rules : ...");
    }

    // Override the playGame method from the superclass (CardGame)
    @Override
    public void playGame() {
        System.out.println("Playing Dungeons And Dragons Game");
    }

    // Override the toString method to provide a custom string representation of the object
    @Override
    public String toString() {
        return gameName + " : " + super.toString();  // Combine the game name with the superclass's string representation
    }
}
