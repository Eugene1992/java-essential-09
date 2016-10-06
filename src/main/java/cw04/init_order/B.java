package cw04.init_order;

/**
 * Created by evgeniy on 06/10/16.
 */
public class B extends A {
    static {
        System.out.println("Static init block from B");
    }

    {
        System.out.println("Non static init block from B");
    }

    public B() {
        System.out.println("Constructor B");
    }
}
