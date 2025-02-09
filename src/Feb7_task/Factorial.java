package Feb7_task;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial =1;
        for (int i =n; i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        int fact1=1;
        int j =n;
        while(j>=1){
            fact1 = fact1 * j;
            j--;
        }
        System.out.println(fact1);
    }
}
