package cw06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add(1, "Second");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        String secondElement = list.get(1);
        list.add("Fourth");
        System.out.println(list);
        list.set(2, "Third");
        System.out.println(list);
        list.remove(2);
        list.add("Second2");
        System.out.println(list);
        list.remove("Second");
        System.out.println(list);

    }
}
