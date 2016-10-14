package cw10;

public class CloneTest {
    public static void main(String[] args) {
        Human human = new Human("Ivan", 24, true, new Address("Ukraine"));
        Human clonedHuman = null;
        try {
            clonedHuman = (Human) human.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        /*System.out.println(human.getAddress().getCountry());
        System.out.println(clonedHuman.getAddress().getCountry());

        clonedHuman.getAddress().setCountry("USA");
        System.out.println(human.getAddress().getCountry());*/

        Human clonedHuman2 = new Human(human);
        System.out.println(clonedHuman2);
        clonedHuman2.getAddress().setCountry("USA");
        System.out.println(human.getAddress().getCountry());
    }
}
