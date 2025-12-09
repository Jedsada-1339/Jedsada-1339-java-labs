package sirikhojornsombut.jedsada.taTestlab;

public class footballer {
    public static void main(String[] args) {
        if (args.length == 3){
            String name =  args[0];
            String nationality = args[1];
            String club = args[2];
            System.err.println("My favorite football player is " + name +" His");
            System.err.println("nationality is " + nationality + " He plays for " + club);
        }
        else{
            System.err.println("Error: Invaid number of argument. Please provide exactly three argument");
        }
    }
}
