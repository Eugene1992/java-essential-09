package hw06_ArrayList;

import java.util.List;

/**
 * Created by User on 10/10/2016.
 */
public class CollectionTime {
    private List<String> list;

    public CollectionTime(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return this.list;
    }


    public long add(int size, String data) {
        long startTime = System.currentTimeMillis();
        if (size <= 0) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            list.add(data);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long update(int size, String data) {
        long startTime = System.currentTimeMillis();
        if (size <= 0 || size > list.size()) return -1;
        for (int i = 0; i < size; i++) {
            list.set(i, data);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long delete(int startIndex, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.remove(startIndex);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
