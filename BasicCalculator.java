import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int birinci_sayi,ikinci_sayi;
        System.out.println("Type Number 1");
        birinci_sayi=x.nextInt();
        System.out.println("Type Number 2");
        ikinci_sayi=x.nextInt();
        int i�lem,sonu�;
        System.out.println("Addition=1,Extraction=2,�mpact=3,Division=4");
        i�lem=x.nextInt();
        if(i�lem>4){
        System.out.println("Wrong Type,Try Again");
        }
        else if(i�lem==1){
            sonu�=birinci_sayi+ikinci_sayi;
            System.out.println("Result:"+sonu�);
        }
        else if(i�lem==2){
            sonu�=birinci_sayi-ikinci_sayi;
            System.out.println("Result:"+sonu�);
        }
        else if(i�lem==3){
            sonu�=birinci_sayi*ikinci_sayi;
            System.out.println("Result:"+sonu�);
        }
        else if(i�lem==4){
            sonu�=birinci_sayi/ikinci_sayi;
            System.out.println("Result:"+sonu�);
        }        
    }
}