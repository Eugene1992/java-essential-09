package cw08;

import java.util.Comparator;

public class EmployeeByNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee first, Employee second) {
        if (first.getAge() > second.getAge()) {
            return 1;
        } else if (first.getAge() < second.getAge()) {
            return -1;
        } else {
            if (first.getName().compareTo(second.getName()) > 0) {
                return 1;
            }
            if (first.getName().compareTo(second.getName()) < 0) {
                return -1;
            }
            return 0;
        }
    }
}
