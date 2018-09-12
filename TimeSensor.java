import java.util.Scanner;
public class TimeSensor {
   public static void main(String[] args) {
        System.out.println("Type Day/Night");
        Scanner a = new Scanner(System.in);
        String x = a.next();
        String y = "Day";
        String z = "Night";
        if(x.equals(y)){
            System.out.println("Good Morning");
        }
        else if(x.equals(z)){
            System.out.println("Good Evening");
        }
        else{
            System.out.println("Wrong Time,Think Again:D");
        }
   }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
    

