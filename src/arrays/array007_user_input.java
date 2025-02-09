package arrays;

import java.util.Scanner;

public class array007_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] num = new int[size];
        for(int i =0; i< num.length;i++){
            System.out.println("Enter numbers");
            num[i]= sc.nextInt();
        }
        for(int i=0; i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
