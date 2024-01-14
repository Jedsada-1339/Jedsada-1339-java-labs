package sirikhojornsombut.jedsada.lab6;

public class test {
    public static void main(String[] args) {
        GuessNumberGameVer1 game1 = new GuessNumberGameVer1(1,10,5,3);
        System.err.println(game1);
        game1.playGame();
        MonopolyGame game2 = new MonopolyGame(new String[]{"Dove","day"});
        System.out.println(game2);
        game2.playGame();
    }
}
