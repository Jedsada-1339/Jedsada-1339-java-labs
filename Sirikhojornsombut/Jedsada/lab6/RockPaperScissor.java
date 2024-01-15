package sirikhojornsombut.jedsada.lab6;

public class RockPaperScissor extends Game {
    String player1Choice;
    String player2Choice;

    // Constructors
    public RockPaperScissor() {
        super("Rock Paper Scissor Game", 2);
        this.player1Choice = "rock";
        this.player2Choice = "rock";
    }

    public RockPaperScissor(String player1Choice, String player2Choice) {
        this();
        this.player1Choice = player1Choice;
        this.player2Choice = player2Choice;
    }

    // Getter and setter methods
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

    // playGame() method
    @Override
    public void playGame() {
        // Implement the game logic here
        System.out.println("Playing Rock Paper Scissor Game");
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + ", RockPaperScissorGame player1Choice=" + player1Choice + ", player2Choice=" + player2Choice;
    }
}
