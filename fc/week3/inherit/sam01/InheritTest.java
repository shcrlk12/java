package fc.week3.inherit.sam01;

public class InheritTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "김정원";

        System.out.println(p.name);

        Teacher t = new Teacher();
        t.name = "방소운";

        System.out.println(t.name);
    }
}
