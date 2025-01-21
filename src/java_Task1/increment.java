package java_Task1;

public class increment {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(++a + a++ + a++);
                        // 11 + 11 + 12

        int b = 20;

        System.out.println(--b + b++ + b--);
                   //19 + 19 + 20

    }
}
