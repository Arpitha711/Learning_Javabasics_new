package jan30_task;

import java.util.Scanner;

public class character_is_alphabet {
    public static void main(String[] args) {
        //char c = 'b';
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if((c>='A' && c<='Z') || (c>='a' && c<='z')){
            System.out.println("Charter is an alphabet");
        }else{
            System.out.println("Not an alphabet");
        }
    }
}
