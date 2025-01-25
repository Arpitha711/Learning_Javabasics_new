package conditions_loops;

import java.util.Scanner;

public class Lab035_Switch {
    public static void main(String[] args) {
        //Switch is used in web automation if which browser he wants to use chrome, firefox or edge
        //Java switch expressions must be of** byte, short, int, long(with its Wrapper type), enums and String**.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 to 7");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Not valid");
        }
    }
}
