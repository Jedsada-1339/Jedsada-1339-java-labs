package Sirikhojornsombut.Jedsada.lab2;

public class SimpleCalculator {
    public static void main(String[] args) {

        //if (args.length != 3){
            //System.out.println("Please provide exactly three argument");
        //}
        if (args.length == 3){
            int int1= Integer.parseInt(args[0]);
            int int2= Integer.parseInt(args[1]);
            String operation = args[2];
            //System.out.println(int1+operation+int2+"="+(int1+int2));
            if (operation.equals("+")){
                System.out.println(int1+operation+int2+"="+(int1+int2));
            }
            if (operation.equals("-")){
                System.out.println(int1+operation+int2+"="+(int1-int2));
            }
            if (operation.equals("x")){
                System.out.println(int1+operation+int2+"="+(int1*int2));
            }
            if (operation.equals("/")){
                if(int2 == 0){
                    System.out.println("Error: Division by zero is not allowed.");
                }
                else{
                    System.out.println(int1+operation+int2+"="+(int1/int2));
                }
            }
            else{
            System.out.println("Error: Invalid operator. Please use '+','-','x',or '/'.");
            }
        }
        else{
            System.out.println("Please provide exactly three argument");
        }
    }
    
}
