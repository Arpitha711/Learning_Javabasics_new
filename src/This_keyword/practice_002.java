package This_keyword;

public class practice_002 {
    public static void main(String[] args) {
       demo d1 = new demo("Arpitha",24);
       d1.demo1();
    }
}

class demo{
    String name;
    int age;

    public demo(String name, int age) {
    }

    void demo1(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}