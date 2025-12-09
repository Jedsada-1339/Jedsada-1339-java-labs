package sirikhojornsombut.jedsada.taTestlab;

public class MoneyProcessor {

    public static void main(String[] args) {

        //if (args.length != 3){
        //System.out.println("Please provide exactly three argument");
        //}
        if (args.length == 6) {
            int int1 = Integer.parseInt(args[0]) * 100;
            int int2 = Integer.parseInt(args[1]) * 20;
            int int3 = Integer.parseInt(args[2]) * 10;
            int int4 = Integer.parseInt(args[3]) * 1;
            float int5 = Float.parseFloat(args[4]);
            float int6 = Float.parseFloat(args[5]);
            if (true) {
                double total_sum;
                total_sum = int1 + int2 + int3 + int4 + (int5 * 0.5) + (int6 * 0.25);
                System.out.println("Total sum = " + total_sum + " Baht");
            }
        } else {
            System.out.println("Please provide exactly three argument");
        }
    }

}
