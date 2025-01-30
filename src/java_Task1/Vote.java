package java_Task1;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible");
        }
    }
}
