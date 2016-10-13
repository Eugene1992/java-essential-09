package hw06_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 10/10/2016.
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        CollectionTime ob = new CollectionTime(list);

        System.out.println("List<String> list = new ArrayList<>();\n");
        //Create
        System.out.println("Add 10_000 has time " + ob.add(0,10_000, "create") + " ms");
        System.out.println("Add 100_000 has time " + ob.add(10_000,50_000, "create") + " ms");
        System.out.println("Add 1_000_000 has time " + ob.add(50_000,100_000, "create") + " ms");
        System.out.println();
        //Update
        System.out.println("Update 10_000 has time " + ob.update(0,10_000, "update") + " ms");
        System.out.println("Update 100_000 has time " + ob.update(10_000,50_000, "update") + " ms");
        System.out.println("Update 1_000_000 has time " + ob.update(50_000,100_000, "update") + " ms");
        System.out.println();
        //Delete
        System.out.println("Delete first 100_000 has time " + ob.delete(0, 10_000) + " ms");
        System.out.println("Delete middle 100_000 has time " + ob.delete(10_000, 50_000) + " ms");
        System.out.println("Delete end 100_000 has time " + ob.delete(ob.getList().size() - 30_000, 30_000) + " ms");
        System.out.println();

        List<String> linkedListList = new LinkedList<>();
        CollectionTime ob2 = new CollectionTime(linkedListList);

        System.out.println("List<String> linkedListList = new LinkedList<>();\n");
        //Create
        System.out.println("Add 10_000 has time " + ob2.add(0,10_000, "create") + " ms");
        System.out.println("Add 100_000 has time " + ob2.add(10_000,50_000, "create") + " ms");
        System.out.println("Add 1_000_000 has time " + ob2.add(50_000,100_000, "create") + " ms");
        System.out.println();
        //Update
        System.out.println("Update 10_000 has time " + ob2.update(0,10_000, "update") + " ms");
        System.out.println("Update 100_000 has time " + ob2.update(10_000,50_000, "update") + " ms");
        System.out.println("Update 1_000_000 has time " + ob2.update(50_000,100_000, "update") + " ms");
        System.out.println();
        //Delete
        System.out.println("Delete first 100_000 has time " + ob2.delete(0, 10_000) + " ms");
        System.out.println("Delete middle 100_000 has time " + ob2.delete(10_000, 50_000) + " ms");
        System.out.println("Delete end 100_000 has time " + ob2.delete(ob2.getList().size() - 30_000, 30_000) + " ms");
        System.out.println("\nEND");
    }
}
