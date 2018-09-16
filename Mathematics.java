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
        for(int z = 1;z<100;z=z*2){
            System.out.println(""+z);
        }
        int a = 0;
        while(a<=25){
            System.out.println(""+a);
            a = a+5;
        }
        int b = 0;
        do{
            System.out.println(""+b);
            b = b+3;
        }while(b<=15);
    }
    
}