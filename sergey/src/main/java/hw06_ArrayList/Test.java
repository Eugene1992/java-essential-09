package hw06_ArrayList;

import java.util.ArrayList;

/**
 * Created by User on 10/10/2016.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        CollectionTime ob = new CollectionTime(list);

        //Create
        System.out.println("Add 10_000 has time " + ob.add(10_000, "create") + " ms");
        System.out.println("Add 100_000 has time " + ob.add(100_000, "data") + " ms");
        System.out.println("Add 1_000_000 has time " + ob.add(1_000_000, "data") + " ms");
        System.out.println();
        //Update
        System.out.println("Update 10_000 has time " + ob.update(10_000, "update") + " ms");
        System.out.println("Update 100_000 has time " + ob.update(100_000, "update") + " ms");
        System.out.println("Update 1_000_000 has time " + ob.update(1_000_000, "update") + " ms");
        System.out.println();
        //Delete
        System.out.println("Delete first 100_000 has time " + ob.delete(0, 100_000) + " ms");
        System.out.println("Delete middle 100_000 has time " + ob.delete(500_000, 100_000) + " ms");
        System.out.println("Delete end 100_000 has time " + ob.delete(ob.getList().size() - 100_000, 100_000) + " ms");
        System.out.println();
    }
}
