package cw04.polymorphism;

public class Duck extends Animal{

    public Duck(String name, int age) {
        super(name, age);
    }

    public void makeVoice() {
        System.out.println("Duck " + name + " said quack!");
    }
}
