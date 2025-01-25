package conditions_loops;

import java.util.Scanner;

public class Lab031_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num%2 ==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        sc.close();
        //edge cases - where this cases can fail
        //float numbers, large integers
    }
}
