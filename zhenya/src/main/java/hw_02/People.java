package hw_02;

/**
 * Created by Helen on 04.10.16.
 */
public class People {
    private String name;
    private String car;
    private int incomes;
    static String planet = "Earth";

    public static String getPlanet() {
        return planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getIncomes() {
        return this.incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public static void main(String[] args) {
        People people = new People();
        System.out.println(people.getName());
        people.setName("Zhenya");
        System.out.println(people.getName());

    }
}
