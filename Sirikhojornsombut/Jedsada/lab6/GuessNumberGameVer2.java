package sirikhojornsombut.jedsada.lab6;

public class GuessNumberGameVer2 extends GuessNumberGameVer1 implements HasRule{

    public GuessNumberGameVer2(){
        this.gameName = "GuessNumberGameVer2";
    }

    public GuessNumberGameVer2(int minNum, int maxNum) {
        this();
        this.minNum = minNum;
        this.maxNum = maxNum;
    }

    public GuessNumberGameVer2(int minNum, int maxNum,int maxTries) {
        this(minNum, maxNum);
        this.maxTries = maxTries;
    }

    @Override
    public void playGame(){
        System.out.println("Playing Guess Number Game Ver 2");
    }

    @Override
    public String toString(){
        return super.toString();

    }

    @Override
    public void gameRule() {
        System.out.println("Guess Number Game Rule: ...");
    }
    
}
