package jan31_task;

import java.util.Scanner;

public class Visa_Status {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if(status(age)){
            System.out.println("Valid to travel");
        } else{
            System.out.println("Not eligible");
        }
    }
    public static boolean status(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
}
