package cw07.inner;

import java.io.Serializable;

/**
 * - внутренние  inner   non-static
 * - вложенные   nested  static
 * - local
 * - anonymous
 */
public class Ship extends SuperShip {
    public int k = 10;
    private int p = 12;
    static int s = 10;
    protected int pr = 12;
    int pp = 111;
    private Engine engine = new Engine(10);

    public class Engine extends SuperEngine implements Serializable {

        public int ns;

        public Engine(int ns) {
            this.ns = ns;
        }

        public void start() {
            System.out.println(k);
            System.out.println(p);
            System.out.println(s);
            System.out.println(pr);
            System.out.println(pp);

            System.out.println(superEngineField);
            System.out.println(superShipField);
            superEngineMethod();
            superShipMethod();
        }

        public void set(int value) {
            p = value;
        }
    }

    public void move() {
        System.out.println(engine.superEngineField);
        System.out.println(superShipField);
        engine.superEngineMethod();
        superShipMethod();

    }

    public int getP() {
        return p;
    }

    public static void main(String[] args) {
        Ship.Engine engine2 = new Ship().new Engine(10);

    }
}
