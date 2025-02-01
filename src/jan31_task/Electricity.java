package jan31_task;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of units");
        double units = sc.nextDouble();

        if (units<=100){
            double amount = 0.5 * units;
            System.out.println(amount);
        }else if(units>100 && units<=200){
            double amount = 0.75 * units;
            System.out.println(amount);
        }else if(units>200 && units<=300) {
            double amount = 1.2 * units;
            System.out.println(amount);
        }else{
            double amount = 1.5 * units;
            System.out.println(amount);
        }

    }
}
