package cw04.polymorphism;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeVoice() {
        System.out.println("Cat " + name + " said meouww!");
    }

    public void catMethod() {

    }
}
