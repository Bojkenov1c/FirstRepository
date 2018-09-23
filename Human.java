public class Human {
    int age;
    int weight;
    int height;
    void eat(int x){
        weight=weight+x;
    }
    void year(int y){
        age=age+y;
    }
    void sport(int z){
        height=z+height;
    }
public static void main(String[] args) {
    Human Edward = new Human();
    Edward.age=21;
    Edward.height=175;
    Edward.weight=75;
    System.out.println("Edwards Before Age:"+Edward.age);
    System.out.println("Edwards Before Height:"+Edward.height);
    System.out.println("Edwards Before Weight:"+Edward.weight);
    Edward.eat(10);
    Edward.year(4);
    Edward.sport(12);
    System.out.println("Edwards After Age:"+Edward.age);
    System.out.println("Edwards After Age:"+Edward.height);
    System.out.println("Edwards After Age:"+Edward.weight);
}
}