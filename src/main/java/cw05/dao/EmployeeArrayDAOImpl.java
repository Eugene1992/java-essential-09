package cw05.dao;

/**
 * Created by evgeniy on 07/10/16.
 */
public class EmployeeArrayDAOImpl implements EmployeeDAO {
    private Employee[] employees = {
        new Employee(0, "Ivan", 20_000),
        new Employee(1, "Egor", 30_000),
        new Employee(2, "Oleg", 40_000)
    };

    @Override
    public Employee get(int id) {
        return employees[id];
    }

    @Override
    public Employee[] getAll() {
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees[employee.getId()] = employee;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }
}
