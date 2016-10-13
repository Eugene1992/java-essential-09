package cw09;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException | NullPointerException | Error e) {
            e.printStackTrace();
        }
    }
}
