package cw09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestThrows {
    public static void main(String[] args) {
        try {
            f();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    static void f() throws FileNotFoundException {
        g();
    }

    static void g() throws FileNotFoundException {
        InputStream is = new FileInputStream("c://temp.txt");
    }
}
