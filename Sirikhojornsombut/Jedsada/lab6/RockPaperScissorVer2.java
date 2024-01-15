package sirikhojornsombut.jedsada.lab6;

public class RockPaperScissorVer2 extends RockPaperScissor implements HasRule{
    
    public RockPaperScissorVer2() {
        super();
    }

    public RockPaperScissorVer2(String player1Choice, String player2Choice) {
        this();
        this.player1Choice = player1Choice;
        this.player2Choice = player2Choice;
    }
    
    @Override
    public void playGame(){
        System.out.println("Playing Rock Paper Scissor Game Ver 2");
    }

    @Override
    public String toString(){
        return "Game [gameName=" + gameName + ", numOfPlayers=" + numOfPlayers + "]";
    }

    @Override
    public void gameRule() {
        System.out.println("RockPaperScissor Rule: ...");
    }
}