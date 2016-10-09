package hw05_abstraction;

/**
 * Created by User on 10/9/2016.
 */
public class FCircle extends Round {

    public FCircle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(super.radius, 2);
    }
}
