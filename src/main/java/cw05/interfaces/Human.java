package cw05.interfaces;

/**
 * Created by evgeniy on 07/10/16.
 */
public class Human implements Movable {

    private int speed;

    public Human(int speed) {
        this.speed = speed;
    }

    @Override
    public int getDistance(int hours) {
        return speed * hours;
    }
}
