package Practice;

public class Practice004_Casting {
    public static void main(String[] args) {
        byte a = 89;
        int b = a; // Implicit
        int c = (int)a; //Explicit

        int n = 900;
        //byte n1 =n;//Not possible
        byte n1 = (byte)n;
        System.out.println(n1);

        int val  = 200;
//        byte b = val; // // Invalid - Implicit Casting narrowing is not allowed
        byte d = (byte)val; // // // Valid -> Explicit Casting -  allowed
        // Data Loss:
        System.out.println(d);

    }
}
