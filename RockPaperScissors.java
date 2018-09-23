import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args) {
        boolean continueGame = true;

        while (continueGame) {
            int userChoose = userInput();
            int computerChoose = computerChoose();

            boolean isUserWin = runGame(userChoose, computerChoose);
            
            if (isUserWin) {
                System.out.println("You Win!");

            } else {
                System.out.println("You Lose");
            }

            continueGame = repeatGame();
        }
    }

    private static int userInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter: 0 - Rock; 1 - Paper; 2 - Scissors");
        return reader.nextInt();
    }

    private static int computerChoose() {
        Random rnd = new Random();
        int pc=rnd.nextInt(2);
        return pc;
    }

    private static boolean runGame(int userChoose, int computerChoose) {
        if(userChoose==0&&computerChoose==2){
        return true;
        }
        if(userChoose==0&&computerChoose==1){
        return false;
        }
        if(userChoose==1&&computerChoose==0){
        return true;
        }
        if(userChoose==1&&computerChoose==2){
        return false;
        }
        if(userChoose==2&&computerChoose==1){
        return true;
        }
        if(userChoose==2&&computerChoose==0){
        return false;
        }
        return false;
    }

    private static boolean repeatGame() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Repeat game? 0 - no; 1 - yes;");
        return reader.nextInt() == 1;
    }

}
