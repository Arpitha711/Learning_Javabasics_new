package java_Task1;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = sc.nextLine();
        String reverse = "";
        for (int i=alpha.length()-1; i >=0; i--){
            reverse = reverse + alpha.charAt(i);
        }
        System.out.println(reverse);
    }
}
