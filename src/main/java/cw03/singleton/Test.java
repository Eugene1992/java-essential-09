package cw03.singleton;

import cw01.Employee;

/**
 * Created by evgeniy on 05/10/16.
 */
public class Test {
    public static void main(String[] args) {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        System.out.println(connection1 == connection2);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        System.out.println(employee1 == employee2);
    }
}
