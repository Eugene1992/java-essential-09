package cw09;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestCatch {
    public static void main(String[] args) {

        try {
            // checked
            InputStream is = new FileInputStream("c://temp.txt");
            // unchecked
            System.out.println(10 / 0);
            System.out.println("After exception...");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}
