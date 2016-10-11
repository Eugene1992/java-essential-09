package cw07.nested;

import cw07.inner.SuperShip;

/**
 * Created by evgeniy on 11/10/16.
 */
public class Ship extends SuperShip {
    public int pub = 10;
    private int priv = 12;
    static int stat = 10;
    private static int privstat = 10;
    protected int prot = 12;
    int packp = 111;

    public static class Engine {
        public int k;

        public void nsm() {
//            System.out.println(pub);
            System.out.println(k);
            System.out.println(stat);
            System.out.println(privstat);
        }

        public static void sm() {
//            System.out.println(pub);
//            System.out.println(k);
            System.out.println(stat);
            System.out.println(privstat);
        }
    }
}
