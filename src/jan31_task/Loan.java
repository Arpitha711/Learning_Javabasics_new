package jan31_task;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter Salary");
        double salary = sc.nextDouble();
        System.out.println("Enter credit score");
        int score = sc.nextInt();

        if((age>=18 && age<=80) && (salary>=30000) && (score>=650 && score<=850)){
            System.out.println("Loan is approved");
        }else{
            System.out.println("Not eligible for loan");
        }
    }
}
