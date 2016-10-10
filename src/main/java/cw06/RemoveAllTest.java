package cw06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by evgeniy on 10/10/16.
 */
public class RemoveAllTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("" + i);
        }
        list.add("7");
        list.add("7");
        list.add("4");

        List<String> removerValues = Arrays.asList("2", "4", "7");
        System.out.println(list);
        System.out.println(removerValues);
        list.removeAll(removerValues);
        System.out.println(list);
        System.out.println(list.contains("8"));
        System.out.println(list.indexOf("8"));
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String cur = iterator.next();
            list.remove(cur);
        }

     }
}
