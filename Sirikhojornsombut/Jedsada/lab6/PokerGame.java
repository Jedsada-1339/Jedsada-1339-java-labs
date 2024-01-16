package sirikhojornsombut.jedsada.lab6;

public class PokerGame extends CardGame implements HasRule {

    public PokerGame(){
        super(5);
        this.gameName ="Poker Game";
        this.numOfPlayers = 5;
    }

    public PokerGame(int numOfCardPerPlayer){
        this();
        this.numOfCardPerPlayer = numOfCardPerPlayer;
    }

    @Override
    public void gameRule() {
        System.out.println("Poker Game Rules : ...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing Poker Game");
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
}
