public class BreakAndContinue {
    public static void main(String[] args) {
        for(int x = 0;x<10;x++){
            System.out.println("break");
            if(x==4){
                break;
            }
            System.out.println(x);
        }
        for(int y = 0;y<10;y++){
            System.out.println("continue");
            if(y==3){
                continue;
            }
            System.out.println(y);
        }    
    }
    
}