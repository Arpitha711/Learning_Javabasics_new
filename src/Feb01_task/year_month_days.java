package Feb01_task;

import java.util.Scanner;

public class year_month_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days");
        int days = sc.nextInt();
        int year = days/365;
        int days_left = days-(year*365);
        int months = days_left/30;
        int left = days_left-(months*30);

        System.out.println(days +" ="+ year+"year "+ months+"months "+ left+"days ");
    }
}
