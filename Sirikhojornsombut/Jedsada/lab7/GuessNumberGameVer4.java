package sirikhojornsombut.jedsada.lab7;


import java.util.Comparator;

public class GuessNumberGameVer4 {
    protected int minNum;
    protected int maxNum;
    protected int maxTries;

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

    static class SortByMaxTriesGuessRange extends SortByMaxTries {

        public int compare(GuessNumberGameVer4 Guess1, GuessNumberGameVer4 Guess2) {
            
            int range1 = Guess1.maxNum - Guess1.minNum;
            int range2 = Guess2.maxNum - Guess2.minNum;
            super.compare(Guess1, Guess2);

            if (super.compare(Guess1, Guess2) == 0) {
                return Integer.compare(range2, range1);
            } 
            return super.compare(Guess1, Guess2);
        }
    }

    @Override
    public String toString(){
        return "GuessNumberGameVer4" + "(min:" + minNum + ", max:" + maxNum + ", max triex:" + maxTries + ")";
    }
}
