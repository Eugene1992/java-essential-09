package cw04.polymorphism;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeVoice() {
        System.out.println("Dog " + name + " said woof!");
    }
}
