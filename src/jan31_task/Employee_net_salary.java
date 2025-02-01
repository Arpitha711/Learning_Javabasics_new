package jan31_task;

import java.util.Scanner;

public class Employee_net_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee net salary");
        double salary = sc.nextDouble();

        System.out.println("Basic pay = " + salary);
        System.out.println("HRA = "+ salary*40/100);
        System.out.println("DA = "+ salary*5/100);
        System.out.println("Tax Deductions = " + salary*18/100);
    }
}
