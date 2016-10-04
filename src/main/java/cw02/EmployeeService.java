package cw02;

/**
 * Created by evgeniy on 04/10/16.
 */
public class EmployeeService {

    public Employee getMaxSalaryEmployee(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }
}
