package This_keyword;

public class practice_001 {
    public static void main(String[] args) {
        car c1 = new car("nano","2020");
        c1.display();
        car c2 = new car("BMW","2001");
        c2.display();
    }
}
class car{
    String model_name;
    String year_manufacture;

    car(String model_name,String year_manufacture){
        this.model_name = model_name;
        this.year_manufacture = year_manufacture;
    }

    void display(){
        System.out.println("Car name "+ model_name);
        System.out.println("Year "+ year_manufacture);
    }
}
