package cw10;

public class EqualsTest {
    public static void main(String[] args) {
        Human human1 = new Human("Ivan", 24, true, new Address("Ukraine"));
        Human human2 = new Human("Ivan", 24, true, new Address("Ukraine"));
        System.out.println(human1.equals(human1));
        System.out.println(human1.equals(human2));
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
    }
}
