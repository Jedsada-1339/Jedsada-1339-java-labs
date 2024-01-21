package sirikhojornsombut.jedsada.lab7;


import java.util.Comparator;

import sirikhojornsombut.jedsada.lab5.GuessNumberGameVer3;

public class GuessNumberGameVer4 {
    protected int minNum;
    protected int maxNum;
    protected int maxTries;

    public GuessNumberGameVer4(){
        this.minNum = 1;
        this.maxNum = 10;
        this.maxTries = 3;
    }

    public GuessNumberGameVer4(int minNum,int maxNum ,int maxTries){
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
    }
    
    static class SortByMaxTries implements Comparator<GuessNumberGameVer4> {
        @Override
        public int compare(GuessNumberGameVer4 Guess1, GuessNumberGameVer4 Guess2) {
            return Integer.compare(Guess1.maxTries, Guess2.maxTries);
        }
    }

    static class SortByMaxTriesGuessRange implements Comparator<GuessNumberGameVer4> {

        public int compare(GuessNumberGameVer4 Guess1, GuessNumberGameVer4 Guess2) {
            int maxTriesComparison = Integer.compare(Guess2.maxTries, Guess1.maxTries);
    
            if (maxTriesComparison != 0) {
                return maxTriesComparison;
            } else {
                int range1 = Guess1.maxNum - Guess1.minNum;
                int range2 = Guess2.maxNum - Guess2.minNum;
    
                return Integer.compare(range1, range2);
            }
        }
    }

    @Override
    public String toString(){
        return "GuessNumberGameVer4" + "(min:" + minNum + ", max:" + maxNum + ", max triex:" + maxTries + ")";
    }
}
