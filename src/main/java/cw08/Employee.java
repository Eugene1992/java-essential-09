package cw08;

public class Employee {
    private String name;
    private int age;
    private Country country;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, Country country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void walk() {
        System.out.println(name + " is walking now...");
    }
}
