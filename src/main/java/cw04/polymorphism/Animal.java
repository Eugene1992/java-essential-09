package cw04.polymorphism;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeVoice() {
        System.out.println("Animal " + name + " said something...");
    }

    public void animalMethod() {

    }
}
