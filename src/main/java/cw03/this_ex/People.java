package cw03.this_ex;

/**
 * Created by evgeniy on 05/10/16.
 */
public class People {
    private String name;
    private int age;
    private double height;
    private double weight;

    public People(String name) {
        this(name, 0);
    }

    public People(String name, int age) {
        this(name, age, 0.0);
    }

    public People(String name, int age, double height) {
        this(name, age, height, 0.0);
    }

    public People(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        People people1 = new People("Zhenya");
        People people2 = new People("Zhenya", 2);
        People people3 = new People("Zhenya", 2, 100.0);
        People people4 = new People("Zhenya", 2, 100.0, 2000.0);

//        People people5 = new People();
    }
}
