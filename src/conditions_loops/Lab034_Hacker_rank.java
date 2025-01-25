package conditions_loops;

import java.util.Scanner;

public class Lab034_Hacker_rank {
    public static void main(String[] args) {
        //Triangle classifier
        //Acute - all sides are equal
        //Iscocelse - 2 sides are equal
        //Scalene - all side not equal

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1");
        double side1 = sc.nextDouble();
        System.out.println("Enter side2");
        double side2 = sc.nextDouble();
        System.out.println("Enter side3");
        double side3 = sc.nextDouble();

        if (side1 <=0 || side2 <=0 || side3 <=0){
            System.out.println("Enter valid side");
        }
        else {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
