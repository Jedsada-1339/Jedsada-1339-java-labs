package sirikhojornsombut.jedsada.lab3;

import java.util.Scanner;

public class ConfigurableNumberGuessingGame {
        static int answer, min,max,numberOfTries,maxTries;
        static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        configure();
        genAnswer();
        playGame();
    }


    /*ฟังชั่นแก้ไข้ค่าภายในตัวเกม */
    private static void configure(){
        System.out.print("Enter the min value:");
        int minin = input.nextInt();
        min += minin;
        System.out.print("Enter the max value:");
        int maxin = input.nextInt();
        max += maxin;
        System.out.print("Enter the maximum number of tries:");
        int numberOfTriesin = input.nextInt();
        numberOfTries += numberOfTriesin;
    }

    private static void genAnswer(){
        answer = (min + (int)(Math.random() * ((max - min) + 1)));
    }


    private static void playGame() {

        System.out.println("Welcome to a number guessing game!");

        Scanner scanner = new Scanner(System.in);

        /*
         * จำนวนที่สามารถลองเดาตัวเลขได้
         */
        int numberOfTries = 0;
        final int maxTries = 5;
        
        int check = 0;

        /*
         * ตัว loop ถาม User
         */
        while (numberOfTries < maxTries) {
            System.out.print("Enter an integer between "+ min +" and " + max + ":");
            int guess = scanner.nextInt();

            /*
             * เงื่อนไขเช็คคำตอบ
             */
            if (guess == answer) {
                System.out.println("Congratulations!.");
                numberOfTries++;
                check++;
                break;
            } else if (guess < 1 || guess > 20) {
                System.out.println("Enter an integer between "+ min +" and " + max + ":");
            } else {
                if (guess < answer) {
                    System.out.println("Try a higher number!");
                } else {
                    System.out.println("Try a lower number!");
                }
            }

            numberOfTries++;
        }
        
        if (check ==0){
            System.out.println("You have tried " + numberOfTries + " times. "+"You ran out of guesses");
            System.out.println("The answer is "+ answer);
        }else{
            if (numberOfTries == 1){
            System.out.println("You have tried " + numberOfTries + " time.");
            } else{
            System.out.println("You have tried " + numberOfTries + " times.");
            }
        }
        scanner.close();
    }
}
