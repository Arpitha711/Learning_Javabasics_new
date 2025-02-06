package String_functions;

public class Lab043_basics {
    public static void main(String[] args) {
        String s1 = "arpitha";//Stored in String constant pool
        String s2 = "arpitha";
        String s3 = new String("arpitha");//Creates in heap area

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
