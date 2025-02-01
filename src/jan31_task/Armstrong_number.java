package jan31_task;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        //151 - 1cube + 5cube + 1cube
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        double Armstrong =0;
        int digits = String.valueOf(n).length();
        double original = n;

        while(n>0){
            int digit = n%10;
            Armstrong = Armstrong + Math.pow(digit, digits);
            n = n/10;
        }
        System.out.println(Armstrong);

        if (original == Armstrong){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not an armstrong");
        }
    }
}
