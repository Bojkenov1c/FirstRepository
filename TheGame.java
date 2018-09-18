import java.util.Scanner;
import java.util.Random;
public class TheGame {
    public static void main(String[] args) {
        Random rnd = new Random();
        int bilgisayar = rnd.nextInt(3);
        System.out.println("Please Choose One:Rock=0/Paper=1/Scissors=2");
        Scanner x =new Scanner(System.in);
        int oyuncu=x.nextInt();
        if(oyuncu>2){
            System.out.println("Wrong Choose!");
        }
        else if(oyuncu==0&&bilgisayar==1){
            System.out.println("Computer Choosed Paper,You Lose!");
        }
        else if(oyuncu==0&&bilgisayar==2){
            System.out.println("Computer Choosed Scissors,You Win!");
        }
        else if(oyuncu==1&&bilgisayar==0){
            System.out.println("Computer Choosed Rock,you Win!");
        }
        else if(oyuncu==1&&bilgisayar==2){
            System.out.println("Computer Choosed Scissors,You Lose!");
        }
        else if(oyuncu==2&&bilgisayar==0){
            System.out.println("Computer Choosed Rock,You Lose!");
        }
        else if(oyuncu==2&&bilgisayar==1){
            System.out.println("Computer Choosed Paper,You Win!");
        }

    }
    
}