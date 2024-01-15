package sirikhojornsombut.jedsada.lab6;
import java.util.Arrays;

// MonopolyGame class
class MonopolyGame extends Game {
    String[] gamePieces;

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
        return super.toString() + ", MonopolyGame gamePieces=" + Arrays.toString(gamePieces);
    }
}
