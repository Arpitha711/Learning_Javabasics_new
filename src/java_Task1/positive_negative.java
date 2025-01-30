package java_Task1;

import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n> 0){
            System.out.println("Positive");
        }else if(n==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}
