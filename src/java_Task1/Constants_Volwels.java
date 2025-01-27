package java_Task1;

import java.util.Locale;
import java.util.Scanner;

public class Constants_Volwels {
    public static void main(String[] args) {
//        Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter");
        String alpha = sc.nextLine();
        alpha = alpha.toLowerCase();
        int constants =0;
        int vowels =0;
        for (int i =0; i< alpha.length(); i++){
            char ch = alpha.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u'){
                vowels++;
            }else{
                constants++;
            }
        }
        System.out.println("vowels ="+vowels);
        System.out.println("constants =" +constants);
    }
}
