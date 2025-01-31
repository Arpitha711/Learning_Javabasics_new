package jan30_task;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = sc.nextInt();

        if(marks> 100 || marks<0){
            System.out.println("Enter valid marks");
        }else if(marks<=100 && marks>=90){
            System.out.println("A");
        }else if(marks<=89 && marks>=80){
            System.out.println("B");
        }else if(marks<=79 && marks>=70){
            System.out.println("C");
        }else if(marks<=69 && marks>=60){
            System.out.println("D");
        }else if(marks<=59 && marks>=50){
            System.out.println("E");
        }else{
            System.out.println("Fail");
        }
    }
}
