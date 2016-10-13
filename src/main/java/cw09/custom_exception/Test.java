package cw09.custom_exception;

public class Test {
    public static void main(String[] args) {
        Human human = new Human();
        try {
            human.setAge(-12);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
    }
}
