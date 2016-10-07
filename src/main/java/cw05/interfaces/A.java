package cw05.interfaces;

/**
 * Created by evgeniy on 07/10/16.
 */
public class A {

    interface M {

    }

    static void s(){
        System.out.println("hello!");
    }

    void ns(){
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        A a = new A();
        a = null;
        a.s();
    }
}
