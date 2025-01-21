package java_Task1;

public class max_num_userinput {
    public static void main(String[] args) {
        String n1 = args[0];
        int num1 = Integer.parseInt(n1);
        String n2 = args[1];
        int num2 = Integer.parseInt(n2);

        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
    }
}
