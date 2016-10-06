package cw04.init_order;

/**
 * Где можно инициилизировать статические/нестатические поля?
 * Каков порядок вызова конструкторов и блоков инициализации двух классов:
 * потомка и его предка?
 */
public class A {
    static {
        System.out.println("Static init block from A");
    }

    {
        System.out.println("Non static init block from A");
    }

    public A() {
        System.out.println("Constructor A");
    }
}
