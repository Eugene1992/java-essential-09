package cw09;

public class CatchFinallyReturnTest {
    public static void main(String[] args) {
        System.out.println(f());
    }

    static int f() {
        try {
            System.out.println(10 / 0);
            return 0;
        } finally {
            return 1;
        }
    }
}
