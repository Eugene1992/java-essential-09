package cw08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    static {
        class A {

        }
    }

    public int field = 10;

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Zhenya", 23),
                new Employee("Sereja", 26),
                new Employee("Ivan", 32),
                new Employee("Anna", 32),
                new Employee("Kevin", 32),
                new Employee("Tom", 16)
        );
//        System.out.println(employees);

//        EmployeeByNameComparator comparator = new EmployeeByNameComparator();
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee first, Employee second) {
                return first.getAge() - second.getAge();
            }
        });

        //        System.out.println(employees);

        Employee employee1 = new Employee("A", 2){
            public int k = 10;

            @Override
            public void walk() {
                System.out.println(super.getName() + " is running now...");
                System.out.println(k);
                super.setName("");
            }

            void f() {
            }
        };
        employee1.walk();

        Employee employee2 = new Employee$1("A", 2);
        employee2.walk();

        final int f = 10; // final
        int ef = 10;      // effectively final

        class ByNameComparator implements Comparator<Employee> {
            private int s;

            public ByNameComparator(int s) {
                this.s = s;
            }

            public void f() {
                System.out.println(s);
                System.out.println(f);
                System.out.println(ef);
//                System.out.println(field);
            }

            @Override
            public int compare(Employee first, Employee second) {
                return first.getAge() - second.getAge();
            }
        }

        ByNameComparator comparator = new ByNameComparator(1);
    }


    static void anotherMethod() {
//        ByNameComparator comparator = new ByNameComparator();
    }
}
