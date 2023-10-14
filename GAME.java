import java.util.Random;
import java.util.Scanner;

public class  ROCKPAPERSCISSORGAME{
public static void main(String[] args) {
        // Create an array of choices
    System.out.println("WELCOME IN ROCK_PAPER_SCISSOR_GAME");
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Create a random number generator for the computer's choice
        Random random = new Random();

        while (true) {
        // Get the computer's choice
        int computerChoice = random.nextInt(3);

        // Prompt the user for their choice
        System.out.print("Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors, or any other number to quit): ");
        int userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice > 2) {
        System.out.println("Invalid choice. Exiting the game.");
        break;
        }

        System.out.println("You chose: " + choices[userChoice]);
        System.out.println("Computer chose: " + choices[computerChoice]);

        // Determine the winner
        if (userChoice == computerChoice) {
        System.out.println("It's a tie!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
        (userChoice == 1 && computerChoice == 0) ||
        (userChoice == 2 && computerChoice == 1)) {
        System.out.println("You win!");
        } else {
        System.out.println("Computer wins!");
        }

        // Ask if the user wants to play again
        System.out.print("Play again? (yes/no): ");
        String playAgain = scanner.next();
        if (!playAgain.equalsIgnoreCase("yes")) {
        break;
        }
        }

        // Close the scanner
        scanner.close();
        }
        }


