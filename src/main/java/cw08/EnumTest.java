package cw08;

public class EnumTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", 45, Country.USA);
        Employee employee2 = new Employee("Ivan", 25, Country.UKRAINE);
        Employee employee3 = new Employee("Jack", 35, Country.USA);

        System.out.println(employee1.getCountry() == employee2.getCountry());
        System.out.println(employee1.getCountry() == employee3.getCountry());

        String tomCountry = employee1.getCountry().toString();
        System.out.println(tomCountry);

        System.out.println(Country.USA.getName());
    }
}
