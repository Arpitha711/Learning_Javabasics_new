package conditions_loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab030_If_condition {
    public static void main(String[] args) {
        //int age =20;
        //int age = Integer.parseInt(args[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        //If we dont enter integer we get this exception .InputMismatchException

        if (age>= 18){
            System.out.println("allwoed to vote");
        }
        else{
            System.out.println("Not allowed");
        }
    }
}
