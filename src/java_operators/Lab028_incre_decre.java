package java_operators;

public class Lab028_incre_decre {
    public static void main(String[] args) {
        //Increment ++i i++
        //Decrement --i i--
        int i =6;
        System.out.println(i++);//First prints and then increases
        System.out.println(i);
        System.out.println(++i);//Increases and then prints

        int a= 10;
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        int b = 10;
        int res = ++b;
        System.out.println(b);
        System.out.println(res);
    }
}
