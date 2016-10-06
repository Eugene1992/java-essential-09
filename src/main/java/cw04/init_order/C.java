package cw04.init_order;

/**
 * Created by evgeniy on 06/10/16.
 */
public class C extends B {
    static {
        System.out.println("Static init block from C");
        s = 10;
//        ns = 10;
    }

    {
        System.out.println("Non static init block from C");
        s = 10;
        ns = 10;
    }

    int ns;
    static int s;

    public C() {
        System.out.println("Constructor C");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
