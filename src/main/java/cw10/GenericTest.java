package cw10;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add(1);
        list.add("dsd");
//        list.add(true);
        String s = list.get(1);
    }

    static <T> void print(T t) {
        for (int i = 0; i < 10; i++) {
            System.out.println(t);
        }
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
