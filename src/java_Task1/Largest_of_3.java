package java_Task1;

public class Largest_of_3 {
    public static void main(String[] args) {

        int n1 = 70;
        int n2 = 120;
        int n3 = 50;

        int largest = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(largest);


    }
}
