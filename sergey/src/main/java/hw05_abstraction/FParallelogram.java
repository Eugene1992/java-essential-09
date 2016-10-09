package hw05_abstraction;

/**
 * Created by User on 10/9/2016.
 */
public class FParallelogram extends Quadrangle {
    private double height;

    public FParallelogram(double side, double height) {
        super(side);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.side * this.height;
    }

}
