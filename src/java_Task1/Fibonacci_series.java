package java_Task1;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int a =0;
        int b =1;
        int sum=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i =2; i <=n; i++){
           sum = a+b ;
            System.out.print(sum+ " ");
            a=b;
            b=sum;
        }
    }
}
