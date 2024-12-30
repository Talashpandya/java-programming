import java.util.Scanner;
import java.util.Random;

public class rockPaperScissor {
    public static void main(String[] args) {
        int userWin = 0, compWin = 0, matchTied = 0, compInput;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your option for chosing : \n 1.ROCK\n 2.PAPER\n 3.scissor");
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            int userInput = Sc.nextInt();
            compInput = rand.nextInt(3);
            if (userInput == 1 && compInput == 0 || userInput == 2 && compInput == 1
                    || userInput == 3 && compInput == 2) {
                System.out.println("match tied");
                matchTied++;
            } else if (userInput == 1 && compInput == 1 || userInput == 2 && compInput == 2
                    || userInput == 3 && compInput == 0) {
                System.out.println("computer wins ");
                compWin++;
            } else {
                System.out.println("user wins");
                userWin++;
            }
        }
        System.out.println("match won by you : " + userWin);
        System.out.println("match won by computer : " + compWin);
        System.out.println("match tied" + matchTied);
        Sc.close();
    }
}
