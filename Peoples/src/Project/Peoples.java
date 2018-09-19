package Project;
public class Peoples {
    public static void main(String[] args) {
    	Human Steven = new Human();
    	Steven.age=25;
    	Steven.height=185;
    	Steven.weight=80;
    	Steven.hair_color="Black";
    	Steven.eye_color="Brown";
    	Steven.gender="Male";
    	System.out.println("Stevens Before Features:"+"Age :"+Steven.age+"/Height :"+Steven.height+"/Weight :"+Steven.weight+"/Hair Color :"+Steven.hair_color+"/Eye Color :"+Steven.eye_color+"/Gender :"+Steven.gender);
    	Steven.every_year(5);
    	Steven.eat(15);
    	Steven.sport(7);
    	System.out.println("Stevens After Features:"+"Age :"+Steven.age+"/Height :"+Steven.height+"/Weight :"+Steven.weight+"/Hair Color :"+Steven.hair_color+"/Eye Color :"+Steven.eye_color+"/Gender :"+Steven.gender);
        WorkingPeople Stefan = new WorkingPeople();
        Stefan.salary=4500;
        Stefan.expense=3000;
        System.out.println("Stefans Before Salary/Expense;"+Stefan.expense+"/"+Stefan.salary);
        Stefan.raise(15);
        Stefan.expense=3500;
        System.out.println("Stefans After Salary/Expense;"+Stefan.expense+"/"+Stefan.salary);
    }
}
