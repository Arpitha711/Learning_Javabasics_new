package jan30_task;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return  true;
    }
}
