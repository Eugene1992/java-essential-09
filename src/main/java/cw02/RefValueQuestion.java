package cw02;

public class RefValueQuestion {

    public static void main(String[] args) {
       /* int k = 10;
        System.out.println(k);

        k = f(k + 100);
        System.out.println(k);*/

        Employee employee = new Employee();
        employee.setName("Zhenya");

        Employee employee1 = employee;
        Employee employee2 = employee1;

        employee1 = null;
        employee2 = null;

        System.out.println(employee.getSalary());
        k(employee);
        System.out.println(employee.getSalary());
    }

    static int f(int k) {
        k = 100;
        return k;
    }

    static void k(Employee e) {
        e.setSalary(10_000);
    }
}
