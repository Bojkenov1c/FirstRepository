import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int birinci_sayi,ikinci_sayi;
        System.out.println("Type Number 1");
        birinci_sayi=x.nextInt();
        System.out.println("Type Number 2");
        ikinci_sayi=x.nextInt();
        int iþlem,sonuç;
        System.out.println("Addition=1,Extraction=2,Ýmpact=3,Division=4");
        iþlem=x.nextInt();
        if(iþlem>4){
        System.out.println("Wrong Type,Try Again");
        }
        else if(iþlem==1){
            sonuç=birinci_sayi+ikinci_sayi;
            System.out.println("Result:"+sonuç);
        }
        else if(iþlem==2){
            sonuç=birinci_sayi-ikinci_sayi;
            System.out.println("Result:"+sonuç);
        }
        else if(iþlem==3){
            sonuç=birinci_sayi*ikinci_sayi;
            System.out.println("Result:"+sonuç);
        }
        else if(iþlem==4){
            sonuç=birinci_sayi/ikinci_sayi;
            System.out.println("Result:"+sonuç);
        }        
    }
}