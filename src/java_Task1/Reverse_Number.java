package java_Task1;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for(int i=num; i >0 ; i++){
           int digit = i%10;
            System.out.print(digit);
        }
    }
}
