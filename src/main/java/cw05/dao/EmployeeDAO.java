package cw05.dao;

/**
 * Created by evgeniy on 07/10/16.
 */
public interface EmployeeDAO {

    Employee get(int id);

    Employee[] getAll();

    void add(Employee employee);

    void update(Employee employee);

    void delete(int id);
}
