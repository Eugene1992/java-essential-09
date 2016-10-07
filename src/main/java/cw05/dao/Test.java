package cw05.dao;

/**
 * Created by evgeniy on 07/10/16.
 */
public class Test {
    public static void main(String[] args) {
        EmployeeDAO arraySource = new EmployeeArrayDAOImpl();
        EmployeeDAO textFileSource = new EmployeeTextFileDAOImpl();
        EmployeeDAO db = new EmployeeTextFileDAOImpl();
        Employee richestEmployee = getMaxSalaryEmployee(db);
    }

    static Employee getMaxSalaryEmployee(EmployeeDAO dataSource) {
        Employee[] employees = dataSource.getAll();
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }
}
