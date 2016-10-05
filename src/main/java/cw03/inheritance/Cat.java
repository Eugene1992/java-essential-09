package cw03.inheritance;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeVoice() {
        System.out.println(super.name + " said meouww!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 2);
        cat.parentMethod();
    }
}
