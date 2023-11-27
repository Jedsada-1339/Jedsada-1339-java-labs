package sirikhojornsombut.jedsada.lab3;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        playGame(); 
    }

    /*ฟังชั่นเล่นเกม */
    private static void playGame() {
        final int min = 1;
        final int max = 20;


        System.out.println("Welcome to a number guessing game!");
        int answer = (min + (int)(Math.random() * ((max - min) + 1)));


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
            System.out.print("Enter an integer between 1 and 20: ");
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
                System.out.println("Enter an integer between 1 and 20: ");
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
