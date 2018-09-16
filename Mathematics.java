public class Mathematics {
    public static void main(String[] args) {
        for(int x = 0;x<=100;x++){
            if(x%5==0 && x%3 == 0){
                System.out.println(""+x);
            }
        }
        for(int y = 100;y>0;y = y-2){
            System.out.println(""+y);
        }  
    }
    
}