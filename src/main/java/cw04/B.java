package cw04;

/**
 * Могут ли нестатические методы перегрузить статические?
 */
public class B extends A {

    public void f() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d); // d is private!
    }
}
