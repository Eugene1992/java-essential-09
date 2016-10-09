package hw05_abstraction;

/**
 * Created by User on 10/9/2016.
 */
public class FSquare extends Quadrangle {

    public FSquare(double side) {
        super(side);
    }

    @Override
    public double getArea() {
        return Math.pow(super.side, 2);
    }
}
