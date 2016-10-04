package cw02;

public class Employee {
    private String name;
    private int salary;
    private int luckyNumber;

    public Employee(String name,
                    int salary,
                    int luckyNumber) {
        this.name = name;
        this.salary = salary;
        this.luckyNumber = luckyNumber;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.luckyNumber = 7;
    }

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return luckyNumber;
    }

    public void setNumber(int number) {
        this.luckyNumber = number;
    }

    public void f() {
        f1();
    }

    public void f(int k) {
        f1();
    }

    public void f(String k) {
        f1();
    }

    public void f(String k, int s) {
        f1();
    }

    public void f(int s, String k) {
        f1();
    }

    private void f1() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void f2() {
        f1();
    }
}
