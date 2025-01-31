package jan30_task;

import java.util.Scanner;

public class smallest_of_2numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int n1 = sc.nextInt();
        System.out.println("Enter number2");
        int n2 = sc.nextInt();

        if(n1<n2){
            System.out.println(n1+" is smallest");
        }else{
            System.out.println(n2+" is smallest");
        }
    }
}
