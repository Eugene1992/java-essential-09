package cw05.interfaces;

/**
 * Created by evgeniy on 07/10/16.
 */
public class Test {
    public static void main(String[] args) {
        Movable human = new Human(30);
        Movable car = new Car(200);
        Movable wind = new Wind(100);
        Movable cat = new Cat(40);

        human.defaultMethod();
        Movable.staticMethod();

        printDistances(3, human, car, wind, cat);
    }

    static void printDistances(int hours, Movable... movables) {
        for (Movable movable : movables) {
            System.out.println(movable.getDistance(hours));
        }
    }
}
