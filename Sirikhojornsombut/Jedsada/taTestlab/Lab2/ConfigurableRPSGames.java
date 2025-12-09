package sirikhojornsombut.jedsada.taTestlab.Lab2;

import java.util.Scanner;

public class ConfigurableRPSGames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        // Main game loop
        do {
            playGame(scanner);

            // Ask if user wants to play again
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.next();
            System.out.println();

        } while (playAgain.equals("y") || playAgain.equals("Y"));

        scanner.close();
        System.out.println("Thanks for playing!");
    }

    /**
     * Plays a single round of Rock-Paper-Scissors game This method reuses the
     * logic from ConfigurableRPS
     *
     * @param scanner Scanner object for reading user input
     */
    public static void playGame(Scanner scanner) {
        // Get user input
        System.out.print("Enter move (r/p/s or R/P/S or 0/1/2): ");
        String input = scanner.next();

        // Convert user input to integer using switch statement
        int userChoice = -1;
        switch (input) {
            case "r":
            case "R":
            case "0":
                userChoice = 0;
                System.out.println("User choose: Rock");
                break;
            case "p":
            case "P":
            case "1":
                userChoice = 1;
                System.out.println("User choose: Paper");
                break;
            case "s":
            case "S":
            case "2":
                userChoice = 2;
                System.out.println("User choose: Scissors");
                break;
            default:
                System.out.println("Invalid move!");
                return;
        }

        // Generate computer choice (0-2)
        int computerChoice = (int) (Math.random() * 3);

        // Display computer choice
        switch (computerChoice) {
            case 0:
                System.out.println("Computer choose: Rock");
                break;
            case 1:
                System.out.println("Computer choose: Paper");
                break;
            case 2:
                System.out.println("Computer choose: Scissors");
                break;
        }

        // Determine winner
        if (userChoice == computerChoice) {
            String choice = "";
            switch (userChoice) {
                case 0:
                    choice = "Rock";
                    break;
                case 1:
                    choice = "Paper";
                    break;
                case 2:
                    choice = "Scissors";
                    break;
            }
            System.out.println("It's a tie! Both chose " + choice);
        } else {
            // Determine winner using conditions
            boolean userWins = false;
            String winningChoice = "";
            String losingChoice = "";

            if (userChoice == 0 && computerChoice == 2) {
                // Rock beats Scissors
                userWins = true;
                winningChoice = "Rock";
                losingChoice = "Scissors";
            } else if (userChoice == 1 && computerChoice == 0) {
                // Paper beats Rock
                userWins = true;
                winningChoice = "Paper";
                losingChoice = "Rock";
            } else if (userChoice == 2 && computerChoice == 1) {
                // Scissors beats Paper
                userWins = true;
                winningChoice = "Scissors";
                losingChoice = "Paper";
            } else if (computerChoice == 0 && userChoice == 2) {
                // Rock beats Scissors
                userWins = false;
                winningChoice = "Rock";
                losingChoice = "Scissors";
            } else if (computerChoice == 1 && userChoice == 0) {
                // Paper beats Rock
                userWins = false;
                winningChoice = "Paper";
                losingChoice = "Rock";
            } else if (computerChoice == 2 && userChoice == 1) {
                // Scissors beats Paper
                userWins = false;
                winningChoice = "Scissors";
                losingChoice = "Paper";
            }

            if (userWins) {
                System.out.println(winningChoice + " beats " + losingChoice + ". You win!");
            } else {
                System.out.println(winningChoice + " beats " + losingChoice + ". You lose!");
            }
        }
    }
}
