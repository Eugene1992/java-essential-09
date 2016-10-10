package cw06;

import java.util.ArrayList;

/**
 * Created by evgeniy on 10/10/16.
 */
public class TestRemover {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);

        /*for (int i = 3; i <= 6; i++) {
            numbers.remove(i);
        }*/

        /*for (int i = 0; i <= 4; i++) {
            numbers.remove(3);
        }*/

        for (int i = 7; i >= 3; i--) {
            numbers.remove(i);
        }

        System.out.println(numbers);


    }
}
