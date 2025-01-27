package java_Task1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check");
        String beta = sc.nextLine();
        beta = beta.toLowerCase();
        String reverse = "";
        for(int i=beta.length()-1; i>=0; i--){
            reverse = reverse + beta.charAt(i);
        }
        if(beta.equals(reverse)){
            System.out.println("Its palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}
