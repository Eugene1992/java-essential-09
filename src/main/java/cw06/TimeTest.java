package cw06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evgeniy on 10/10/16.
 */
public class TimeTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000; i++) {
            list.add(100);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
