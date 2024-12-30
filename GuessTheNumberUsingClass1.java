import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberUsingClass1 {

    static class Game {
        private int randomNumber;
        private int noOfGuesses;
        
        // Constructor to generate the random number
        public Game() {
            generateRandomNumber();
        }

        // Method to generate a random number
        private void generateRandomNumber() {
            Random rand = new Random();
            randomNumber = rand.nextInt(100) + 1; // Generates a number between 1 and 100
        }

        // Method to take user input
        public int takeUserInput() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your guess: ");
            return sc.nextInt();
        }

        // Method to check if the user's guess is correct
        public boolean isCorrectNumber(int userNumber) {
            noOfGuesses++;
            if (userNumber == randomNumber) {
                System.out.println("You guessed it right in " + noOfGuesses + " attempts!");
                return true;
            } else if (userNumber < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            return false;
        }

        // Getter for the number of guesses
        public int getNoOfGuesses() {
            return noOfGuesses;
        }

        // Setter for the number of guesses
        public void setNoOfGuesses(int noOfGuesses) {
            this.noOfGuesses = noOfGuesses;
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        boolean hasGuessedCorrectly = false;

        // Main game loop
        while (!hasGuessedCorrectly) {
            int userNumber = game.takeUserInput();
            hasGuessedCorrectly = game.isCorrectNumber(userNumber);
        }
    }
}
