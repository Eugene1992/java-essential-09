package hw05_abstraction;

/**
 * Created by User on 10/9/2016.
 */
public abstract class Triangular extends Shape {
    protected double side;
    protected double height;

    public Triangular(double side, double height) {
        this.side = side;
        this.height = height;
    }
}
