package Feb7_task;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product =1;
        for(int i=1;i<=10;i++){
            product = n*i;
            System.out.println(n+" * "+i+" = "+product);
        }
        int j=1;
        while(j<=10){
            product = n*j;
            System.out.println(n+" * "+j+" = "+product);
            j++;
        }
    }
}
