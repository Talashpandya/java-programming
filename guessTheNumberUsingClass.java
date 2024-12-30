import java.util.Random;
import java.util.Scanner;

public class guessTheNumberUsingClass {
    static class game {
        public static void guessTheNumber(){
            int randomNumber;
            int userNumber;
            int isCorrect;
            
            public takeUserInput(int x){
                Scanner.Sc= new Scanner(System.in);
                userNumber = Sc.nextINT();
            }
            public generateRandonNumber {
                Random rand = new Random();
                randomNumber = rand.nextInt(100);
            }
            public isCorrectNumber(userNumber){
                if (userNumber==randomNumber){
                    System.out.println("you gussed it right");
                    return;
                }
            }
        } 
    }
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

    }
}