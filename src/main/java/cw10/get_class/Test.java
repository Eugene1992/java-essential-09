package cw10.get_class;

import cw10.Human;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Test extends Object {
    public static void main(String[] args) {
        Human human = new Human("Ivan", 24, true, null);
        int[] arr = {1, 2, 3};
        List<Integer> integers = Arrays.asList(1, 2, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(integers);

        Class humanClass = human.getClass();
        System.out.println(human.getName());
        try {
            Field field = humanClass.getDeclaredField("name");
            field.setAccessible(true);
            System.out.println(field.get(human));
            field.set(human, "Sergey");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(human.getName());

    }

    static <T extends Cloneable> void f(List<? super Test> list) {

    }

}
