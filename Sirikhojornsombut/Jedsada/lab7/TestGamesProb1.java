package sirikhojornsombut.jedsada.lab7;

import java.util.ArrayList;
import java.util.Collections;

import sirikhojornsombut.jedsada.lab7.GuessNumberGameVer4.SortByMaxTries;

public class TestGamesProb1 {
    static ArrayList<GuessNumberGameVer4> games = new ArrayList<GuessNumberGameVer4>();

    public static void printGamesList(String msg){
        System.out.println(msg);
        for (GuessNumberGameVer4 game : games){
            System.out.println(game);
        }
    }

    public static void intGamesList(){
        games.add(new GuessNumberGameVer4(1,10,7));
        games.add(new GuessNumberGameVer4(1,10,3));
        games.add(new GuessNumberGameVer4(1,10,5));

        printGamesList("=====Unsorted games list ====");
    }

    public static void sortGamesList(){
        Collections.sort(games, new SortByMaxTries());
        
        printGamesList("=====Sorted games list ====");
    }

    public static void main(String[] args) {
        intGamesList();
        sortGamesList();
    }
}
