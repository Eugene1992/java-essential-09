package hw05_abstraction;

/**
 * Created by User on 10/9/2016.
 */
public class FRectangle extends Quadrangle {
    private double sideB;

    public FRectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return super.side * this.sideB;
    }
}
