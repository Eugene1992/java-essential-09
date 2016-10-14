package cw10;

public class FinalizeTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            Human human = new Human("Ivan", 24, true, new Address("Ukraine"));
            human = null;
            System.gc();
        }

        System.out.println(Human.DIE_COUNT);
    }
}
