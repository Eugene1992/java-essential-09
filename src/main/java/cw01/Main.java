package cw01;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println(employee1.name);
        System.out.println(employee1.salary);

        employee1.salary = 10000;
        employee1.name = "Boby";

        System.out.println(employee1.name);
        System.out.println(employee1.salary);

        Employee employee2 = new Employee();
        employee2.salary = 4000;
        employee2.name = "Vily";

        Employee employee3 = new Employee();
        employee3.salary = 3000;
        employee3.name = "Vova";

        Employee[] employees = {employee1, employee2, employee3};

        System.out.println(getMaxSalaryEmployee(employees).name);
    }

    static Employee getMaxSalaryEmployee(Employee[] employees) {
        int maxSalary = employees[0].salary;
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary > maxSalary) {
                maxSalary = employees[i].salary;
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }
}
