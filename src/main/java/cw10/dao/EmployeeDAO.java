package cw10.dao;

import java.util.List;

public interface EmployeeDAO {

    Employee get(int id);

    List<Employee> getAll();

    void create(Employee employee);

    void delete(int id);

    void update(Employee employee);
}
