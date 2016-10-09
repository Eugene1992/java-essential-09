package hw05_abstraction;

/**
 * Created by User on 10/9/2016.
 */
public class FTrapeze extends Quadrangle {
    private double sideB;
    private double height;

    public FTrapeze(double sideA, double sideB, double height) {
        super(sideA);
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((super.side + this.sideB) / 2) * this.height;
    }
}
