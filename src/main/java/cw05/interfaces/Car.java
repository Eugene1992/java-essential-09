package cw05.interfaces;

import java.io.Serializable;

/**
 * Created by evgeniy on 07/10/16.
 */
public class Car implements Movable, Serializable, Cloneable {

    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public int getDistance(int hours) {
        return speed * hours;
    }
}
