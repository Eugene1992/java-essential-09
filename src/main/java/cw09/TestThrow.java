package cw09;

public class TestThrow {
    public static void main(String[] args) {
        /*try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        g();
    }

    // checked
    public static void f() throws Exception {
        throw new Exception();
    }

    // unchecked
    public static void g() throws NullPointerException {
        throw new NullPointerException();
    }
}
