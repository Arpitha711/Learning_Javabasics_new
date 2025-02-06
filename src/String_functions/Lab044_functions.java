package String_functions;

public class Lab044_functions {
    public static void main(String[] args) {
        String s1 = "arpitha";
        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1.concat(" M"));
        System.out.println(s1.contains("arp"));
        System.out.println(s1.equals("arpitha"));
        System.out.println(s1.equalsIgnoreCase("ARPITHA"));
        System.out.println(s1.indexOf('p'));
        System.out.println(s1.charAt(4));
        System.out.println(s1.replace('p','P'));

        String s2 = "Chaya@Devi@arpitha";
        String[] s3 = s2.split("@");
        System.out.println(s3[0]);
        System.out.println(s3[1]);
        System.out.println(s3[2]);

        System.out.println(s1.substring(0,3));

        System.out.println(s1.startsWith("A"));

        String s4 = "      Arpitha  Manjunath        ";
        System.out.println(s4.trim());//trims spaces from leading and trailing

        System.out.println(s1.compareTo("arpi"));

        StringBuilder stringbuilder = new StringBuilder("arpitha");
        System.out.println(stringbuilder.append("new"));
        //concat creates new string when concatenated
        //append modifies in same string when appended

        StringBuffer stringbuffer = new StringBuffer("Arpitha");
        stringbuffer.reverse();
        System.out.println(stringbuffer);


    }
}
