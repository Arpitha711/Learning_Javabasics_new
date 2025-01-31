package jan30_task;

import java.util.Scanner;

public class ATM_Withdrawl {
    public static void main(String[] args) {
        int account_balance= 10000;
        Scanner sc = new Scanner(System.in);
        int withdrawl = sc.nextInt();

        if(withdrawl > 0 && (withdrawl%100 ==0) && withdrawl <10000){
            System.out.println("Withdrawl is successfull");
            int updated_balance = account_balance - withdrawl;
            System.out.println("Updated balance is "+ updated_balance);
        }else {
            System.out.println("Entered amount doesn't meet the conditions");
        }
    }
}
