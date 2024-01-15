package sirikhojornsombut.jedsada.lab6;

public class MonopolyGameVer2 extends MonopolyGame implements HasRule,UseBoard,UseDice {
    
    public MonopolyGameVer2() {
        super();
    }

    public MonopolyGameVer2(String[] gamePieces) {
        this();
        this.gamePieces = gamePieces;
        this.numOfPlayers = gamePieces.length;
    }

    @Override
    public void playGame(){
        System.out.println("Playing Monopoly Game Ver 2");
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void setUpBoard() {
        System.out.println("Set up monopoly board");
    }

    @Override
    public void gameRule() {
        System.out.println("Monopoly Rule: ...");
    }

    @Override
    public void rollDice() {
        System.out.println("Roll 2 dice for Monopoly Game");
    }
}
