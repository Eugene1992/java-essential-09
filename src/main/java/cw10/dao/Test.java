package cw10.dao;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Hello");
//        strings.add(21);
//        strings.add(true);

        if (strings.get(0) instanceof String) {
            String s = (String) strings.get(0);
        }
    }
}
