import java.util.Date;
public class TimeSensor {
   public static void main(String[] args) {
        Date tarih = new Date();
        int saat = tarih.getHours();
        if(saat<8){
            System.out.println("Good Morning!");
        }
        else if(saat>20){
            System.out.println("Good Night!");
        }
        else{
            System.out.println("Have a Nice Day!");
        }
   }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
    

