package sirikhojornsombut.jedsada.lab7;

import java.util.Comparator;

public class GuessNumberGameVer4 {
    protected int minNum;
    protected int maxNum;
    protected int maxTries;

    // Constructor for initializing the game parameters
    public GuessNumberGameVer4(int minNum, int maxNum, int maxTries) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        this.maxTries = maxTries;
    }

    // Comparator to sort GuessNumberGameVer4 objects by maxTries
    static class SortByMaxTries implements Comparator<GuessNumberGameVer4> {
        @Override
        public int compare(GuessNumberGameVer4 Guess1, GuessNumberGameVer4 Guess2) {
            return Integer.compare(Guess1.maxTries, Guess2.maxTries);
        }
    }

    // Comparator to sort GuessNumberGameVer4 objects first by maxTries and then by the range of numbers
    static class SortByMaxTriesGuessRange extends SortByMaxTries {

        @Override
        public int compare(GuessNumberGameVer4 Guess1, GuessNumberGameVer4 Guess2) {
            
            int range1 = Guess1.maxNum - Guess1.minNum;
            int range2 = Guess2.maxNum - Guess2.minNum;

            // Using the super.compare method to compare based on maxTries
            super.compare(Guess1, Guess2);

            // If maxTries comparison is equal, then compare based on the range of numbers
            if (super.compare(Guess1, Guess2) == 0) {
                return Integer.compare(range2, range1);
            } 
            // Return the result of maxTries comparison
            return super.compare(Guess1, Guess2);
        }
    }

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "GuessNumberGameVer4" + "(min:" + minNum + ", max:" + maxNum + ", max tries:" + maxTries + ")";
    }
}
