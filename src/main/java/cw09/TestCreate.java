package cw09;

import java.io.File;
import java.io.IOException;

public class TestCreate {
    public static void main(String[] args) {
        File file = new File("/home/temp.txt");
        try {
            file.setExecutable(true);
            file.setWritable(true);
            System.out.println(file.createNewFile());
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
