package Practice;

import java.util.Scanner;

public class Practice006_Functions {
    public static void main(String[] args) {
        type1();
        String s1 = type2();
        System.out.println(s1);
        type3("Arpitha");
        int sum = type4(5,7);
        System.out.println(sum);


    }

    static void type1(){
        System.out.println("Hello");
    }

    static String type2(){
        return "How are u";
    }

    static void type3(String name){
        System.out.println("My name is"+ name);
    }

    static int type4(int a, int b){
        return a+b;
    }
}
