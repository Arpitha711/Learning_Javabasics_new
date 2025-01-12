package java_excersice02;

public class Lab012_Constants2 {
    int i_age;//Instance variable
    static int s_age;//Static variable
   //instance and static variable get default values
    //int, short , byte, long, float, double -- 0
    //string -- null
    //char -- 0 (ASCII)
    //default value pf char is not space
    //JVM doesnt assign default value for local variable
    //JVM assign default value for static and instance variable
    //Instance variable cannot be accessed from main methode(static method)

    public static void main(String[] args) {
       //Give and error System.out.println(i_age);
        System.out.println(s_age);
    }
}
