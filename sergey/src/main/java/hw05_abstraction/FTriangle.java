package hw05_abstraction;

/**
 * Created by User on 10/9/2016.
 */
public class FTriangle extends Triangular {

    public FTriangle(double side, double height) {
        super(side, height);
    }

    @Override
    public double getArea() {
        return 0.5 * super.side * super.height;
    }
}
