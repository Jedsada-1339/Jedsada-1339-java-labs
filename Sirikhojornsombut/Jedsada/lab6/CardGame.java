package sirikhojornsombut.jedsada.lab6;

public abstract class CardGame extends Game{
    int numOfCardPerPlayer;

    public CardGame(){
        this.numOfCardPerPlayer = 0;
    }

    public CardGame(int numOfCardPerPlayer){
        this.numOfCardPerPlayer = numOfCardPerPlayer;
    }

    public int getNumOfCardPerPlayer(){
        return numOfCardPerPlayer;
    }

    public void setNumOfCardPerPlayer(int numOfCardPerPlayer){
        this.numOfCardPerPlayer = numOfCardPerPlayer;
    }

    @Override
    public String toString(){
        return super.toString() + "{" + "numOfCardPerPlayer=" + "'" +numOfCardPerPlayer+"'"+"}";
    }

    public abstract void playGame();
}
