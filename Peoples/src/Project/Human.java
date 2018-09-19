package Project;
public class Human {
    int height;
    int weight;
    int age;
    String hair_color;
    String gender;
    String eye_color;
    void eat(int food){
    	weight=weight+food;
    }
    void every_year(int time) {
    	age= age+time;
    }
    void sport(int hour){
    	height=height+hour;
    }
    
    
}
