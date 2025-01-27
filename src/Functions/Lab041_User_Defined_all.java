package Functions;

public class Lab041_User_Defined_all {
//    User Defined Functions.**
//            1. Without Parameters and Without Return Type.
//            2. Without Parameters but With Return Type
//            3. With Parameters and Without Return Type
//            4. With Parameters and With Return Type
public static void main(String[] args) {
    greet();//Example1
    String s = greet_hello();
    System.out.println(s);
    greet_name("Arpitha");
    greet_name("Chaya");
    int sum = add(9,7,7);
    System.out.println(sum);
}
static void greet(){
    System.out.println("Arpitha");
}
//2 Without Parameters but With Return Type
    static String greet_hello(){
       return "How r u";
    }
// 3. With Parameters and Without Return Type
    static void greet_name(String name){
        System.out.println("my name is"+ name);
    }

//4. With Parameters and With Return Type
    static int add(int a , int b, int c){
      return a +b -c;
    }


}
