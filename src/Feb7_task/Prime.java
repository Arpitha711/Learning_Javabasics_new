package Feb7_task;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(prime(n)){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
    public static boolean prime(int n){
         for(int i =2; i<n;i++) {
             if (n % i == 0) {
                 return false;
             }
         }
         return true;
    }
}
