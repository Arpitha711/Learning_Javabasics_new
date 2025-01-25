package conditions_loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab033_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100){
            System.out.println("A");
        } else if (score >= 80 && score <=89) {
            System.out.println("B");
        } else if(score >= 70 && score <= 79){
            System.out.println("C");
        } else if(score >= 60 && score <= 69){
            System.out.println("D");
        } else if(score > 100 || score <= 0){
            System.out.println("Enter valid score");
        } else {
            System.out.println("Fail");
        }
    }
}
