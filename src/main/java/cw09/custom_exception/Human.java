package cw09.custom_exception;

public class Human {
    private int age;

    public void setAge(int age) throws IllegalAgeException {
        if (age < 0) {
            throw new IllegalAgeException("Negative age value");
        }
        this.age = age;
    }
}
