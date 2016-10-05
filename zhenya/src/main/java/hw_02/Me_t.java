package hw_02;

/**
 * Created by Helen on 04.10.16.
 */
public class Me_t {
    public People humanResource(People[] humans) {
        int money = humans[0].incomes;
        People maxIncomes = humans[0];
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].incomes > money) {
                money = humans[i].incomes;
                maxIncomes = humans[i];
            }

        }
        return maxIncomes;
    }
}
