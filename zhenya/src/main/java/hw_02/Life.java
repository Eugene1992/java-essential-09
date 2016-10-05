package hw_02;

/**
 * Created by Helen on 04.10.16.
 */
public class Life {
    public static void main(String[] args) {
        People human1 = new People();
        human1.name = "Ban";
        human1.car = "Volvo";
        human1.incomes = 12000;

        People human2 = new People();
        human2.name = "Ban";
        human2.car = "Mercedes";
        human2.incomes = 9000;

        People human3 = new People();
        human3.name = "Charly";
        human3.car = "BMW";
        human3.incomes = 10000;

        People[] humans = {human1, human2, human3};

        Me_t d = new Me_t();


        System.out.println(d.humanResource(humans).incomes);
    }


}