package cw09.override_throws;

import java.io.FileInputStream;
import java.io.InputStream;

public class A {

    public void f() throws Exception {
        InputStream is = new FileInputStream("c://temp.txt");
    }
}
