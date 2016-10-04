package cw02;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Zhenya", 15000, 7);
        Employee employee1 = new Employee();
        employee1.setSalary(15000);
        employee1.setName("Zhenya");
        employee1.setNumber(7);

        employee.setSalary(100000);
    }
}
