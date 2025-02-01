package jan31_task;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        double salary = sc.nextDouble();
        System.out.println("Enter experience");
        float exp = sc.nextFloat();

        if(exp<1){
            System.out.println("No bonus");
        }else if(exp>=1 && exp<=3){
            System.out.println(salary*5/100);
        }else if(exp>=4 && exp<=6){
            System.out.println(salary*10/100);
        }else{
            System.out.println(salary*15/100);
        }
    }
}
