package cw08;

public class Employee$1 extends Employee {

    public Employee$1(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println(super.getName() + " is running now...");
    }
}
