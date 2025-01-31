package jan30_task;

public class Triangle_Validation {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (a+b>c && a+c>b && b+c>a){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid triangle");
        }
    }
}
