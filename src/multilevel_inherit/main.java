package multilevel_inherit;

public class main {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.car();
        father f1 = new father();
        f1.home();
        grandfather g1 = new Son();
        g1.home();
    }
}
