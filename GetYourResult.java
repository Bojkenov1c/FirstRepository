import java.util.Scanner;
public class GetYourResult {
    public static void main(String[] args) {
        /*90+ AA
        80-90 BB
        70-80 CC
        70-FF
        */
        System.out.println("Please Write Your Note");
        Scanner not = new Scanner(System.in);
        int x =not.nextInt();
        if(x>=90){
            System.out.println("AA");
        }
        else if(x>=80 && x<90){
            System.out.println("BB");
        }
        else if(x>=70 && x<80){
            System.out.println("CC");
        }
        else{
            System.out.println("FF");
        }    
    }
    
}